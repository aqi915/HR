package com.hr.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hr.bean.User;
import com.hr.dao.UserDao;
import com.hr.dao.impl.UserDaoImpl;


public class UserServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		System.out.println("action：  "+action);
		// if (action.equals("addUser")) {
		// this.addUser(request, response);
		// }
//		 if (action.equals("showUser")) {
//		 this.showUser(request, response);
//		 }
		 if (action.equals("deleteuser")) {
		 this.deleteUser(request, response);
		 }
		 if (action.equals("updateuser")) {
		 this.updateuser(request, response);
		 }
		 if (action.equals("qxszxg")) {
			 this.qxszxg(request, response);
			 }
		 if (action.equals("qxszch")) {
		 this.qxszch(request, response);
		 }
		 if (action.equals("qxsz")) {
//		 this.modifyUser(request, response); // qxsz.html
		 this.qxsz(request, response);	 
		 }
		if (action.equals("loginCheck")) {
			this.loginCheck(request, response);
		}
	}
	private void deleteUser(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		UserDao dao = new UserDaoImpl();
		int userid = 0;
		if(!"".equals(request.getParameter("userid")) && null != request.getParameter("userid")){
			userid=Integer.parseInt(request.getParameter("userid"));
		}
		dao.deleteUser(userid);
		request.getRequestDispatcher("./userservlet?action=qxsz").forward(request, response);
	}
	private void updateuser(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		UserDao dao = new UserDaoImpl();
		int userid = 0;
		if(!"".equals(request.getParameter("userid")) && null != request.getParameter("userid")){
			userid=Integer.parseInt(request.getParameter("userid"));
		}
		String userxm= request.getParameter("userxm");
		String usermm= request.getParameter("usermm");
		String userqx= request.getParameter("userqx");
		User user = new User();
		user.setygh(userid);
		user.setxm(userxm);
		user.setmm(usermm);
		user.setQx(userqx);
		System.out.println("updateuser");
		dao.updateUser(user);
		request.getRequestDispatcher("./userservlet?action=qxsz").forward(request, response);
//		request.getRequestDispatcher("./qxszck.jsp")
//		.forward(request, response);
	}
	private void qxszxg(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		UserDao dao = new UserDaoImpl();
		int userid = 0;
		if(!"".equals(request.getParameter("userid")) && null != request.getParameter("userid")){
			userid=Integer.parseInt(request.getParameter("userid"));
		}
		User user = dao.selectUserId(userid);
		request.setAttribute("user", user);
		request.getRequestDispatcher("./qxszxg.jsp")
				.forward(request, response);
	}
	private void qxszch(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		UserDao dao = new UserDaoImpl();
		int userid = 0;
		if(!"".equals(request.getParameter("userid")) && null != request.getParameter("userid")){
			userid=Integer.parseInt(request.getParameter("userid"));
		}
		User user = dao.selectUserId(userid);
		request.setAttribute("user", user);
		request.getRequestDispatcher("./qxszck.jsp")
				.forward(request, response);
	}
	private void qxsz(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		UserDao dao = new UserDaoImpl();
		List<User> users = dao.selectUserList();
		request.setAttribute("users", users);
		request.getRequestDispatcher("./qxsz.jsp")
				.forward(request, response);
	}
	private void loginCheck(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String xm = request.getParameter("username");
		String mm = request.getParameter("password");
		System.out.println("username+password"+xm+mm);
		String info = null;
		UserDao dao = new UserDaoImpl();
		User user = dao.checkLogin(xm, mm);
		if (null != user) {
			int qx = Integer.parseInt(user.getQx());
			HttpSession session = request.getSession();
			session.setAttribute("xm", xm);
			session.setAttribute("user", user);
			session.setAttribute("qx", qx);
			List<User> userList=dao.selectUserList();
			request.setAttribute("ygzs", userList.size());
			if (qx == 1) {
				request.getRequestDispatcher("./dashboard.jsp").forward(request, response);
			} else if (qx == 2) {
				request.getRequestDispatcher("./dashboard.jsp").forward(request, response);
			}
		} else {
			info = "用户名密码不对，或者帐号已被锁，请重新登录！";
			request.setAttribute("info", info);
			request.getRequestDispatcher("./Login.jsp").forward(request,
					response);
		}
	}

}
