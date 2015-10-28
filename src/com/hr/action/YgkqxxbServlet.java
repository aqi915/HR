package com.hr.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.bean.Ygkqxxb;
import com.hr.bean.User;
import com.hr.bean.Ygxxb;
import com.hr.dao.YgkqxxbDao;
import com.hr.dao.UserDao;
import com.hr.dao.impl.YgkqxxbDaoImpl;
import com.hr.dao.impl.UserDaoImpl;

public class YgkqxxbServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		System.out.println("actionYgkqxxb：  1" + action);
		if (action.equals("addYgkqxxb")) {
			this.addYgkqxxb(request, response);
		}
		if (action.equals("deleteygkqxxb")) {
			this.deleteYgkqxxb(request, response);
		}
		if (action.equals("updateygkqxxb")) {
			this.updateYgkqxxb(request, response);
		}
		if (action.equals("kqxxwhxg")) {
			this.kqxxwhxg(request, response);
		}
		if (action.equals("kqxxwh")) {
			this.kqxxwh(request, response);
		}
		if (action.equals("kqxxcxxq")) {
			this.kqxxcxxq(request, response);
		}
		if (action.equals("kqxxcx")) {
			this.kqxxcx(request, response);
		}
	}

	private void addYgkqxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgkqxxbDao dao = new YgkqxxbDaoImpl();
		boolean flag = false;
		int cd = 0;
		int zt = 0;
		int kg = 0;
		int qj = 0;
		int jbsj = 0;
		int kqsj = 0;
		if (!"".equals(request.getParameter("ygkqxxbcd"))
				&& null != request.getParameter("ygkqxxbcd")) {
			cd = Integer.parseInt(request.getParameter("ygkqxxbcd"));
		}
		if (!"".equals(request.getParameter("ygkqxxbzt"))
				&& null != request.getParameter("ygkqxxbzt")) {
			zt = Integer.parseInt(request.getParameter("ygkqxxbzt"));
		}
		if (!"".equals(request.getParameter("ygkqxxbkg"))
				&& null != request.getParameter("ygkqxxbkg")) {
			kg = Integer.parseInt(request.getParameter("ygkqxxbkg"));
		}
		if (!"".equals(request.getParameter("ygkqxxbqj"))
				&& null != request.getParameter("ygkqxxbqj")) {
			qj = Integer.parseInt(request.getParameter("ygkqxxbqj"));
		}
		if (!"".equals(request.getParameter("ygkqxxbjbsj"))
				&& null != request.getParameter("ygkqxxbjbsj")) {
			jbsj = Integer.parseInt(request.getParameter("ygkqxxbjbsj"));
		}
		if (!"".equals(request.getParameter("ygkqxxbkqsj"))
				&& null != request.getParameter("ygkqxxbkqsj")) {
			kqsj = Integer.parseInt(request.getParameter("ygkqxxbkqsj"));
		}
		String xm = request.getParameter("ygkqxxbxm");

		Ygkqxxb ygkqxxb = new Ygkqxxb(xm, cd, zt, kg, qj, jbsj, kqsj);
		flag = dao.insertYgkqxxb(ygkqxxb);

		request.getRequestDispatcher("./YgkqxxbServlet?action=kqxxcx").forward(
				request, response);
	}

	private void deleteYgkqxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		YgkqxxbDao dao = new YgkqxxbDaoImpl();
		int ygkqxxbid = 0;
		if (!"".equals(request.getParameter("ygkqxxbid"))
				&& null != request.getParameter("ygkqxxbid")) {
			ygkqxxbid = Integer.parseInt(request.getParameter("ygkqxxbid"));
		}
		dao.deleteYgkqxxb(ygkqxxbid);
		request.getRequestDispatcher("./YgkqxxbServlet?action=kqxxcx").forward(
				request, response);

	}

	private void updateYgkqxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgkqxxbDao dao = new YgkqxxbDaoImpl();
		boolean flag = false;
		int ygkqxxbid=0;
		int cd = 0;
		int zt = 0;
		int kg = 0;
		int qj = 0;
		int jbsj = 0;
		int kqsj = 0;
		if (!"".equals(request.getParameter("ygkqxxbid"))
				&& null != request.getParameter("ygkqxxbid")) {
			ygkqxxbid = Integer.parseInt(request.getParameter("ygkqxxbid"));
		}
		if (!"".equals(request.getParameter("ygkqxxbcd"))
				&& null != request.getParameter("ygkqxxbcd")) {
			cd = Integer.parseInt(request.getParameter("ygkqxxbcd"));
		}
		if (!"".equals(request.getParameter("ygkqxxbzt"))
				&& null != request.getParameter("ygkqxxbzt")) {
			zt = Integer.parseInt(request.getParameter("ygkqxxbzt"));
		}
		if (!"".equals(request.getParameter("ygkqxxbkg"))
				&& null != request.getParameter("ygkqxxbkg")) {
			kg = Integer.parseInt(request.getParameter("ygkqxxbkg"));
		}
		if (!"".equals(request.getParameter("ygkqxxbqj"))
				&& null != request.getParameter("ygkqxxbqj")) {
			qj = Integer.parseInt(request.getParameter("ygkqxxbqj"));
		}
		if (!"".equals(request.getParameter("ygkqxxbjbsj"))
				&& null != request.getParameter("ygkqxxbjbsj")) {
			jbsj = Integer.parseInt(request.getParameter("ygkqxxbjbsj"));
		}
		if (!"".equals(request.getParameter("ygkqxxbkqsj"))
				&& null != request.getParameter("ygkqxxbkqsj")) {
			kqsj = Integer.parseInt(request.getParameter("ygkqxxbkqsj"));
		}
		String xm = request.getParameter("ygkqxxbxm");
		System.out.println(xm);
		Ygkqxxb ygkqxxb = new Ygkqxxb(ygkqxxbid,xm, cd, zt, kg, qj, jbsj, kqsj);
		dao.updateYgkqxxb(ygkqxxb);
		request.getRequestDispatcher("./YgkqxxbServlet?action=kqxxcx").forward(
				request, response);
	}

	private void kqxxwhxg(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgkqxxbDao dao = new YgkqxxbDaoImpl();
		int ygkqxxbid = 0;
		if (!"".equals(request.getParameter("ygkqxxbid"))
				&& null != request.getParameter("ygkqxxbid")) {
			ygkqxxbid = Integer.parseInt(request.getParameter("ygkqxxbid"));
		}
		Ygkqxxb ygkqxxb = dao.selectYgkqxxbId(ygkqxxbid);
		request.setAttribute("ygkqxxb", ygkqxxb);
		request.getRequestDispatcher("./kqxxwhxg.jsp").forward(request,
				response);
	}

	private void kqxxwh(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		YgkqxxbDao dao = new YgkqxxbDaoImpl();
		List<Ygkqxxb> ygkqxxbs = dao.selectYgkqxxbList();
		request.setAttribute("ygkqxxbs", ygkqxxbs);
		request.getRequestDispatcher("./kqxxwh.jsp").forward(request, response);
	}

	private void kqxxcxxq(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgkqxxbDao dao = new YgkqxxbDaoImpl();
		int ygkqxxbid = 0;
		if (!"".equals(request.getParameter("ygkqxxbid"))
				&& null != request.getParameter("ygkqxxbid")) {
			ygkqxxbid = Integer.parseInt(request.getParameter("ygkqxxbid"));
		}
		Ygkqxxb ygkqxxb = dao.selectYgkqxxbId(ygkqxxbid);
		request.setAttribute("ygkqxxb", ygkqxxb);
		request.getRequestDispatcher("./kqxxcxxq.jsp").forward(request,
				response);

	}

	private void kqxxcx(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		YgkqxxbDao dao = new YgkqxxbDaoImpl();
		List<Ygkqxxb> ygkqxxbs = dao.selectYgkqxxbList();
		request.setAttribute("ygkqxxbs", ygkqxxbs);
		request.getRequestDispatcher("./kqxxcx.jsp").forward(request, response);
	}

}
