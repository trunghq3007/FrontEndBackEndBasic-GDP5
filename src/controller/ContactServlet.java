package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContactDAO;
import entity.Contact;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		ContactDAO contactDao = new ContactDAO();

		String username = request.getParameter("username");
		String phone = request.getParameter("phone");
		String tp = request.getParameter("tp");
		String totnghiep = request.getParameter("totnghiep");
		String nganh = request.getParameter("nganhhoc");
		String email = request.getParameter("email");

		try {
			if (username != null && phone != null && tp != null && totnghiep != null && nganh != null
					&& email != null) {
				Contact contact = new Contact(username, phone, tp, totnghiep, nganh, email);
				contactDao.insertContact(contact);
			}
			response.sendRedirect("index.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("index.jsp");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}
