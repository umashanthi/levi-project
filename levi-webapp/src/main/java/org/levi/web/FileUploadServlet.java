package org.levi.web;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.levi.engine.ProcessEngine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class FileUploadServlet extends HttpServlet {
    String dirName = "";

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        if (ServletFileUpload.isMultipartContent(request)) {
            String processName = null;
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
                        processName = fileItemTemp.getString();
                    } else {
                        fileItem = fileItemTemp;
                        if (fileItem != null) {
                            String fileName = fileItem.getName();
                            /*response.getWriter().println(fileName);
                            response.getWriter().println(fileItem.getContentType());
                            response.getWriter().println(fileItem.getFieldName());
                            response.getWriter().println(fileItem.getSize());*/
                            if (fileItem.getSize() > 0) {
                                fileName = fileItem.getName();
                                String dirName = "LeviEngine/";
                                //response.getWriter().println(dirName);
                                File saveTo = new File(dirName + fileName);
                                try {
                                    fileItem.write(saveTo);
                                    /*response.getWriter().println(saveTo.getAbsoluteFile());
                                    response.getWriter().println(saveTo.getCanonicalPath());*/
                                    // if the file has been successfully uploaded, persist the processName
                                    saveProcessName(processName);
                                    ProcessEngine engine = (ProcessEngine) request.getSession().getAttribute("processEngine");
                                    String larPath = dirName+fileName;
                                    engine.deploy(larPath);
                                    response.sendRedirect("index.jsp?isUploadSuccess=true");
                                    //engine.deploy(larPath + "book_fig49.1.lar"); // Process:Figure-49
                                } catch (Exception e) {
                                    response.sendRedirect("index.jsp?isUploadSuccess=false");
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

    private void saveProcessName(String processName) throws IOException {
        FileOutputStream file = new FileOutputStream("LeviEngine/processes.txt", true);
        DataOutputStream out = new DataOutputStream(file);
        out.writeBytes(processName + "\n");
        out.flush();
        out.close();

    }


}
