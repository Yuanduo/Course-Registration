<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="action.User"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% User user = (User)session.getAttribute("user");  
   String username = (String)user.getUsername();
%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>教务学生选课系统</title>
<link href="css/css.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="zhong">
  <div class="banner"><img src="images/img_2.gif" /></div>
  <div class="menu">
    <div class="menusel" style="width:95px;">
      <h2><a href="welcome.jsp">首页</a></h2>
    </div>
    <div id="menu1" class="menusel">
      <h2><a href="regcourse.jsp">选课管理</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="regcourse.jsp">选课方案</a></li>
          <li><a href="course.jsp">已选课程</a></li>
          <li class="lli"><a href="cancelCourse.jsp">退选课程</a></li>
        </ul>
      </div>
    </div>
    <div id="menu2" class="menusel">
      <h2><a href="sPW.jsp">个人信息</a></h2>
      <div class="position">
        </ul>--> 
      </div>
    </div>
  </div>
  
  
  <div class="meun_2">欢迎你，<%=username %>。 </div>
  <div class="main">
    <div class="left">
      <div class="box_1">
        <div class="left_title">公告栏</div>
        <div class="left_news">
          <ul>
            <li><a href="#" class="hover">选课公告</a></li>
            <li><a href="#">学生公告</a></li>
            <li><a href="#">成绩公告</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="right">
	
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p><strong>您的登陆身份为：本科生 </strong></p>
      
      <table width="100%" border="0" cellspacing="0" cellpadding="0" >
          <s:form action="changePwAction" method="post">
    		旧密码     ：<s:password  name="oldpassword" label="" theme="simple"/><br/>
    		新密码     ：<s:password name="newpassword1" label="" theme="simple"/><br/>
    		确认密码：<s:password  name="newpassword2" label="" theme="simple"/><br/>	
    		<td colspan="2">
    		<s:submit value="修改"></s:submit> 
            </td>
		</s:form> 	
        </table>
    </div>
    <div class="clear"></div>
</div>
<script src="js/meun.js" type="text/javascript"></script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div></body>
</html>
