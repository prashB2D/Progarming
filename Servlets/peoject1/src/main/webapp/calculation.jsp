<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%

String result = null;
String error = null;

String firstValue = request.getParameter("first");
String secondValue = request.getParameter("second");
String operation = request.getParameter("operation");

if (firstValue != null && secondValue != null) {

    try {

        double first = Double.parseDouble(firstValue);

        double second = Double.parseDouble(secondValue);


        if (operation.equals("add")) {

            result = String.valueOf(first + second);

        } else if (operation.equals("subtract")) {

            result = String.valueOf(first - second);

        } else if (operation.equals("multiply")) {

            result = String.valueOf(first * second);

        } else if (operation.equals("divide")) {

            if (second == 0) {

                error = "Cannot divide by zero";

            } else {

                result = String.valueOf(first / second);
            }
        }

    } catch (Exception e) {

        error = "Please enter valid numbers";

    }

}

%>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Calculation</title>

    <link rel="stylesheet" href="style.css">

</head>

<body>

<div class="container small">

    <h1>Calculation</h1>


    <form action="calculation.jsp"
          method="post"
          class="form-box">


        <label>
            First Number
        </label>

        <input type="number"
               step="any"
               name="first"
               required>


        <label>
            Second Number
        </label>

        <input type="number"
               step="any"
               name="second"
               required>


        <label>
            Operation
        </label>

        <select name="operation"
                required>

            <option value="add">
                Addition (+)
            </option>

            <option value="subtract">
                Subtraction (-)
            </option>

            <option value="multiply">
                Multiplication (×)
            </option>

            <option value="divide">
                Division (÷)
            </option>

        </select>


        <button type="submit">
            Calculate
        </button>

    </form>


    <% if (result != null) { %>

        <div class="result">

            Result:

            <strong>
                <%= result %>
            </strong>

        </div>

    <% } %>


    <% if (error != null) { %>

        <div class="error">

            <%= error %>

        </div>

    <% } %>


    <div class="button-row center">

        <a class="button"
           href="index.jsp">
            Index
        </a>

        <a class="button secondary"
           href="register.jsp">
            Register
        </a>

        <a class="button secondary"
           href="profile.jsp">
            Profile
        </a>

    </div>

</div>

</body>

</html>