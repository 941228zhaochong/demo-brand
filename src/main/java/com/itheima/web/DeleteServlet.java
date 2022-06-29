 package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

 @WebServlet("/deleteServlet")
 public class DeleteServlet extends HttpServlet {
    private BrandService service = new BrandService();

     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //1.接收id
         String id = request.getParameter("id");
         //2.调用service删除
         service.delete(Integer.parseInt(id));
         //3.存储到request中

         //4.转发到update.jsp
         request.getRequestDispatcher("/selectAllServlet").forward(request,response);
     }

     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doGet(request, response);
     }
 }
