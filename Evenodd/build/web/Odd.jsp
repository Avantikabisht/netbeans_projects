<%@ page import ="newpackage.NewServlet" %>
<%@include  file="index.html" %>
<% String  n =(String)request.getParameter("var"); %>
<% int nn=Integer.parseInt(n); %>
<%= "cube="+(nn*nn*nn) %>






















