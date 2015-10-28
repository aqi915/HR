package com.hr.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.bean.User;
import com.hr.bean.Ygddxxb;
import com.hr.bean.Ygxxb;
import com.hr.dao.UserDao;
import com.hr.dao.YgddxxbDao;
import com.hr.dao.YgxxbDao;
import com.hr.dao.impl.UserDaoImpl;
import com.hr.dao.impl.YgddxxbDaoImpl;
import com.hr.dao.impl.YgxxbDaoImpl;

public class YgddxxbServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		System.out.println("actionYgddxxb：  1" + action);
		if (action.equals("addYgddxxb")) {
			this.addYgddxxb(request, response);
		}
		if (action.equals("deleteYgddxxb")) {
			this.deleteYgddxxb(request, response);
		}
		if (action.equals("updateygddxxb")) {
			this.updateYgddxxb(request, response);
		}
		if (action.equals("whygxxxg")) {
			this.whygxxxg(request, response);
		}
		if (action.equals("whygxx")) {
			this.whygxx(request, response);
		}
		if (action.equals("ygdddd")) {
			this.ygdddd(request, response);
		}
		if (action.equals("ygdd")) {
			this.ygdd(request, response);
		}
	}

	private void addYgddxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgddxxbDao dao = new YgddxxbDaoImpl();
		boolean flag = false;
		int ysbm = 0;
		int xbmh = 0;
		float ygz = 0;
		float xgz = 0;
		if (!"".equals(request.getParameter("Ygddxxbbmh"))
				&& null != request.getParameter("Ygddxxbbmh")) {
			ysbm = Integer.parseInt(request.getParameter("Ygddxxbbmh"));
		}
		if (!"".equals(request.getParameter("Ygddxxbbmh"))
				&& null != request.getParameter("Ygddxxbbmh")) {
			ygz = Float.parseFloat(request.getParameter("Ygddxxbygz"));
		}
		if (!"".equals(request.getParameter("Ygddxxbbmh"))
				&& null != request.getParameter("Ygddxxbbmh")) {
			xbmh = Integer.parseInt(request.getParameter("Ygddxxbxbmh"));
		}
		if (!"".equals(request.getParameter("Ygddxxbbmh"))
				&& null != request.getParameter("Ygddxxbbmh")) {
			xgz = Float.parseFloat(request.getParameter("Ygddxxbxgz"));
		}
		String xm = request.getParameter("Ygddxxbxm");
		String yzwmc = request.getParameter("Ygddxxbyzwmc");
		String xzwmc = request.getParameter("Ygddxxbxzwmc");
		String ddsj = request.getParameter("Ygddxxbddsj");

		Ygddxxb ygddxxb = new Ygddxxb(xm, ysbm, yzwmc, ygz, xbmh, xzwmc, xgz,
				ddsj);
		flag = dao.insertYgddxxb(ygddxxb);
		if (flag == true) {
			User user = new User();
			user.setxm(xm);
			user.setmm("123456");
			user.setQx("2");
			UserDao userdao = new UserDaoImpl();
			userdao.insertUser(user);
			request.getRequestDispatcher("./Ygddxxbservlet?action=cxygxx")
					.forward(request, response);
		}
		request.getRequestDispatcher("./error.jsp").forward(request, response);
	}

	private void deleteYgddxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		YgddxxbDao dao = new YgddxxbDaoImpl();
		int Ygddxxbid = 0;
		if (!"".equals(request.getParameter("Ygddxxbid"))
				&& null != request.getParameter("Ygddxxbid")) {
			Ygddxxbid = Integer.parseInt(request.getParameter("Ygddxxbid"));
		}
		flag = dao.deleteYgddxxb(Ygddxxbid);
		if (flag == true) {
			UserDao userdao = new UserDaoImpl();
			userdao.deleteUser(Ygddxxbid);
			request.getRequestDispatcher("./Ygddxxbservlet?action=cxygxx")
					.forward(request, response);
		}
		request.getRequestDispatcher("./error.jsp").forward(request, response);
	}

	private void updateYgddxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgddxxbDao dao = new YgddxxbDaoImpl();
		boolean flag = false;
		int ysbm = 0;
		int xbmh = 0;
		float ygz = 0;
		float xgz = 0;
		if (!"".equals(request.getParameter("Ygddxxbbmh"))
				&& null != request.getParameter("Ygddxxbbmh")) {
			ysbm = Integer.parseInt(request.getParameter("Ygddxxbbmh"));
		}
		if (!"".equals(request.getParameter("Ygddxxbbmh"))
				&& null != request.getParameter("Ygddxxbbmh")) {
			ygz = Float.parseFloat(request.getParameter("Ygddxxbygz"));
		}
		if (!"".equals(request.getParameter("Ygddxxbbmh"))
				&& null != request.getParameter("Ygddxxbbmh")) {
			xbmh = Integer.parseInt(request.getParameter("Ygddxxbxbmh"));
		}
		if (!"".equals(request.getParameter("Ygddxxbbmh"))
				&& null != request.getParameter("Ygddxxbbmh")) {
			xgz = Float.parseFloat(request.getParameter("Ygddxxbxgz"));
		}
		String xm = request.getParameter("Ygddxxbxm");
		String yzwmc = request.getParameter("Ygddxxbyzwmc");
		String xzwmc = request.getParameter("Ygddxxbxzwmc");
		String ddsj = request.getParameter("Ygddxxbddsj");

		Ygddxxb ygddxxb = new Ygddxxb(xm, ysbm, yzwmc, ygz, xbmh, xzwmc, xgz,
				ddsj);
		dao.updateYgddxxb(ygddxxb);
		request.getRequestDispatcher("./Ygddxxbservlet?action=cxygxx").forward(
				request, response);
	}

	private void whygxxxg(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgddxxbDao dao = new YgddxxbDaoImpl();
		int Ygddxxbid = 0;
		if (!"".equals(request.getParameter("Ygddxxbid"))
				&& null != request.getParameter("Ygddxxbid")) {
			Ygddxxbid = Integer.parseInt(request.getParameter("Ygddxxbid"));
		}
		Ygddxxb Ygddxxb = dao.selectYgddxxbId(Ygddxxbid);
		request.setAttribute("Ygddxxb", Ygddxxb);
		request.getRequestDispatcher("./whygxxxg.jsp").forward(request,
				response);
	}

	private void whygxx(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		YgddxxbDao dao = new YgddxxbDaoImpl();
		List<Ygddxxb> whygxxs = dao.selectYgddxxbList();
		request.setAttribute("whygxxs", whygxxs);
		request.getRequestDispatcher("./whygxx.jsp").forward(request, response);
	}

	private void ygdddd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		YgddxxbDao dao = new YgddxxbDaoImpl();
		int ygddxxbid = 0;
		if (!"".equals(request.getParameter("ygddxxbid"))
				&& null != request.getParameter("ygddxxbid")) {
			ygddxxbid = Integer.parseInt(request.getParameter("ygddxxbid"));
			Ygddxxb ygddxxb = dao.selectYgddxxbId(ygddxxbid);
			request.setAttribute("ygddxxb", ygddxxb);
			request.getRequestDispatcher("./ygdddd.jsp").forward(request,
					response);
		} else {
			request.getRequestDispatcher("./error.jsp").forward(request, response);
		}

	}

	private void ygdd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		YgxxbDao dao = new YgxxbDaoImpl();
		List<Ygxxb> ygxxbs = dao.selectYgxxbList();
		request.setAttribute("ygxxbs", ygxxbs);
		request.getRequestDispatcher("./ygdd.jsp").forward(request, response);
	}

}
