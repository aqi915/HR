<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>人事管理</title>
	<script type="text/javascript">
	function dopost(){
		postform.submit();
	}
	</script>
  </head>
  
  <body>
  <form name="postform" action="./userservlet" method="post" >
    This is my JSP page. <br>
    <input name="xm" type="text" id="xm" value="aqi"/> <br/>
    <input name="mm" type="password" id="mm" value="aqi"/><br>
    <input name="mm" type="button" id="mm" value="确定" onclick="dopost();"/>
    
    
   </form> 
  </body>
</html>
