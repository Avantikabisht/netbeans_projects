<%@page import="newpackage.Getdata"%>
<%@page import="java.sql.ResultSet"%>
<%
    try{
    ResultSet rs= new Getdata().data();
    while(rs.next())
    {
        out.print("name="+rs.getString("username")+"<br>"+"password="+rs.getString("password"));
    }
    }catch(Exception e){}
%>