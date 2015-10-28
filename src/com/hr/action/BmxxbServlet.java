package com.hr.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.bean.Bmxxb;
import com.hr.bean.User;
import com.hr.bean.Ygxxb;
import com.hr.dao.BmxxbDao;
import com.hr.dao.UserDao;
import com.hr.dao.impl.BmxxbDaoImpl;
import com.hr.dao.impl.UserDaoImpl;

public class BmxxbServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		System.out.println("actionBmxxb：  1" + action);
		if (action.equals("addBmxxb")) {
			this.addBmxxb(request, response);
		}
		if (action.equals("deletebmxxb")) {
			this.deletebmxxb(request, response);
		}
		if (action.equals("updatebmxxb")) {
			this.updateBmxxb(request, response);
		}
		if (action.equals("bmxxwhxg")) {
			this.bmxxwhxg(request, response);
		}
		if (action.equals("jcxxwh")) {
			this.jcxxwh(request, response);
		}
		if (action.equals("ygdddd")) {
			this.ygdddd(request, response);
		}
		if (action.equals("bmxxwh")) {
			this.bmxxwh(request, response);
		}
	}

	private void addBmxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		BmxxbDao dao = new BmxxbDaoImpl();
		boolean flag = false;
		int bmxxbid = 0;
		if (!"".equals(request.getParameter("bmxxbid"))
				&& null != request.getParameter("bmxxbid")) {
			bmxxbid = Integer.parseInt(request.getParameter("bmxxbid"));
		}
		
		String mc = request.getParameter("bmxxbmc");
		String bz = request.getParameter("bmxxbbz");

		Bmxxb bmxxb = new Bmxxb(bmxxbid, mc, bz);
		flag = dao.insertBmxxb(bmxxb);
			request.getRequestDispatcher("./BmxxbServlet?action=cxygxx")
					.forward(request, response);
	}

	private void deletebmxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		BmxxbDao dao = new BmxxbDaoImpl();
		int bmxxbid = 0;
		if (!"".equals(request.getParameter("bmxxbid"))
				&& null != request.getParameter("bmxxbid")) {
			bmxxbid = Integer.parseInt(request.getParameter("bmxxbid"));
		}
		System.out.println("好了");
		System.out.println(bmxxbid);
		dao.deleteBmxxb(bmxxbid);
		request.getRequestDispatcher("./BmxxbServlet?action=bmxxwh").forward(
				request, response);

	}

	private void updateBmxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		BmxxbDao dao = new BmxxbDaoImpl();
		boolean flag = false;
		int bmxxbid = 0;
		if (!"".equals(request.getParameter("bmxxbid"))
				&& null != request.getParameter("bmxxbid")) {
			bmxxbid = Integer.parseInt(request.getParameter("bmxxbid"));
		}
		
		String mc = request.getParameter("bmxxbmc");
		String bz = request.getParameter("bmxxbbz");

		Bmxxb bmxxb = new Bmxxb(bmxxbid, mc, bz);
		dao.updateBmxxb(bmxxb);
		request.getRequestDispatcher("./BmxxbServlet?action=bmxxwh").forward(
				request, response);
	}

	private void bmxxwhxg(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		BmxxbDao dao = new BmxxbDaoImpl();
		int bmxxbid = 0;
		if (!"".equals(request.getParameter("bmxxbid"))
				&& null != request.getParameter("bmxxbid")) {
			bmxxbid = Integer.parseInt(request.getParameter("bmxxbid"));
		}
		Bmxxb bmxxb = dao.selectBmxxbId(bmxxbid);
		request.setAttribute("bmxxb", bmxxb);
		request.getRequestDispatcher("./bmxxwhxg.jsp").forward(request,
				response);
	}

	private void jcxxwh(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BmxxbDao dao = new BmxxbDaoImpl();
		List<Bmxxb> Bmxxbs = dao.selectBmxxbList();
		request.setAttribute("Bmxxbs", Bmxxbs);
		request.getRequestDispatcher("./jcxxwh.jsp").forward(request, response);
	}

	private void ygdddd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BmxxbDao dao = new BmxxbDaoImpl();
		int Bmxxbid = 0;
		if (!"".equals(request.getParameter("Bmxxbid"))
				&& null != request.getParameter("Bmxxbid")) {
			Bmxxbid = Integer.parseInt(request.getParameter("Bmxxbid"));
			Bmxxb Bmxxb = dao.selectBmxxbId(Bmxxbid);
			request.setAttribute("Bmxxb", Bmxxb);
			request.getRequestDispatcher("./ygdddd.jsp").forward(request,
					response);
		} else {
			request.getRequestDispatcher("./error.jsp").forward(request,
					response);
		}

	}

	private void bmxxwh(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BmxxbDao dao = new BmxxbDaoImpl();
		List<Bmxxb> bmxxbs = dao.selectBmxxbList();
		request.setAttribute("bmxxbs", bmxxbs);
		request.getRequestDispatcher("./bmxxwh.jsp").forward(request, response);
	}

}
