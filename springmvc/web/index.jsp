<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/18
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>这是标题!</title>
  <!-- 引用css -->
  <link rel="stylesheet" type="text/css" href="mycss.css">
  <!-- 引用脚本 -->
  <script type="application/javascript" src="myjs.js"></script>
</head>
<body>
hello world!
<img src="Koala.gif" width="200px" height="20px">
<p>
  this is a p element!!
</p>
<div id="div1">
  this is a div !!!
</div>
<a class="a_1" href="http://www.baidu.com">进入百度</a>
<a class="a_2" href="http://www.sohu.com">进入搜狐</a>
<input id="btn1" type="button" value="ok" onclick="f1()">
<h1>1号标题</h1>
<table border="0px solid blue"
       cellpadding="0px"
       cellspacing="0px"
       style="border-collapse: collapse">
  <tr>
    <td>id</td>
    <td>name</td>
    <td>age</td>
  </tr>
  <tr>
    <td>1</td>
    <td>tom1</td>
    <td>10</td>
  </tr>
</table>
<form action="http://www.baidu.com" method="post">
  username : <input type="text" name="username"><br>
  password : <input type="password" name="password"><br>
  Sex : <input type="radio" name="sex" value="0">男
  <input type="radio" name="sex" value="1">女<br>
  hobby : <input type="checkbox" name="hobby" value="0">足球
  <input type="checkbox" name="hobby" value="1">排球<br>
  目的地:
  <select name="dest">
    <option value="0">北京市</option>
    <option value="1">河北省</option>
    <option value="2">河南省</option>
  </select>
  <br>
  选课:
  <select name="course" multiple>
    <option value="0">计算机</option>
    <option value="1">大语文</option>
    <option value="2">书法</option>
  </select>
  <br>
  描述:
  <textarea name="description" rows="5" cols="20"></textarea><br>
  文件:
  <input name="file" type="file">
  <input type="submit" value="提交表单">
</form>

</body>
</html>
