<!DOCTYPE html>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>


<form method="post" action="Servlet_03">

 <h2 style="text-align:center;">User Details</h2>


        <label>Name:</label><br>
        <input type="text" name="uname"
               style="width:100%; padding:8px; margin:5px 0 10px 0;"><br>

        <label>Phone:</label><br>
        <input type="tel" name="uphone"
               style="width:100%; padding:8px; margin:5px 0 10px 0;"><br>

        <label>Email:</label><br>
        <input type="email" name="uemail"
               style="width:100%; padding:8px; margin:5px 0 10px 0;"><br>

        <label>Address:</label><br>
        <textarea name="uaddress" rows="4"
                  style="width:100%; padding:8px; margin:5px 0 10px 0;"></textarea><br>

        <input type="submit" value="Submit"
               style="width:100%; padding:10px; background-color:#4CAF50; color:white; border:none; cursor:pointer;">


    <h1>Welcome User</h1>

    <%@ page import  = "java.util.date"
    %>

    <%!
        // this is the instance variable
        int age = 22;
    %>

    <%
        out.println("Current Time: " + new java.util.Date());
    %>

    <br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>