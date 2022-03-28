<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/27/2022
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/sandwich" method="post">
    <fieldset>
        <legend>Sandwich Condiment</legend>
        <div>
            Lettuce <input type="checkbox" name="condiment" value="lettuce">
        </div>
        <div>
            Tomato <input type="checkbox" name="condiment" value="tomato">
        </div>
        <div>
            Mustard <input type="checkbox" name="condiment" value="mustard">
        </div>
        <div>
            Sprouts <input type="checkbox" name="condiment" value="sprouts">
        </div>
        <button>Click</button>
    </fieldset>
</form>
<div>
    Your choices: ${res}
</div>
</body>
</html>
