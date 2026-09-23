<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%

String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String gender = request.getParameter("gender");
String dob = request.getParameter("dob");

if (name != null) {

    session.setAttribute("name", name);
    session.setAttribute("email", email);
    session.setAttribute("phone", phone);
    session.setAttribute("gender", gender);
    session.setAttribute("dob", dob);

    response.sendRedirect("profile.jsp");
}

%>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Register</title>

    <link rel="stylesheet" href="style.css">

</head>

<body>

<div class="container small">

    <h1>Register</h1>

    <form action="register.jsp"
          method="post"
          class="form-box">

        <label>Name</label>

        <input type="text"
               name="name"
               required>


        <label>Email</label>

        <input type="email"
               name="email"
               required>


        <label>Phone Number</label>

        <input type="tel"
               name="phone"
               required>


        <label>Gender</label>

        <div class="radio-row">

            <label>
                <input type="radio"
                       name="gender"
                       value="Male"
                       required>
                Male
            </label>

            <label>
                <input type="radio"
                       name="gender"
                       value="Female">
                Female
            </label>

            <label>
                <input type="radio"
                       name="gender"
                       value="Other">
                Other
            </label>

        </div>


        <label>Date of Birth</label>

        <input type="date"
               name="dob"
               required>


        <div class="button-row">

            <button type="submit">
                Submit
            </button>

            <a class="button secondary"
               href="index.jsp">
                Index
            </a>

        </div>

    </form>

</div>

</body>

</html>