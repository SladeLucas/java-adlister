
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <title>login page</title>
</head>
<body>
<h1>Login Page</h1>
<div>
    <form action = "login.jsp" method = "POST">
        <div class="container">
            <label><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="uname" required>

            <label><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required>

            <button type="submit" value = "Submit">Login</button>
            <label>
                <input type="checkbox" checked="checked" name="remember"> Remember me
            </label>
        </div>

        <div class="container" style="background-color:#f1f1f1">
            <button type="button" class="cancelbtn">Cancel</button>
            <span class="psw">Forgot <a href="#">password?</a></span>
        </div>
    </form>
</div>
</body>
</html>
