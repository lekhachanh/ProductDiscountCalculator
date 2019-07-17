<%--
  Created by IntelliJ IDEA.
  User: lekhachanh
  Date: 17/07/2019
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/calculator">
    <table>
      <tr>
        <th colspan="2">Product Discount Calculator</th>
      </tr>
      <tr>
        <td>Product Description:</td>
        <td><input type="text" name="productDescription"></td>
      </tr>
      <tr>
        <td>List Price:</td>
        <td><input type="text" name="listPrice"></td>
      </tr>
      <tr>
        <td>Discount Percent</td>
        <td><input type="text" name="discountPercent">(%)</td>

      </tr>
      <tr>
        <td></td>
        <td><input type="submit" id="calculateDiscount" value="calculate Discount"></td>
      </tr>
    </table>
  </form>
  </body>
</html>
