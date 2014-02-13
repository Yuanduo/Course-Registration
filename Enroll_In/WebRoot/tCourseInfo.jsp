<%@ page language="java" import="java.util.*" import ="action.User" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<% User user=(User)session.getAttribute("user");
String username = user.getUsername();  %>
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
	
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p><strong>您的登陆身份为：教师 </strong></p>
      <s:form width="100%">
      <tr><p><strong>您所教课程信息：</strong></p></tr>
      <br/>
      <tr>
      	<th width="30%">课程名称</th>
      	<th width="30%">课程描述</th>
      	<th width="30%">所选学生列表</th>
      </tr>
      <s:iterator value="#session.teachCourse" var="course">
      <tr>
      <div align="left">
      	<td width="30%" align="center"><s:property value="#course.cname"/></td>
      	<td width="30%" align="center"><s:property value="#course.cdescription"/></td>
      	<td width="30%" align="center"><a href="studentOfCourse?id=<s:property value="#course.cid"/>">【选该课学生情况】</a></td>
      </div>
      </tr>
      </s:iterator>
      </s:form>
    </div>
    <div class="clear"></div>
</div>
<script src="js/meun.js" type="text/javascript"></script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div></body>
</html>
