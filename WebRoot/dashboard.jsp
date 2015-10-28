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
<title>Admin</title>
<meta name="description"
	content="Administry - Admin Template by www.865171.cn" />
<meta name="keywords" content="Admin,Template" />
<!-- We need to emulate IE7 only when we are to use excanvas -->
<!--[if IE]>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
<![endif]-->
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
<!-- jQuery graph plugins -->
<!--[if IE]><script type="text/javascript" src="js/flot/excanvas.min.js"></script><![endif]-->
<script type="text/javascript" SRC="js/flot/jquery.flot.min.js"></script>
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
	$(document).ready(
			function() {

				/* setup navigation, content boxes, etc... */
				Administry.setup();

				/* progress bar animations - setting initial values */
				Administry.progress("#progress1", 1, 5);
				Administry.progress("#progress2", 2, 5);
				Administry.progress("#progress3", 2, 5);

				/* flot graphs */
				var sales = [
						{
							label : 'Total Paid',
							data : [ [ 1, 0 ], [ 2, 0 ], [ 3, 0 ], [ 4, 0 ],
									[ 5, 0 ], [ 6, 0 ], [ 7, 900 ], [ 8, 0 ],
									[ 9, 0 ], [ 10, 0 ], [ 11, 0 ], [ 12, 0 ] ]
						},
						{
							label : 'Total Due',
							data : [ [ 1, 0 ], [ 2, 0 ], [ 3, 0 ], [ 4, 0 ],
									[ 5, 0 ], [ 6, 422.10 ], [ 7, 0 ],
									[ 8, 0 ], [ 9, 0 ], [ 10, 0 ], [ 11, 0 ],
									[ 12, 0 ] ]
						} ];

				var plot = $.plot($("#placeholder"), sales, {
					bars : {
						show : true,
						lineWidth : 1
					},
					legend : {
						position : "nw"
					},
					xaxis : {
						ticks : [ [ 1, "Jan" ], [ 2, "Feb" ], [ 3, "Mar" ],
								[ 4, "Apr" ], [ 5, "May" ], [ 6, "Jun" ],
								[ 7, "Jul" ], [ 8, "Aug" ], [ 9, "Sep" ],
								[ 10, "Oct" ], [ 11, "Nov" ], [ 12, "Dec" ] ]
					},
					yaxis : {
						min : 0,
						max : 1000
					},
					grid : {
						color : "#666"
					},
					colors : [ "#0a0", "#f00" ]
				});

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
<body onload="onLoad()">
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
			</a> 登录名： <b>${xm}</b> <span>|</span> <a href="#">设置</a> <span>|</span>
			<a href="Login.jsp">退出</a><br /> <!-- <small>You have <a href="#"
				class="high"><b>1</b> new message!</a> </small> -->
		</div>
		<!-- End of Top navigation -->
		<!-- Main navigation -->
		<nav id="menu">
		<ul class="sf-menu">
			<li class="current"><a HREF="dashboard.jsp">首页</a></li>
			<li><a HREF="styles.html">人事管理</a>
				<ul>
					<li><a HREF="./ygxxbservlet?action=cxygxx">查询员工信息</a>
					</li>
					<li><a href="./ygxxbservlet?action=whygxx">维护员工信息</a> <!-- <ul>
									<li><a HREF="ygddxxbServlet">维护员工信息</a></li>
									<li><a HREF="whygxxzj.jsp">增加员工</a></li>
								</ul> -->
					</li>
				</ul>
			</li>
			<li><a HREF="tables.html">人事异动</a>
				<ul>
					<li><a HREF="whygxxzj.jsp">员工就职</a>
					</li>
					<li><a href="./YgddxxbServlet?action=ygdd">员工调动</a>
					</li>
					<li><a HREF="yglz.html">员工离职</a>
					</li>
					<li><a href="ygddcx.html">员工调动查询</a>
					</li>
				</ul>
			</li>
			<li><a HREF="forms.html">奖惩管理</a>
				<ul>
					<li><a HREF="./JcxxbServlet?action=jcxxcx">奖惩信息查询</a>
					</li>
					<li><a href="./JcxxbServlet?action=jcxxwh">奖惩信息维护</a>
					</li>
				</ul>
			</li>
			<li><a HREF="graphs.html">系统管理</a>
				<ul>
					<li><a HREF="./BmxxbServlet?action=bmxxwh">部门信息维护</a>
					</li>
					<li><a href="mmxg.html">密码修改</a>
					</li>
					<li><a HREF="./YgzwxxbServlet?action=zwxxwh">职位信息维护</a>
					</li>
					<li><a href="./userservlet?action=qxsz&userid=${user.ygh}">权限设置</a>
					</li>
				</ul>
			</li>
			<li><a HREF="tables.html">考勤管理</a>
				<ul>
					<li><a HREF="./YgkqxxbServlet?action=kqxxcx">考勤信息查询</a>
					</li>
					<li><a href="./YgkqxxbServlet?action=kqxxwh">考勤信息维护</a>
					</li>
				</ul>
			</li>
			<li><a HREF="forms.html">工资管理</a>
				<ul>
					<li><a HREF="./SjgzbServlet?action=gzxxcx">工资信息查询</a>
					</li>
					<li><a href="./SjgzbServlet?action=gzxxwh">工资信息维护</a>
					</li>
					<li><a href="gzff.html">工资发放</a>
					</li>
				</ul>
			</li>
			<li><a HREF="graphs.html">帮助说明</a>
				<ul>
					<li><a HREF="rjsm.html">软件说明</a>
					</li>
					<li><a href="yhsc.html">用户手册</a>
					</li>
				</ul>
			</li>
		</ul>
		</nav>
		<!-- End of Main navigation -->
		<!-- Aside links -->
		<!-- <aside> <b>English</b> &middot; <a href="#">Spanish</a>
		&middot; <a href="#">German</a></aside> -->
		<!-- End of Aside links -->
	</div>
	</header>
	<!-- End of Header -->
	<!-- Page title -->
	<div id="pagetitle">
		<div class="wrapper">
			<h1>
				<div id="getsystemtime"></div>
			</h1>
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
			<!-- Left column/section -->
			<section class="column width6 first">

			<div class="colgroup leading">
				<div class="column width3 first">
					<h3>
						欢迎登录中小学人事管理系统： <a href="#">${xm}</a>
					</h3>
					<p>
						您为中小学人事管理系统：<b><c:if test="${user.qx==1}">
								<td class="center"><c:out value="管理员" /></td>
							</c:if> <c:if test="${user.qx==2}">
								<td class="center"><c:out value="普通员工" /></td>
							</c:if> </b><br />
						<!-- <a href="#">Upgrade now?</a> -->
					</p>
					<!-- <p>
						登录中小学人事管理系统次数： <b>1</b><br />
						<a href="#">Upgrade now?</a>
					</p> -->
				</div>
				<div class="column width3">
					<h4>最近登录时间</h4>
					<p>
						20140401 上午<br /> 没有异常登录现象。
					</p>
				</div>
			</div>

			<div class="colgroup leading">
				<div class="column width3 first">
					<h4>
						员工总数: <a href="#"></a>${ygzs} 位
					</h4>
					<hr />
					<table class="no-style full">
						<tbody>
							<tr>
								<td>新员工</td>
								<td class="ta-right"><a href="#"></a>1 位</td>
								<td class="ta-right">
									<!-- 1,322.10 &euro; --></td>
							</tr>
							<tr>
								<td>初级</td>
								<td class="ta-right"><a href="#"></a>4 位</td>
								<td class="ta-right">
									<!-- 900.00 &euro; --></td>
							</tr>
							<tr>
								<td>中级</td>
								<td class="ta-right"><a href="#"></a>3 位</td>
								<td class="ta-right">
									<!-- 422.10 &euro; --></td>
							</tr>
							<tr>
								<td>高级</td>
								<td class="ta-right">2 位</td>
								<td class="ta-right">
									<!-- 0.00 &euro; --></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="column width3">
					<h4>
						奖惩员工: <a href="#">3 位</a>
					</h4>
					<hr />
					<table class="no-style full">
						<tbody>
							<tr>
								<td>小功</td>
								<td class="ta-right"><a href="#"></a>1 位</td>
								<td class="ta-right"></td>
							</tr>
							<tr>
								<td>大功</td>
								<td class="ta-right"><a href="#"></a>1 位</td>
								<td class="ta-right">
									<!-- 900.00 &euro; --></td>
							</tr>
							<tr>
								<td>小过</td>
								<td class="ta-right"><a href="#"></a>1 位</td>
								<td class="ta-right"></td>
							</tr>
							<tr>
								<td>大过</td>
								<td class="ta-right"><a href="#"></a>0 位</td>
								<td class="ta-right">
									<!-- 900.00 &euro; --></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>

			<div class="colgroup leading">
				<div class="column width3 first">
					<h4>Client Stats</h4>
					<hr />
					<table class="no-style full">
						<tbody>
							<tr>
								<td>Active</td>
								<td class="ta-right">1/5</td>
								<td><div id="progress1"
										class="progress full progress-green">
										<span><b></b> </span>
									</div></td>
							</tr>
							<tr>
								<td>Pending</td>
								<td class="ta-right">2/5</td>
								<td><div id="progress2" class="progress full progress-blue">
										<span><b></b> </span>
									</div></td>
							</tr>
							<tr>
								<td>Suspended</td>
								<td class="ta-right">2/5</td>
								<td><div id="progress3" class="progress full progress-red">
										<span><b></b> </span>
									</div></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="column width3">
					<h4>Reports</h4>
					<hr />
					<p>
						<b>Sales this year</b>
					</p>
					<div id="placeholder" style="height:100px"></div>
				</div>
			</div>
			<div class="clear">&nbsp;</div>

			</section>
			<!-- End of Left column/section -->

			<!-- Right column/section -->
			<aside class="column width2">
			<div id="rightmenu">
				<header>
				<h3>Your Account</h3>
				</header>
				<dl class="first">
					<dt>
						<img width="16" height="16" alt="" SRC="img/key.png">
					</dt>
					<dd>
						<a href="#">Administry (admin)</a>
					</dd>
					<dd class="last">Free Account.</dd>

					<dt>
						<img width="16" height="16" alt="" SRC="img/help.png">
					</dt>
					<dd>
						<a href="#">Support</a>
					</dd>
					<dd class="last">Documentation and FAQ</dd>
				</dl>
			</div>
			<div class="content-box">
				<header>
				<h3>Latest in the Community</h3>
				</header>
				<section>
				<dl>
					<dt>Maximize every interaction with a client</dt>
					<dd>
						<a href="#">Read more</a>
					</dd>
					<dt>Diversification for Small Business Owners</dt>
					<dd>
						<a href="#">Read more</a>
					</dd>
				</dl>
				</section>
			</div>
			</aside>
			<!-- End of Right column/section -->

		</div>
		<!-- End of Wrapper -->
	</div>
	<!-- End of Page content -->

	<!-- Page footer -->
	<footer id="bottom">
	<div class="wrapper">
		<nav> <a href="#">首页</a> &middot; <a href="#">人事管理</a> &middot;
		<a href="#">Reports</a> &middot; <a href="#">Users</a> &middot; <a
			href="#">Media</a> &middot; <a href="#">Events</a> &middot; <a
			href="#">Newsletter</a> &middot; <a href="#">Settings</a> </nav>
		<p>Copyright &copy; 2010</p>
	</div>
	</footer>
	<!-- End of Page footer -->

	<!-- Animated footer -->
	<footer id="animated">
	<ul>
		<li><a href="#">首页</a></li>
		<li><a href="#">人事管理</a></li>
		<li><a href="#">Reports</a></li>
		<li><a href="#">Users</a></li>
		<li><a href="#">Media</a></li>
		<li><a href="#">Events</a></li>
		<li><a href="#">Newsletter</a></li>
		<li><a href="#">Settings</a></li>
	</ul>
	</footer>
	<!-- End of Animated footer -->

	<!-- Scroll to top link -->
	<a href="#" id="totop">^ scroll to top</a>

	<!-- Admin template javascript load -->
	<script type="text/javascript" SRC="js/administry.js"></script>
</body>
</html>