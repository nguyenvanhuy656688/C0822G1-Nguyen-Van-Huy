<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/5/2022
  Time: 11:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>View Product</h1>
<a href="/product">Back list</a>

<form>
    <pre>Name:        ${product.getName()}</pre>
    <pre>Price:       ${product.getPrice()}</pre>
    <pre>Description: ${product.getType()}</pre>
    <pre>Manufacturer:${product.getUnit()}</pre>
    <pre>Manufacturer:${product.getSize()}</pre>
</form>
</body>
</html>
