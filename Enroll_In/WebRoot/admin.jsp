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
<title>教务学生选课系统</title>
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
          <li><a href="addStudent.jsp">学生录入</a></li>
          <li class="lli"><a href="addTeacher.jsp">教师录入</a></li>
        </ul>
      </div>
    </div>
    <div id="menu2" class="menusel">
      <h2><a href="changePw.jsp">修改信息</a></h2>
      <div class="position">
    <!--     <ul class="clearfix typeul">
        </ul>--> 
      </div>
    </div>
<!--  <div id="menu3" class="menusel">
      <h2><a href="xinwen.html">新闻信息</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="http://sc.chinaz.com">行业新闻</a></li>
          <li><a href="http://sc.chinaz.com">公司新闻</a></li>
          <li class="lli"><a href="http://sc.chinaz.com">技术文摘</a></li>
        </ul>
      </div>
    </div>
    <div id="menu4" class="menusel">
      <h2><a href="http://sc.chinaz.com">下载中心</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li class="lli"><a href="http://sc.chinaz.com">我们的软件</a></li>
        </ul>
      </div>
    </div>
    <div id="menu5" class="menusel">
      <h2><a href="http://sc.chinaz.com">诚聘英才</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
        </ul>
      </div>
    </div>
    <div id="menu6" class="menusel">
      <h2><a href="http://sc.chinaz.com">在线留言</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="http://sc.chinaz.com">发表留言</a></li>
          <li><a href="http://sc.chinaz.com">留言列表</a></li>
          <li><a href="http://sc.chinaz.com">留言</a></li>
          <li><a href="http://sc.chinaz.com">建议</a></li>
          <li class="lli"><a href="http://sc.chinaz.com">投诉</a></li>
        </ul>
      </div>
    </div>
    <div id="menu7" class="menusel">
      <h2><a href="http://sc.chinaz.com">论坛</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
        </ul>
      </div>
    </div>         !-->
  </div>
  
  
  <div class="meun_2">欢迎你，<s:property value="#session.user.username"/>。 </div>
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
	  <!--
      <div class="box_1">
        <div class="left_title">本站公告</div>
        <div class="left_nr">
          <ul>
            <li><a href="http://sc.chinaz.com">滚动滚动滚动滚动</a></li>
            <li><a href="http://sc.chinaz.com">穿透内网文件传输</a></li>
            <li><a href="http://sc.chinaz.com">网络版本的个人资料库</a></li>
            <li><a href="http://sc.chinaz.com">强大的手机短信双向功能</a></li>
          </ul>
        </div>
      </div>
      <div class="box_1" style="margin:0px;">
        <div class="left_title">产品分类</div>
        <div class="left_nr">
          <ul>
            <li><a href="http://sc.chinaz.com">WEB信息发布系列</a></li>
          </ul>
        </div>
      </div> !-->
    </div>
    <div class="right">
	
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p><strong>您的登陆身份为：教务员 </strong></p>
    </div>
    <div class="clear"></div>
  <!--<div class="bottom">企业信息化作业——教务学生选课系统</div>!-->
</div>
<script src="js/meun.js" type="text/javascript"></script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div></body>
</html>
