package com.hr.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.bean.Ygzwxxb;
import com.hr.bean.User;
import com.hr.bean.Ygxxb;
import com.hr.dao.YgzwxxbDao;
import com.hr.dao.UserDao;
import com.hr.dao.impl.YgzwxxbDaoImpl;
import com.hr.dao.impl.UserDaoImpl;

public class YgzwxxbServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		System.out.println("actionYgzwxxb：  1" + action);
		if (action.equals("addYgzwxxb")) {
			this.addYgzwxxb(request, response);
		}
		if (action.equals("deleteygzwxxb")) {
			this.deleteYgzwxxb(request, response);
		}
		if (action.equals("updateygzwxxb")) {
			this.updateYgzwxxb(request, response);
		}
		if (action.equals("zwxxwhxg")) {
			this.zwxxwhxg(request, response);
		}
		if (action.equals("jcxxwh")) {
			this.jcxxwh(request, response);
		}
		if (action.equals("ygdddd")) {
			this.ygdddd(request, response);
		}
		if (action.equals("zwxxwh")) {
			this.zwxxwh(request, response);
		}
	}

	private void addYgzwxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgzwxxbDao dao = new YgzwxxbDaoImpl();
		boolean flag = false;
		int ygzwxxbid = 0;
		if (!"".equals(request.getParameter("ygzwxxbid"))
				&& null != request.getParameter("ygzwxxbid")) {
			ygzwxxbid = Integer.parseInt(request.getParameter("ygzwxxbid"));
		}
		
		String zwmc = request.getParameter("ygzwxxbzwmc");

		Ygzwxxb ygzwxxb = new Ygzwxxb(ygzwxxbid,zwmc);
		flag = dao.insertYgzwxxb(ygzwxxb);
			request.getRequestDispatcher("./YgzwxxbServlet?action=zwxxwh")
					.forward(request, response);
	}

	private void deleteYgzwxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		YgzwxxbDao dao = new YgzwxxbDaoImpl();
		int ygzwxxbid = 0;
		if (!"".equals(request.getParameter("ygzwxxbid"))
				&& null != request.getParameter("ygzwxxbid")) {
			ygzwxxbid = Integer.parseInt(request.getParameter("ygzwxxbid"));
		}
		System.out.println("好了");
		System.out.println(ygzwxxbid);
		dao.deleteYgzwxxb(ygzwxxbid);
		request.getRequestDispatcher("./YgzwxxbServlet?action=zwxxwh").forward(
				request, response);

	}

	private void updateYgzwxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgzwxxbDao dao = new YgzwxxbDaoImpl();
		boolean flag = false;
		int ygzwxxbid = 0;
		if (!"".equals(request.getParameter("ygzwxxbid"))
				&& null != request.getParameter("ygzwxxbid")) {
			ygzwxxbid = Integer.parseInt(request.getParameter("ygzwxxbid"));
		}
		
		String zwmc = request.getParameter("ygzwxxbzwmc");

		Ygzwxxb ygzwxxb = new Ygzwxxb(ygzwxxbid,zwmc);
		dao.updateYgzwxxb(ygzwxxb);
		request.getRequestDispatcher("./YgzwxxbServlet?action=zwxxwh").forward(
				request, response);
	}

	private void zwxxwhxg(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgzwxxbDao dao = new YgzwxxbDaoImpl();
		int ygzwxxbid = 0;
		if (!"".equals(request.getParameter("ygzwxxbid"))
				&& null != request.getParameter("ygzwxxbid")) {
			ygzwxxbid = Integer.parseInt(request.getParameter("ygzwxxbid"));
		}
		Ygzwxxb ygzwxxb = dao.selectYgzwxxbId(ygzwxxbid);
		request.setAttribute("ygzwxxb", ygzwxxb);
		request.getRequestDispatcher("./zwxxwhxg.jsp").forward(request,
				response);
	}

	private void jcxxwh(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		YgzwxxbDao dao = new YgzwxxbDaoImpl();
		List<Ygzwxxb> Ygzwxxbs = dao.selectYgzwxxbList();
		request.setAttribute("Ygzwxxbs", Ygzwxxbs);
		request.getRequestDispatcher("./jcxxwh.jsp").forward(request, response);
	}

	private void ygdddd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		YgzwxxbDao dao = new YgzwxxbDaoImpl();
		int Ygzwxxbid = 0;
		if (!"".equals(request.getParameter("Ygzwxxbid"))
				&& null != request.getParameter("Ygzwxxbid")) {
			Ygzwxxbid = Integer.parseInt(request.getParameter("Ygzwxxbid"));
			Ygzwxxb Ygzwxxb = dao.selectYgzwxxbId(Ygzwxxbid);
			request.setAttribute("Ygzwxxb", Ygzwxxb);
			request.getRequestDispatcher("./ygdddd.jsp").forward(request,
					response);
		} else {
			request.getRequestDispatcher("./error.jsp").forward(request,
					response);
		}

	}

	private void zwxxwh(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		YgzwxxbDao dao = new YgzwxxbDaoImpl();
		List<Ygzwxxb> ygzwxxbs = dao.selectYgzwxxbList();
		request.setAttribute("ygzwxxbs", ygzwxxbs);
		request.getRequestDispatcher("./zwxxwh.jsp").forward(request, response);
	}

}
