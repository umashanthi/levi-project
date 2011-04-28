package org.levi.web;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.levi.engine.ProcessEngine;
import org.levi.engine.impl.ProcessEngineImpl;

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
                Iterator it = fileItemsList.iterator();
                while (it.hasNext()) {
                    FileItem fileItemTemp = (FileItem) it.next();
                    if (fileItemTemp.isFormField()) {
                        processName = fileItemTemp.getString();
                    } else {
                        fileItem = fileItemTemp;
                        if (fileItem != null) {

                            if (fileItem.getSize() > 0) { //uploaded file item
                                String fileName = fileItem.getName();
                                String dirName = "LeviEngine/";
                                File saveTo = new File(dirName + fileName);
                                try {
                                    fileItem.write(saveTo);   // stores the uploaded business archive (lar) to a location inside the server
                                    ProcessEngine engine = (ProcessEngine) request.getSession().getAttribute("processEngine");
                                    String larPath = dirName + fileName;
                                    engine.deploy(larPath);   // deploys the stored business archive (lar)
                                    response.sendRedirect("index.jsp?isUploadSuccess=true");
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

}
