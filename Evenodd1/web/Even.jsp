<%@ page import ="newpackage.NewServlet" %>
<%@include  file="index.html" %> 
<% String n=(String)request.getAttribute("num"); %>
<% int nn=Integer.parseInt(n); %>
<%= "square= "+(nn*nn) %>

