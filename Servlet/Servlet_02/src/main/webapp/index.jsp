<!DOCTYPE html>
<html>
<head>
    <title>Basic Form</title>
</head>
<body>

<form method="post" action="./Servlet_02" style="width:300px; margin:20px auto; padding:20px; border:1px solid #ccc; border-radius:5px;">
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
        <textarea name="address" rows="4"
                  style="width:100%; padding:8px; margin:5px 0 10px 0;"></textarea><br>

        <input type="submit" value="Submit"
               style="width:100%; padding:10px; background-color:#4CAF50; color:white; border:none; cursor:pointer;">

    </form>

</body>
</html>