package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserContactDAO;
import entity.*;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public HomeController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter printWriter = response.getWriter();
//		printWriter.println("Hello ");
		Cookie[] arrayCookie = request.getCookies() ;
		boolean isLogin = false ;
		if(arrayCookie.length != 0) {
			for (int i = 0; i < arrayCookie.length; i++) {
				if(arrayCookie[i].getName().equals("userName")) {
					isLogin = true;
					request.setAttribute("userName", arrayCookie[i].getValue());
				}
			}
		}
		
		request.setAttribute("isLogin",isLogin);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/index.jsp");
	
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserContact contact = new UserContact();
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String graduation = request.getParameter("graduation");
		String major = request.getParameter("major");
		String email = request.getParameter("email");
		contact.setFullName(name);
		contact.setAddress(address);
		contact.setPhone(request.getParameter("phone"));
		contact.setIsGraduation(graduation);
		contact.setMajor(major);
		contact.setEmai(email);
		UserContactDAO contactDAO = new UserContactDAO();
		boolean result = contactDAO.insert(contact);
		String messages = " Không thêm được";
		if(result) {
			messages = "Thêm thành công !";
		}
		PrintWriter printWriter = response.getWriter();
		printWriter.println(name);
		printWriter.println(address);
		printWriter.println(messages);
	}

}
