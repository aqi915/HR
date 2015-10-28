<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./util/taglibs.jsp"%>
<!-- 加入标签库 -->
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
<meta charset="utf-8" />
<title>Admin Template</title>
<meta name="description"
	content="Administry - Admin Template by www.865171.cn" />
<meta name="keywords" content="Admin,Template" />
<!-- Favicons -->
<link rel="shortcut icon" type="image/png"
	HREF="img/favicons/favicon.png" />
<link rel="icon" type="image/png" HREF="img/favicons/favicon.png" />
<link rel="apple-touch-icon" HREF="img/favicons/apple.png" />
<!-- Main Stylesheet -->
<link rel="stylesheet" href="css/style.css" type="text/css" />
<!-- Colour Schemes
Default colour scheme is blue. Uncomment prefered stylesheet to use it.
<link rel="stylesheet" href="css/brown.css" type="text/css" media="screen" />  
<link rel="stylesheet" href="css/gray.css" type="text/css" media="screen" />  
<link rel="stylesheet" href="css/green.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/pink.css" type="text/css" media="screen" />  
<link rel="stylesheet" href="css/red.css" type="text/css" media="screen" />
-->
<!-- Your Custom Stylesheet -->
<link rel="stylesheet" href="css/custom.css" type="text/css" />
<!--swfobject - needed only if you require <video> tag support for older browsers -->
<script type="text/javascript" SRC="js/swfobject.js"></script>
<!-- jQuery with plugins -->
<script type="text/javascript" SRC="js/jquery-1.4.2.min.js"></script>
<!-- Could be loaded remotely from Google CDN : <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script> -->
<script type="text/javascript" SRC="js/jquery.ui.core.min.js"></script>
<script type="text/javascript" SRC="js/jquery.ui.widget.min.js"></script>
<script type="text/javascript" SRC="js/jquery.ui.tabs.min.js"></script>
<!-- jQuery tooltips -->
<script type="text/javascript" SRC="js/jquery.tipTip.min.js"></script>
<!-- Superfish navigation -->
<script type="text/javascript" SRC="js/jquery.superfish.min.js"></script>
<script type="text/javascript" SRC="js/jquery.supersubs.min.js"></script>
<!-- jQuery form validation -->
<script type="text/javascript" SRC="js/jquery.validate_pack.js"></script>
<!-- jQuery popup box -->
<script type="text/javascript" SRC="js/jquery.nyroModal.pack.js"></script>
<!-- jQuery data tables -->
<script type="text/javascript" SRC="js/jquery.dataTables.min.js"></script>
<!-- Internet Explorer Fixes -->
<!--[if IE]>
<link rel="stylesheet" type="text/css" media="all" href="css/ie.css"/>
<script src="js/html5.js"></script>
<![endif]-->
<!--Upgrade MSIE5.5-7 to be compatible with MSIE8: http://ie7-js.googlecode.com/svn/version/2.1(beta3)/IE8.js -->
<!--[if lt IE 8]>
<script src="js/IE8.js"></script>
<![endif]-->
<script type="text/javascript">
	$(document).ready(function() {

		/* setup navigation, content boxes, etc... */
		Administry.setup();

		/* datatable */
		$('#example').dataTable();

		/* expandable rows */
		Administry.expandableRows();
	});
</script>
<script type="text/javascript">
	function getTime() {
		var now = new Date();
		var year = now.getFullYear();
		var month = now.getMonth() + 1;
		var day = now.getDate();
		var hour = now.getHours();
		var minute = now.getMinutes();
		var second = now.getSeconds();
		var week = "日一二三四五六".charAt(now.getDay());
		return year + "年" + month + "月" + day + "日 " + hour + "点" + minute
				+ "分" + second + "秒" + " 星期" + week;
	}

	function onLoad() {
		var timeStr = getTime();
		document.getElementById('getsystemtime').innerHTML = timeStr;
		setTimeout(onLoad, 1000);
	}
</SCRIPT>
</head>
<body>
	<!-- Header -->
	<header id="top">
	<div class="wrapper">
		<!-- Title/Logo - can use text instead of image -->
		<div id="title">
			<img SRC="img/logo.png" alt="Administry" />
			<!--<span>Administry</span> demo-->
		</div>
		<!-- Top navigation -->
		<div id="topnav">
			<a href="#"><img class="avatar" SRC="img/user_32.png" alt="" />
			</a> Logged in as <b>Admin</b> <span>|</span> <a href="#">Settings</a> <span>|</span>
			<a href="#">Logout</a><br /> <small>You have <a href="#"
				class="high"><b>1</b> new message!</a> </small>
		</div>
		<!-- End of Top navigation -->
		<!-- Main navigation -->
		<nav id="menu">
		<ul class="sf-menu">
			<li><a HREF="dashboard.jsp">首页</a>
			</li>
			<li><a HREF="styles.html">人事管理</a>
				<ul>
					<li><a HREF="cxygxx.html">查询员工信息</a></li>
					<li><a href="whygxx.html">维护员工信息</a>
						<ul>
							<li><a HREF="samples-files.html">Files</a>
							</li>
							<li><a HREF="samples-products.html">Products</a>
							</li>
						</ul></li>
				</ul></li>
			<li><a HREF="tables.html">人事异动</a>
				<ul>
					<li><a HREF="ygjz.html">员工就职</a></li>
					<li><a href="ygdd.html">员工调动</a></li>
					<li><a HREF="yglz.html">员工离职</a></li>
					<li><a href="ygddcx.html">员工调动查询</a></li>
				</ul></li>
			<li class="current"><a HREF="forms.html">奖惩管理</a>
				<ul>
					<li><a HREF="jcxxcx.html">奖惩信息查询</a></li>
					<li><a href="jcxxwh.html">奖惩信息维护</a></li>
				</ul></li>
			<li><a HREF="graphs.html">系统管理</a>
				<ul>
					<li><a HREF="bmxxwh.html">部门信息维护</a></li>
					<li><a href="mmxg.html">密码修改</a></li>
					<li><a HREF="zwxxwh.html">职位信息维护</a></li>
					<li><a href="qxsz.html">权限设置</a></li>
				</ul></li>
			<li><a HREF="tables.html">考勤管理</a>
				<ul>
					<li><a HREF="kqxxcx.html">考勤信息查询</a></li>
					<li><a href="kqxxwh.html">考勤信息维护</a></li>
				</ul></li>
			<li><a HREF="forms.html">工资管理</a>
				<ul>
					<li><a HREF="gzxxcx.html">工资信息查询</a></li>
					<li><a href="gzxxwh.html">工资信息维护</a></li>
					<li><a href="gzff.html">工资发放</a></li>
				</ul></li>
			<li><a HREF="graphs.html">帮助说明</a>
				<ul>
					<li><a HREF="rjsm.html">软件说明</a></li>
					<li><a href="yhsc.html">用户手册</a></li>
				</ul></li>
		</ul>
		</nav>
		<!-- End of Main navigation -->
		<!-- Aside links -->
		<aside> <b>English</b> &middot; <a href="#">Spanish</a>
		&middot; <a href="#">German</a></aside>
		<!-- End of Aside links -->
	</div>
	</header>
	<!-- End of Header -->
	<!-- Page title -->
	<div id="pagetitle">
		<div class="wrapper">
			<h1>奖惩信息维护修改</h1>
			<!-- Quick search box -->
			<form action="" method="get">
				<input class="" type="text" id="q" name="q" />
			</form>
		</div>
	</div>
	<!-- End of Page title -->

	<!-- Page content -->
	<div id="page">
		<!-- Wrapper -->
		<div class="wrapper">
			<div class="clear">&nbsp;</div>

			<h3>Data tables</h3>

			<form action="./JcxxbServlet" method="post"
				onsubmit="return checkUser();" name="postForm">
				<input type="hidden" name="jcxxbid" value="${jcxxb.ygh}" /> <input
					type="hidden" name="action" value="updatejcxxb" />
				<table class="stylized full">
					<caption>权限修改数据</caption>
					<thead>
						<tr>
							<th>名称</th>
							<th>信息</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>员工号</td>
							<td>${jcxxb.ygh}</td>
						</tr>
						<tr>
							<td>姓名</td>
							<td><input type="text" id="jcxxbxm" class="half"
								value="${jcxxb.xm}" name="jcxxbxm" /></td>
						</tr>
						<tr>
							<td>奖惩类别</td>
							<td><input type="text" id="jcxxbjclb" class="half"
								value="${jcxxb.jclb}" name="jcxxbjclb" />
							</td>
						</tr>
						<tr>
							<td>附加工资</td>
							<td><input type="text" id="jcxxbfjgz" class="half"
								value="${jcxxb.fjgz}" name="jcxxbfjgz" /></td>
						</tr>
						<tr>
							<td>奖惩日期</td>
							<td><input type="text" id="jcxxbjcrq" class="half"
								value="${jcxxb.jcrq}" name="jcxxbjcrq" />
							</td>
						</tr>
						<tr>
							<td align="right"><input type="submit"
								class="btn btn-green big" value="确定" />
							</td>
							<td><input type="reset" class="btn" value="取消"
								onclick="javascript:history.go(-1);" />
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td colspan="5">Table footer</td>
						</tr>
					</tfoot>
				</table>
			</form>

			<div class="clear">&nbsp;</div>

			</section>
			<!-- End of Left column/section -->
		</div>
		<!-- End of Wrapper -->
	</div>
	<!-- End of Page content -->

	<!-- Page footer -->
	<footer id="bottom">
	<div class="wrapper">
		<nav> <a href="#">Dashboard</a> &middot; <a href="#">Content</a>
		&middot; <a href="#">Reports</a> &middot; <a href="#">Users</a>
		&middot; <a href="#">Media</a> &middot; <a href="#">Events</a>
		&middot; <a href="#">Newsletter</a> &middot; <a href="#">Settings</a>
		</nav>
		<p>Copyright &copy; 2010</p>
	</div>
	</footer>
	<!-- End of Page footer -->

	<!-- Animated footer -->
	<footer id="animated">
	<ul>
		<li><a href="#">Dashboard</a>
		</li>
		<li><a href="#">Content</a>
		</li>
		<li><a href="#">Reports</a>
		</li>
		<li><a href="#">Users</a>
		</li>
		<li><a href="#">Media</a>
		</li>
		<li><a href="#">Events</a>
		</li>
		<li><a href="#">Newsletter</a>
		</li>
		<li><a href="#">Settings</a>
		</li>
	</ul>
	</footer>
	<!-- End of Animated footer -->

	<!-- Scroll to top link -->
	<a href="#" id="totop">^ scroll to top</a>

	<!-- User interface javascript load -->
	<script type="text/javascript" SRC="js/administry.js"></script>
</body>
</html>
