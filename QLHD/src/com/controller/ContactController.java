package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Contact;

import bll.ContactBLL;

//@WebServlet("/ContactController")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int size = 6;
	private static String[] userData = new String[size];
	private static int column = -1;

	public ContactController() {
		super();
	}

	public static String[] getUserData() {
		return userData;
	}
	
	
	public void init() throws ServletException {
        // Do required initialization
    }

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//	}
//	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
			userData[0] = request.getParameter("hoten");
			userData[1] = String.valueOf(request.getParameter("dienthoai"));
			userData[2] = request.getParameter("noio");
			userData[3] = request.getParameter("tonghiep");
			userData[4] = request.getParameter("nganh");
			userData[5] = request.getParameter("email");
//		String url="";
			ContactBLL contactBLL = new ContactBLL();
			Contact contact = contactBLL.createContactObject();
			column = contactBLL.insert(contact);
			
			response.setContentType("text/html");
			 
	        PrintWriter out = response.getWriter();
	        String title = "Dang ky thanh cong";
	        String docType =
	           "<!doctype html public \"-//w3c//dtd html 4.0 " + 
	           "transitional//en\">\n";
	        
	        out.println(docType +
	                "<html>\n" +
	                   "<head><meta charset=\"UTF-8\">\n" +
	                   "<title>" + title + "</title></head>\n" +
	                   "<body bgcolor = \"#f0f0f0\">\n" +
	                   "<h1 align = \"center\">" + title + "</h1>\n" + 
	                   "So user dc them vao: " + column + "\n" +
	                   "<a href=\"/QLHD/\">" + "Back to Home Page" + "</a>" + 
	                   "</body>" + "</html>"
	                   );


	}

	
	


	 public void destroy() {
	        // do nothing.
	    }

}
