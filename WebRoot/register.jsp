<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>   
<html>   
  <head>   
    <title> 注册页面 </title> 
  </head>   
  <body>   
    <h1 align="center">用户注册页面</h1>   
    <hr>   
   <div align="center">
     <s:form action="user/user_addUser" method="post">  
       <s:textfield name="userid" label="ID"></s:textfield>
       <s:textfield name="username" label="用户名"></s:textfield>   
       <s:textfield name="nickname" label="昵称"></s:textfield>
       <s:textfield name="occupation" label="职业"></s:textfield> 
       <s:submit value="注册"></s:submit>   
       <s:submit value="显示用户列表" method="list"></s:submit> 
   </s:form>   
   </div>   
  </body>   
  
</html> 