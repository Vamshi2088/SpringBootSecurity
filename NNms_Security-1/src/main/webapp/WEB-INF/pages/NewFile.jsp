

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" /><br />
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" /><br />
        <input type="submit" value="Log in" />
    </form>
</body>
</html>
