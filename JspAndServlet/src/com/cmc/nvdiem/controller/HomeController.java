package com.cmc.nvdiem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmc.nvdiem.constant.Constant;
import com.cmc.nvdiem.daoimpl.UserInfoDAOImpl;
import com.cmc.nvdiem.dto.UserInfo;

@WebServlet(name = "home", urlPatterns = { "/home" })
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/home.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fullName = request.getParameter("fullName");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String granduation = request.getParameter("granduation");
		String major = request.getParameter("major");
		String email = request.getParameter("email");

		UserInfo userInfo = new UserInfo(fullName, address, granduation, major, email, phone);
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		if (UserInfoDAOImpl.getInstance().insertUserInfo(userInfo) != 0) {
			writer.print(Constant.UserInfo.INSERT_USER_INFO_SUCCESS);
		} else {
			writer.print(Constant.UserInfo.INSERT_USER_INFO_FAIL);
		}
	}
}
