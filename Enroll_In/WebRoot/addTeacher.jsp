<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>教务教师选课系统</title>
<link href="css/css.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="zhong">
  <div class="banner"><img src="images/img_2.gif" /></div>
  <div class="menu">
    <div class="menusel" style="width:95px;">
      <h2><a href="addCourse.jsp">课程管理</a></h2>
    </div>
    <div id="menu1" class="menusel">
      <h2><a href="#">用户管理</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="addStudent.jsp">教师录入</a></li>
          <li class="lli"><a href="addTeacher.jsp">教师录入</a></li>
        </ul>
      </div>
    </div>
    <div id="menu2" class="menusel">
      <h2><a href="changePw.jsp">修改信息</a></h2>
      <div class="position">
      </div>
    </div>
  </div>
  
  
  <div class="meun_2">欢迎你，<s:property value="#session.user.username"/>。 </div>
  <div class="main">
    <div class="left">
      <div class="box_1">
        <div class="left_title">公告栏</div>
        <div class="left_news">
          <ul>
            <li><a href="#" class="hover">选课公告</a></li>
            <li><a href="#">教师公告</a></li>
            <li><a href="#">成绩公告</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="right">
	
      <p>&nbsp;</p>
      <p>&nbsp;</p>
       
      <s:form action="addTeacherAction" method="post">

      <table width="100%" border="0" cellspacing="0" cellpadding="0" >
        <tr>
          <!-- 实际上是addUserAction.getUsers.get(i).setUsername()-->      
          <td><b>教师ID：</b><input type="text"  name="teachers[0].tid" size=14/></td>
          <td><b>教师姓名：</b><input type="text"  name="teachers[0].tname" size=14/></td>
          <td><b>教师密码：</b><input type="password"  name="teachers[0].tpsw" size =14/></td>
          </tr>
          
          <tr>
          <td><b>教师ID：</b><input type="text"  name="teachers[1].tid" size=14/></td>
          <td><b>教师姓名：</b><input type="text"  name="teachers[1].tname" size=14/></td>
          <td><b>教师密码：</b><input type="password"  name="teachers[1].tpsw" size =14/></td>
          </tr>
      
          <tr>
          <td><b>教师ID：</b><input type="text"  name="teachers[2].tid" size=14/></td>
          <td><b>教师姓名：</b><input type="text"  name="teachers[2].tname" size=14/></td>
          <td><b>教师密码：</b><input type="password"  name="teachers[2].tpsw" size =14/></td>
          </tr>
          
          <tr>
          <td><b>教师ID：</b><input type="text"  name="teachers[3].tid" size=14/></td>
          <td><b>教师姓名：</b><input type="text"  name="teachers[3].tname" size=14/></td>
          <td><b>教师密码：</b><input type="password"  name="teachers[3].tpsw" size =14/></td>
          </tr>
          
          <tr>
          <td><b>教师ID：</b><input type="text"  name="teachers[4].tid" size=14/></td>
          <td><b>教师姓名：</b><input type="text"  name="teachers[4].tname" size=14/></td>
          <td><b>教师密码：</b><input type="password"  name="teachers[4].tpsw" size =14/></td>
          </tr>
          
        </table>
        <br/><br/><br/>
    <span style="display:block; width:600px; text-align:center">
    <input type="submit" value="提交"/>
    <input type="reset" value="重置"/> 
    </span>

	</s:form> 	
        
    </div>
    <div class="clear"></div>
  <!--<div class="bottom">企业信息化作业——教务教师选课系统</div>!-->
</div>
<script src="js/meun.js" type="text/javascript"></script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div></body>
</html>
