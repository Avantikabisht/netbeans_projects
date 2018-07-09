
<%@include  file="index.html" %> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <h1>Hello World!</h1>
        <%! int i;%>
        <% String num = request.getParameter("number");
            int n = Integer.parseInt(num);
        %>
        <table border="1">

            <tr><th>multiple of= <%= n%>;</th>
                <th>result</th>
            </tr>
            <% for (i = 1; i < 11; i += 1) {%>

            <tr>
                <td><%= i%>*<%= n%>
                </td>
                <td>
                    <%= (i * n)%>
                </td>
            </tr>
            <% } 
           // RequestDispatcher rd = request.getRequestDispatcher("index.html");
       //rd.include(request,response);
            %>
        </table>
        
    </body>
</html>


