<%@page errorPage="error.jsp"  %>
<% String num1=request.getParameter("number1");
String num2=request.getParameter("number2");
int a = Integer.parseInt(num1);
int b= Integer.parseInt(num2);
double c= a/(b*1.0);
out.print("division ="+ c);
%>