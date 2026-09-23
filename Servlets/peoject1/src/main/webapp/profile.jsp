<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Profile</title>

    <link rel="stylesheet" href="style.css">

</head>

<body>

<div class="container small">

    <h1>Profile</h1>

    <div class="profile-card">

        <div class="profile-image">
            👤
        </div>

        <h2>
            ${sessionScope.name}
        </h2>

        <div class="profile-info">

            <p>
                <strong>Email:</strong>
                ${sessionScope.email}
            </p>

            <p>
                <strong>Phone:</strong>
                ${sessionScope.phone}
            </p>

            <p>
                <strong>Gender:</strong>
                ${sessionScope.gender}
            </p>

            <p>
                <strong>Date of Birth:</strong>
                ${sessionScope.dob}
            </p>

        </div>

    </div>

    <div class="button-row center">

        <a class="button"
           href="index.jsp">
            Index
        </a>

        <a class="button secondary"
           href="register.jsp">
            Register
        </a>

    </div>

</div>

</body>

</html>