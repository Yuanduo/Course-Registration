<%@ page language="java" import="java.util.*" import="action.User" pageEncoding="UTF-8" import="db.AbstractCourse" import="db.Course"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% User user = (User)session.getAttribute("user");
   String username=user.getUsername();%>
<% Course course = (Course)session.getAttribute("editCourse");
   String cname = course.getCname();
   String cid = course.getCid().toString();
   String cdescription = course.getCdescription();%>
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
      <h2><a href="teacher.jsp">首页</a></h2>
    </div>
    <div id="menu1" class="menusel">
      <h2><a href="teacher.jsp">选课管理</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="tCourseInfo.jsp">查看课程信息</a></li>
          <li><a href="tEditCourse.jsp">录入课程信息</a></li>
        </ul>
      </div>
    </div>
    <div id="menu2" class="menusel">
      <h2><a href="teacherInfo.jsp">个人信息</a></h2>
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
            <li><a href="#">教务公告</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="right">
      
      <p><strong>您的登陆身份为：教师 </strong></p>
    </div>
    <div class="right">
    <s:form action="changeDiscrib" width="100%">
    	<br/>
    	<tr><td>课程ID： <%=cid %></td></tr>
    	<tr><td>课程名称：<%=cname %></td></tr>
    	<tr><td>课程描述：<%=cdescription %></td></tr>
    	<tr><td>新描述：<s:textfield name="discription" theme="simple"></s:textfield>
    	
    	<s:submit theme="simple" value="提交"></s:submit></td>
    	</tr>
    </s:form>
    	
    </div>
    <div>
    	
    </div>
    <div class="clear"></div>
</div>
<script src="js/meun.js" type="text/javascript"></script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div></body>
</html>
