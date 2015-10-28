package com.hr.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.bean.User;
import com.hr.bean.Ygxxb;
import com.hr.dao.UserDao;
import com.hr.dao.YgxxbDao;
import com.hr.dao.impl.UserDaoImpl;
import com.hr.dao.impl.YgxxbDaoImpl;

public class YgxxbServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		System.out.println("actionygxxb：  " + action);
		if (action.equals("addygxxb")) {
			this.addygxxb(request, response);
		}
		if (action.equals("deleteygxxb")) {
			this.deleteygxxb(request, response);
		}
		if (action.equals("updateygxxb")) {
			this.updateygxxb(request, response);
		}
		if (action.equals("whygxxxg")) {
			this.whygxxxg(request, response);
		}
		if (action.equals("whygxx")) {
			this.whygxx(request, response);
		}
		if (action.equals("cxygxxxq")) {
			this.cxygxxxq(request, response);
		}
		if (action.equals("cxygxx")) {
			this.cxygxx(request, response);
		}
	}

	private void addygxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgxxbDao dao = new YgxxbDaoImpl();
		boolean flag = false;
		int bmh = 0;
		if (!"".equals(request.getParameter("ygxxbbmh"))
				&& null != request.getParameter("ygxxbbmh")) {
			bmh = Integer.parseInt(request.getParameter("ygxxbbmh"));
		}
		String sfzh = request.getParameter("ygxxbsfzh");
		System.out.println(sfzh);
		String xm = request.getParameter("ygxxbxm");
		String xb = request.getParameter("ygxxbxb");
		String csrq = request.getParameter("ygxxbcsrq");
		String jg = request.getParameter("ygxxbjg");
		String zz = request.getParameter("ygxxbzz");
		String yx = request.getParameter("ygxxbyx");
		String xl = request.getParameter("ygxxbxl");
		String zy = request.getParameter("ygxxbzy");
		String bysj = request.getParameter("ygxxbbysj");
		String byyx = request.getParameter("ygxxbbyyx");
		String jzsj = request.getParameter("ygxxbjzsj");
		String lxfs = request.getParameter("ygxxblxfs");
		String zp = request.getParameter("ygxxbzp");
		String zt = request.getParameter("ygxxbzt");
		String bz = request.getParameter("ygxxbbz");

		Ygxxb ygxxb = new Ygxxb(sfzh, xm, xb, csrq, jg, zz, yx, xl, zy, bysj,
				byyx, jzsj, lxfs, "22", bmh, zt, bz);
		flag = dao.insertYgxxb(ygxxb);
		if (flag == true) {
			User user = new User();
			user.setxm(xm);
			user.setmm("123456");
			user.setQx("2");
			UserDao userdao = new UserDaoImpl();
			userdao.insertUser(user);
			request.getRequestDispatcher("./ygxxbservlet?action=cxygxx")
					.forward(request, response);
		}
		request.getRequestDispatcher("./error.jsp").forward(request, response);
	}

	private void deleteygxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		YgxxbDao dao = new YgxxbDaoImpl();
		int ygxxbid = 0;
		if (!"".equals(request.getParameter("ygxxbid"))
				&& null != request.getParameter("ygxxbid")) {
			ygxxbid = Integer.parseInt(request.getParameter("ygxxbid"));
		}
		flag = dao.deleteYgxxb(ygxxbid);
		if (flag == true) {
			UserDao userdao = new UserDaoImpl();
			userdao.deleteUser(ygxxbid);
			request.getRequestDispatcher("./ygxxbservlet?action=cxygxx")
					.forward(request, response);
		}
		request.getRequestDispatcher("./error.jsp").forward(request, response);
	}

	private void updateygxxb(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgxxbDao dao = new YgxxbDaoImpl();
		int ygxxbid = 0;
		if (!"".equals(request.getParameter("ygxxbygh"))
				&& null != request.getParameter("ygxxbygh")) {
			ygxxbid = Integer.parseInt(request.getParameter("ygxxbygh"));
		}
		System.out.println("ygxxbid" + ygxxbid);
		String sfzh = request.getParameter("ygxxbsfzh");
		System.out.println(sfzh);
		String xm = request.getParameter("ygxxbxm");
		String xb = request.getParameter("ygxxbxb");
		String csrq = request.getParameter("ygxxbcsrq");
		String jg = request.getParameter("ygxxbjg");
		String zz = request.getParameter("ygxxbzz");
		String yx = request.getParameter("ygxxbyx");
		String xl = request.getParameter("ygxxbxl");
		String zy = request.getParameter("ygxxbzy");
		String bysj = request.getParameter("ygxxbbysj");
		String byyx = request.getParameter("ygxxbbyyx");
		String jzsj = request.getParameter("ygxxbjzsj");
		String lxfs = request.getParameter("ygxxblxfs");
		String zp = request.getParameter("ygxxbzp");
		int bmh = Integer.parseInt(request.getParameter("ygxxbbmh"));
		String zt = request.getParameter("ygxxbzt");
		String bz = request.getParameter("ygxxbbz");

		Ygxxb ygxxb = new Ygxxb(ygxxbid, sfzh, xm, xb, csrq, jg, zz, yx, xl,
				zy, bysj, byyx, jzsj, lxfs, "22", bmh, zt, bz);
		dao.updateYgxxb(ygxxb);
		request.getRequestDispatcher("./ygxxbservlet?action=cxygxx").forward(
				request, response);
	}

	private void whygxxxg(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgxxbDao dao = new YgxxbDaoImpl();
		int ygxxbid = 0;
		if (!"".equals(request.getParameter("ygxxbid"))
				&& null != request.getParameter("ygxxbid")) {
			ygxxbid = Integer.parseInt(request.getParameter("ygxxbid"));
		}
		Ygxxb ygxxb = dao.selectYgxxbId(ygxxbid);
		request.setAttribute("ygxxb", ygxxb);
		request.getRequestDispatcher("./whygxxxg.jsp").forward(request,
				response);
	}

	private void whygxx(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		YgxxbDao dao = new YgxxbDaoImpl();
		List<Ygxxb> whygxxs = dao.selectYgxxbList();
		request.setAttribute("whygxxs", whygxxs);
		request.getRequestDispatcher("./whygxx.jsp").forward(request, response);
	}

	private void cxygxxxq(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		YgxxbDao dao = new YgxxbDaoImpl();
		int ygxxbid = 0;
		if (!"".equals(request.getParameter("ygxxbid"))
				&& null != request.getParameter("ygxxbid")) {
			ygxxbid = Integer.parseInt(request.getParameter("ygxxbid"));
		}
		Ygxxb ygxxb = dao.selectYgxxbId(ygxxbid);
		request.setAttribute("ygxxb", ygxxb);
		request.getRequestDispatcher("./cxygxxxq.jsp").forward(request,
				response);
	}

	private void cxygxx(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		YgxxbDao dao = new YgxxbDaoImpl();
		List<Ygxxb> ygxxbs = dao.selectYgxxbList();
		request.setAttribute("ybxxbs", ygxxbs);
		request.getRequestDispatcher("./cxygxx.jsp").forward(request, response);
	}

}
