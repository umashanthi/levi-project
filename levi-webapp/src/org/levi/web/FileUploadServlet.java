package org.levi.web;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class FileUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        if (ServletFileUpload.isMultipartContent(request)) {
            ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
            FileItem fileItem = null;
            try {
                List fileItemsList = servletFileUpload.parseRequest(request);
                //DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
                //diskFileItemFactory.setSizeThreshold(40960); /* the unit is bytes */
                //File repositoryPath = new File("src");
                //diskFileItemFactory.setRepository(repositoryPath);
                //servletFileUpload.setSizeMax(81920); /* the unit is bytes */
                Iterator it = fileItemsList.iterator();
                while (it.hasNext()) {
                    FileItem fileItemTemp = (FileItem) it.next();
                    if (fileItemTemp.isFormField()) {
                        response.getWriter().println("success");

                    } else {
                        fileItem = fileItemTemp;
                        if (fileItem != null) {
                            String fileName = fileItem.getName();
                            response.getWriter().println(fileName);
                            response.getWriter().println(fileItem.getContentType());
                            response.getWriter().println(fileItem.getFieldName());
                            response.getWriter().println(fileItem.getSize());
                            if (fileItem.getSize() > 0) {
                                fileName = fileItem.getName();
                                String dirName = "";
                                response.getWriter().println(dirName);
                                File saveTo = new File(dirName + fileName);
                                try {
                                    fileItem.write(saveTo);
                                    response.getWriter().println(saveTo.getAbsoluteFile());
                                    response.getWriter().println(saveTo.getCanonicalPath());
                                }
                                catch (Exception e) {
                                    response.getWriter().println(e.getMessage());
                                }
                            }
                        }

                    }
                }
            } catch (FileUploadException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }


        }
    }
}
