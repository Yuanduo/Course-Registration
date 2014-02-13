<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>教务学生选课系统</title>
    <link href="css/css.css" rel="stylesheet" type="text/css" />
    
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
<%--	<link rel="stylesheet" type="text/css" href="styles.css">--%>
	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

  </head>
  
  <body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" style="overflow:auto;">  
  <div class="zhong">
  <div class="banner"><img src="images/img_2.gif" /></div>
  <div class="menu">
  <div class="menusel" style="width:95px;">
    <h2><a href="index.html">首页</a></h2>
  </div>   
  </div>
  <div class="main">
    <div class="left">
      <div class="box_1">
        <div class="left_title">用户中心</div>
        <table width="100%" border="0" cellspacing="0" cellpadding="0" >
          <s:form action="Login" >
            <s:select list="{'学生','教师','管理员'}" name="identity" headerkey = '0' ></s:select>  
    		用户名：<s:textfield  name="username" label="" theme="simple"/><br>
    		密码：<s:password name="password" label="" theme="simple"/>
    		<p>您的身份是：
    		<td colspan="2">
    		<s:submit value="login" type="image" src="images/img_4.gif"  theme="simple"></s:submit> 
    		<s:submit value="regist" type="image" src="images/img_5.gif"  theme="simple"/>
    		<s:submit value="findpass" type="image" src="images/img_6.gif"  theme="simple"/>           
            </td></p>
		</s:form> 	
        </table>
      </div>
      <div class="box_1">
        <div class="left_title">最新公告</div>
        <div class="left_nr">
          <ul>
            <li><a href="http://www.bupt.edu.cn/content/content.php?p=0_15_917">召开学生工作会议</a></li>

            <li><a href="http://www.bupt.edu.cn/content/content.php?p=0_15_916">校友分会成立</a></li>

            <li><a href="http://www.bupt.edu.cn/content/content.php?p=0_15_914">召开青年教师座谈会</a></li>

            <li><a href="http://www.bupt.edu.cn/content/content.php?p=0_15_915">两项科研成果荣获中科学技术奖一等奖</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="right">
      <div class="right_top_img"><img src="images/img_3.gif" /></div>
      <img src="images/img_8.gif" style="float:left"/>
      <div class="news">
        <div class="news_title"><span><img src="images/title_1.gif" /></span><a href="http://sc.chinaz.com"><img src="images/more.gif" /></a></div>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="48%" height="18"><a href="http://sse.bupt.edu.cn/static/2012/04/2/4245.html">软件学院”五一“前夕领导带队检查安全</a></td>
            <td width="27%">21</td>
            <td width="25%" align="center">2012-04-25 13:04</td>
          </tr>
          <tr>
            <td width="48%" height="18"><a href="http://sse.bupt.edu.cn/static/2012/04/2/4243.html">春风拂面暖人心 软件学院咨询忙</a></td>
            <td width="27%">21</td>
            <td width="25%" align="center">2012-04-23 10:04	</td>
          </tr>
          <tr>
            <td width="48%" height="18"><a href="http://sse.bupt.edu.cn/static/2012/04/2/4242.html"> 坚持基本标准 严格进行评审</a></td>
            <td width="27%">21</td>
            <td width="25%" align="center">2012-04-23 10:04	</td>
          </tr>
        </table>
      </div>
    </div>
    <div class="clear"></div>
    <div class="huoban">
      <div class="huoban_title"><img src="images/title_2.gif" /></div>
      <div class="huoban_nr">
        <ul>
          <li><img src="images/001.gif" /></li>
        </ul>
        <div class="clear"></div>
      </div>
    </div>
  </div>
  <div class="bottom"> 企业信息化作业——教务学生选课系统 </div>
</div>
<script src="js/meun.js" type="text/javascript"></script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
  </body>
</html>
