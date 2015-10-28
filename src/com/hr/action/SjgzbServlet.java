package com.hr.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.bean.Sjgzb;
import com.hr.bean.User;
import com.hr.bean.Ygxxb;
import com.hr.dao.SjgzbDao;
import com.hr.dao.UserDao;
import com.hr.dao.impl.SjgzbDaoImpl;
import com.hr.dao.impl.UserDaoImpl;

public class SjgzbServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		System.out.println("actionSjgzb：  1" + action);
		if (action.equals("addSjgzb")) {
			this.addSjgzb(request, response);
		}
		if (action.equals("deletesjgzb")) {
			this.deleteSjgzb(request, response);
		}
		if (action.equals("updatesjgzb")) {
			this.updateSjgzb(request, response);
		}
		if (action.equals("gzxxwhxg")) {
			this.gzxxwhxg(request, response);
		}
		if (action.equals("gzxxwh")) {
			this.gzxxwh(request, response);
		}
		if (action.equals("gzxxcxxq")) {
			this.gzxxcxxq(request, response);
		}
		if (action.equals("gzxxcx")) {
			this.gzxxcx(request, response);
		}
	}

	private void addSjgzb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		SjgzbDao dao = new SjgzbDaoImpl();
		boolean flag = false;
		float sjgz = 0;
		if (!"".equals(request.getParameter("sjgzbcd"))
				&& null != request.getParameter("sjgzbcd")) {
			sjgz = Float.parseFloat(request.getParameter("sjgzbcd"));
		}
		
		String xm = request.getParameter("sjgzbxm");
		String ffrq = request.getParameter("sjgzbffrq");

		Sjgzb sjgzb = new Sjgzb(xm, sjgz, ffrq);
		flag = dao.insertSjgzb(sjgzb);

		request.getRequestDispatcher("./SjgzbServlet?action=gzxxcx").forward(
				request, response);
	}

	private void deleteSjgzb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		SjgzbDao dao = new SjgzbDaoImpl();
		int sjgzbid = 0;
		if (!"".equals(request.getParameter("sjgzbid"))
				&& null != request.getParameter("sjgzbid")) {
			sjgzbid = Integer.parseInt(request.getParameter("sjgzbid"));
		}
		dao.deleteSjgzb(sjgzbid);
		request.getRequestDispatcher("./SjgzbServlet?action=gzxxcx").forward(
				request, response);

	}

	private void updateSjgzb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		SjgzbDao dao = new SjgzbDaoImpl();
		boolean flag = false;
		int sjgzbid =0;
		float sjgz = 0;
		if (!"".equals(request.getParameter("sjgzbid"))
				&& null != request.getParameter("sjgzbid")) {
			sjgzbid = Integer.parseInt(request.getParameter("sjgzbid"));
		}
		if (!"".equals(request.getParameter("sjgzbcd"))
				&& null != request.getParameter("sjgzbcd")) {
			sjgz = Float.parseFloat(request.getParameter("sjgzbcd"));
		}
		
		String xm = request.getParameter("sjgzbxm");
		String ffrq = request.getParameter("sjgzbffrq");

		Sjgzb sjgzb = new Sjgzb(sjgzbid,xm, sjgz, ffrq);
		dao.updateSjgzb(sjgzb);
		request.getRequestDispatcher("./SjgzbServlet?action=gzxxcx").forward(
				request, response);
	}

	private void gzxxwhxg(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		SjgzbDao dao = new SjgzbDaoImpl();
		int sjgzbid = 0;
		if (!"".equals(request.getParameter("sjgzbid"))
				&& null != request.getParameter("sjgzbid")) {
			sjgzbid = Integer.parseInt(request.getParameter("sjgzbid"));
		}
		Sjgzb sjgzb = dao.selectSjgzbId(sjgzbid);
		request.setAttribute("sjgzb", sjgzb);
		request.getRequestDispatcher("./gzxxwhxg.jsp").forward(request,
				response);
	}

	private void gzxxwh(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SjgzbDao dao = new SjgzbDaoImpl();
		List<Sjgzb> sjgzbs = dao.selectSjgzbList();
		request.setAttribute("sjgzbs", sjgzbs);
		request.getRequestDispatcher("./gzxxwh.jsp").forward(request, response);
	}

	private void gzxxcxxq(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		SjgzbDao dao = new SjgzbDaoImpl();
		int sjgzbid = 0;
		if (!"".equals(request.getParameter("sjgzbid"))
				&& null != request.getParameter("sjgzbid")) {
			sjgzbid = Integer.parseInt(request.getParameter("sjgzbid"));
		}
		Sjgzb sjgzb = dao.selectSjgzbId(sjgzbid);
		request.setAttribute("sjgzb", sjgzb);
		request.getRequestDispatcher("./gzxxcxxq.jsp").forward(request,
				response);

	}

	private void gzxxcx(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SjgzbDao dao = new SjgzbDaoImpl();
		List<Sjgzb> sjgzbs = dao.selectSjgzbList();
		request.setAttribute("sjgzbs", sjgzbs);
		request.getRequestDispatcher("./gzxxcx.jsp").forward(request, response);
	}

}
