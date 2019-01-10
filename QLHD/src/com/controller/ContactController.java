package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Contact;

import bll.ContactBLL;

@WebServlet("/ContactController")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ContactBLL contactBLL=new ContactBLL();
    public ContactController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String command = request.getParameter("command");
		String url="";
		switch (command) {
		case "delete":
			int idd = Integer.valueOf(request.getParameter("id"));
			try {
				if(contactBLL.deleteContact(idd)==true) {
					url="/UserControllerRequet";
				}else {
					url="/UserControllerRequet";
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
	
		}
		RequestDispatcher rd= getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String name =request.getParameter("hoten");
		String address =request.getParameter("noio");
		String graduate =request.getParameter("tonghiep");
		String major =request.getParameter("nganh");
		String email =request.getParameter("email");

		String command = request.getParameter("command");
		String url ="";
		switch (command) {
		case "insert":
			int phone2 = Integer.valueOf(request.getParameter("dienthoai"));
			if(contactBLL.insertContact(new Contact(name, phone2, address, graduate, major, email))==true) {
				url="/index.jsp";
				System.out.println("them thanh cong");
			}else {
				url="/index.jsp";
			}
		case "update":
			
		break;
		}
		RequestDispatcher rd= getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
