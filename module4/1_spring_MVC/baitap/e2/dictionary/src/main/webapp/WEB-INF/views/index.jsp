<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/21/2022
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/translate" method="post">
    <div>Input a english word: <input name="eng" value="${eng}"></div>
    <div>Result: <label>${res}</label></div>
    <button>Translate</button>
  </form>
  </body>
</html>
