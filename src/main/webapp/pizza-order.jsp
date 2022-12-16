<%--
  Created by IntelliJ IDEA.
  User: gabriellekhokhar
  Date: 12/16/22
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Pizza Prison</title>
</head>
<body>
<form action="PizzaOrder" method="post">

  <label for="crust">Choose a Crust:</label>

  <select name="crust" id="crust">
    <option value="thin">Thin</option>
    <option value="hand-tossed">Hand Tossed</option>
    <option value="deep-dish">Deep Dish</option>
  </select>

  <label for="sauce">Choose a Sauce:</label>

  <select name="sauce" id="sauce">
    <option value="red">Red</option>
    <option value="white">White</option>
  </select>

  <label for="size">Choose a Size:</label>

  <select name="size" id="size">
    <option value="10">Small</option>
    <option value="12">Medium</option>
    <option value="14">Large</option>
    <option value="16">XL</option>
  </select>

  <fieldset>
    <legend>Choose your toppings</legend>
    <div name="toppings">
      <input type="checkbox" id="pepperoni" name="check" value="pepperoni" />
      <label for="pepperoni">Pepperoni</label>

      <input type="checkbox" id="bacon" name="check" value="bacon" />
      <label for="bacon">Bacon</label>

      <input type="checkbox" id="Salami" name="check" value="Salami" />
      <label for="Salami">Salami</label>

      <input type="checkbox" id="sausage" name="check" value="sausage" />
      <label for="sausage">Sausage</label>
    </div>
  </fieldset>
  <label for="address">Delivery Address</label>
  <input type="text" name="address"/>
  <button type="submit">Submit</button>
</form>
</body>
</html>