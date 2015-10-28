package com.hr.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.bean.Jcxxb;
import com.hr.bean.User;
import com.hr.bean.Ygxxb;
import com.hr.dao.JcxxbDao;
import com.hr.dao.UserDao;
import com.hr.dao.impl.JcxxbDaoImpl;
import com.hr.dao.impl.UserDaoImpl;

public class JcxxbServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		System.out.println("actionJcxxb：  1" + action);
		if (action.equals("addJcxxb")) {
			this.addJcxxb(request, response);
		}
		if (action.equals("deletejcxxb")) {
			this.deletejcxxb(request, response);
		}
		if (action.equals("updatejcxxb")) {
			this.updatejcxxb(request, response);
		}
		if (action.equals("jcxxwhxg")) {
			this.jcxxwhxg(request, response);
		}
		if (action.equals("jcxxwh")) {
			this.jcxxwh(request, response);
		}
		if (action.equals("jcxxcxxq")) {
			this.jcxxcxxq(request, response);
		}
		if (action.equals("jcxxcx")) {
			this.jcxxcx(request, response);
		}
	}

	private void addJcxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		JcxxbDao dao = new JcxxbDaoImpl();
		boolean flag = false;
		float fjgz = 0;
		if (!"".equals(request.getParameter("Jcxxbbmh"))
				&& null != request.getParameter("Jcxxbbmh")) {
			fjgz = Float.parseFloat(request.getParameter("Jcxxbfjgz"));
		}
		String xm = request.getParameter("Jcxxbxm");
		String jcrq = request.getParameter("Jcxxbjcrq");
		String jclb = request.getParameter("Jcxxbjclb");

		Jcxxb Jcxxb = new Jcxxb(xm, jclb, fjgz, jcrq);
		flag = dao.insertJcxxb(Jcxxb);
		if (flag == true) {
			User user = new User();
			user.setxm(xm);
			user.setmm("123456");
			user.setQx("2");
			UserDao userdao = new UserDaoImpl();
			userdao.insertUser(user);
			request.getRequestDispatcher("./Jcxxbservlet?action=cxygxx")
					.forward(request, response);
		}
		request.getRequestDispatcher("./error.jsp").forward(request, response);
	}

	private void deletejcxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		JcxxbDao dao = new JcxxbDaoImpl();
		int jcxxbid = 0;
		if (!"".equals(request.getParameter("jcxxbid"))
				&& null != request.getParameter("jcxxbid")) {
			jcxxbid = Integer.parseInt(request.getParameter("jcxxbid"));
		}
		System.out.println("好了");
		System.out.println(jcxxbid);
		dao.deleteJcxxb(jcxxbid);
		request.getRequestDispatcher("./JcxxbServlet?action=jcxxcx").forward(
				request, response);

	}

	private void updatejcxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		JcxxbDao dao = new JcxxbDaoImpl();
		boolean flag = false;
		float fjgz = 0;
		int jcxxbid = 0;
		if (!"".equals(request.getParameter("jcxxbid"))
				&& null != request.getParameter("jcxxbid")) {
			jcxxbid = Integer.parseInt(request.getParameter("jcxxbid"));
		}
		if (!"".equals(request.getParameter("jcxxbfjgz"))
				&& null != request.getParameter("jcxxbfjgz")) {
			fjgz = Float.parseFloat(request.getParameter("jcxxbfjgz"));
		}
		String xm = request.getParameter("jcxxbxm");
		String jcrq = request.getParameter("jcxxbjcrq");
		String jclb = request.getParameter("jcxxbjclb");



		Jcxxb Jcxxb = new Jcxxb(jcxxbid, xm, jclb, fjgz, jcrq);
		dao.updateJcxxb(Jcxxb);
		request.getRequestDispatcher("./JcxxbServlet?action=jcxxcx").forward(
				request, response);
	}

	private void jcxxwhxg(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		JcxxbDao dao = new JcxxbDaoImpl();
		int jcxxbid = 0;
		if (!"".equals(request.getParameter("jcxxbid"))
				&& null != request.getParameter("jcxxbid")) {
			jcxxbid = Integer.parseInt(request.getParameter("jcxxbid"));
		}
		Jcxxb jcxxb = dao.selectJcxxbId(jcxxbid);
		request.setAttribute("jcxxb", jcxxb);
		request.getRequestDispatcher("./jcxxwhxg.jsp").forward(request,
				response);
	}

	private void jcxxwh(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JcxxbDao dao = new JcxxbDaoImpl();
		List<Jcxxb> jcxxbs = dao.selectJcxxbList();
		request.setAttribute("jcxxbs", jcxxbs);
		request.getRequestDispatcher("./jcxxwh.jsp").forward(request, response);
	}

	private void jcxxcxxq(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JcxxbDao dao = new JcxxbDaoImpl();
		int jcxxbid = 0;
		if (!"".equals(request.getParameter("jcxxbid"))
				&& null != request.getParameter("jcxxbid")) {
			jcxxbid = Integer.parseInt(request.getParameter("jcxxbid"));
			Jcxxb jcxxb = dao.selectJcxxbId(jcxxbid);
			request.setAttribute("jcxxb", jcxxb);
			request.getRequestDispatcher("./jcxxcxxq.jsp").forward(request,
					response);
		} else {
			request.getRequestDispatcher("./error.jsp").forward(request,
					response);
		}

	}

	private void jcxxcx(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JcxxbDao dao = new JcxxbDaoImpl();
		List<Jcxxb> jcxxbs = dao.selectJcxxbList();
		request.setAttribute("jcxxbs", jcxxbs);
		request.getRequestDispatcher("./jcxxcx.jsp").forward(request, response);
	}

}
