<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/27/2022
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      input{
        margin-left: 10px;
        margin-bottom: 10px;
      }
      button{
        margin-left: 5px;
      }
    </style>
  </head>
  <body>
  <h1>Calculator</h1>
  <form action="/computer" method="post">
    <div>
      <input name="val1">
      <input name="val2">
    </div>
    <div>
      <button type="submit" name="operator" value="+">Addition(+)</button>
      <button type="submit" name="operator" value="-">Subtraction(-)</button>
      <button type="submit" name="operator" value="*">Multiplication(*)</button>
      <button type="submit" name="operator" value="/">Division(/)</button>
    </div>
  </form>
  <c:if test="${res!=null}">
    <div>
      Result: ${res}
    </div>
  </c:if>
  </body>
</html>
