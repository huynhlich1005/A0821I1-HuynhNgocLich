<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/28/2022
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Setting</h1>
<form action="/update" method="post">
    <div>
        Languages:
        <select name="language">
            <option ${res.language=='English'?'selected':''}>English</option>
            <option ${res.language=='Vietnam'?'selected':''}>Vietnam</option>
            <option ${res.language=='Korea'?'selected':''}>Korea</option>
        </select>
    </div>
    <div>
        Show:
        <select name="pageSize">
            <option ${res.pageSize==10?'selected':''}>10</option>
            <option ${res.pageSize==15?'selected':''}>15</option>
            <option ${res.pageSize==20?'selected':''}>20</option>
        </select>
        emails per page
    </div>

    <div>
        Spam filter:
        <input type="checkbox" ${res.spamFilter ?'checked':''} name="spamFilter"> Enable spam filters
    </div>
    <div>
        Singature:
        <textarea rows="5" cols="10" name="singature">${res.singature}</textarea>
    </div>
    <button>Update</button>
    <button>Cancel</button>
</body>
</html>
