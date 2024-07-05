<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 7/4/2024
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Form Thanh Toán</title>
    <link rel="stylesheet" href="css/payment.css">
    <style>
        @import url("https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;700;900&display=swap");

        body {
            background: linear-gradient(to right, rgba(176, 2, 2, 0.99), rgb(51, 51, 51));
        }

        .container {
            background: rgba(255, 255, 255, 0.7);
            border-radius: 10px 10px 10px 10px ;
            width: 540px;
            height: 480px;
            margin: 0 auto;
            position: relative;
            margin-top: 10%;
            box-shadow: 3px 6px 20px;
        }
        .fl{
            color: #c0392b;
        }

        .logo {
            float: right;
            margin-right: 12px;
            margin-top: 12px;
            font-family: "Nunito Cairo", sans-serif;
            color: rgba(255, 255, 255, 0.71);
            font-weight: 900;
            font-size: 2em;
            letter-spacing: 1px;
        }


        .CTA {
            width: 80px;
            height: 40px;
            right: -20px;
            bottom: 0;
            margin-bottom: 90px;
            position: absolute;
            z-index: 1;
            background: #b61229;
            font-size: 1em;
            transform: rotate(-90deg);
            transition: all 0.5s ease-in-out;
            cursor: pointer;
        }
        .CTA h1 {
            color: #ffffff;
            margin-top: 10px;
            margin-left: 9px;
        }
        .CTA:hover {
            background: #050303;
            transform: scale(1.1);
        }

        .leftbox {
            float: left;
            top: -3%;
            left: 5%;
            position: absolute;
            width: 15%;
            height: 110%;
            background: rgba(255, 255, 255, 0.6);
            box-shadow: 3px 3px 10px;
            border-radius: 10px 10px 10px 10px
        }

        nav a {
            list-style: none;
            padding: 35px;
            color: #ffffff;
            font-size: 1.1em;
            display: block;
            transition: all 0.3s ease-in-out;
        }
        nav a :hover {
            color: #c0392b;
            transform: scale(1.2);
            cursor: pointer;
        }
        nav a :first-child {
            margin-top: 7px;
        }

        .active {
            color: #c0392b;
        }

        .rightbox {
            float: right;
            width: 60%;
            height: 120%;
        }

        .profile,
        .payment,
        .subscription,
        .privacy,
        .settings {
            transition: opacity 0.5s ease-in;
            position: absolute;
            width: 70%;
        }

        h1 {
            font-family: "Cairo", sans-serif;
            color: #d71532;
            font-size: 1.5em;
            margin-top: 40px;
            margin-bottom: 35px;
        }

        h2 {
            font-family: "Cairo", sans-serif;
            width: 80%;
            text-transform: uppercase;
            font-size: 14px;
            letter-spacing: 1px;
            margin-left: 2px;
            margin-top: -2px;
        }

        p {
            border-width: 1px;
            border-style: solid;
            border-image: linear-gradient(to right, #ffffff, rgba(rgba(182, 12, 12, 0.99), 0.5)) 1 0%;
            border-top: 0;
            width: 80%;
            font-family: "Cairo", sans-serif;
            font-size: 0.7em;
            padding: 7px 0;
            color: rgba(255, 249, 249, 0.54);
        }
        span {
            font-size: 1em;
            color: #d71532;
        }

        .btn {
            float: right;
            font-family: "Cairo", sans-serif;
            text-transform: uppercase;
            font-size: 10px;
            border: none;
            color: rgba(246, 2, 131, 0.03);
        }

        .btn:hover {
            text-decoration: underline;
            font-weight: 950;
        }

        input {
            border: 1px solid lighten(#777777, 40%);
            font-family: "Cairo", sans-serif;
            padding: 2px;
            margin: 0;
        }

        .privacy h2 {
            margin-top: 25px;
        }

        .settings h2 {
            margin-top: 25px;
        }

        .noshow {
            opacity: 0;
        }

        footer {
            position: absolute;
            width: 20%;
            bottom: 0;
            right: -20px;
            text-align: right;
            font-size: 0.8em;
            text-transform: uppercase;
            letter-spacing: 2px;
            font-family: "Cairo", sans-serif;
        }
        footer p {
            border: none;
            padding: 0;
        }
        footer a {
            color: #ffffff;
            text-decoration: none;
        }
        footer a:hover {
            color: #7d7d7d;
        }
        .btn {
            background: #d93926;
            border-radius: 10px 10px 10px 10px;
            width: 50%;
            float: left;
            padding: 12px 10px 10px 10px;
            text-transform: uppercase;
            letter-spacing: 2px;
            font-weight: 400;
            color: #ececec;
            cursor: pointer;
            margin-top: 5px;
        }
        .btn:hover {
            background: rgba(7, 1, 1, 0.67);
            text-decoration: none;
        }

        .btn2 {
            background: #d93926;
            font-family: "Cairo", sans-serif;
            border-radius: 10px 10px 10px 10px;
            width: 30%;
            height: 39px;
            font-size: 10px;
            float: left;
            padding: 12px 10px 10px 10px;
            text-transform: uppercase;
            letter-spacing: 2px;
            font-weight: 400;
            color: #ececec;
            cursor: pointer;
            margin-top: 5px;
            margin-left: 15px;
        }

        .btn2:hover{
            background: rgba(74, 72, 72, 0.67);
            text-decoration: none;
        }

    </style>
</head>
<body>
<div class="container">
    <div id="logo"><h1 class="logo"></i>Fl<span class="fl">i</span>x</h1></div>
    <div class="leftbox">
        <nav>
            <a id="profile" class="active"><i class="fa fa-user"></i></a>
            <a id="payment"><i class="fa fa-credit-card"></i></a>
            <a id="subscription"><i class="fa fa-tv"></i></a>
            <a id="privacy"><i class="fa fa-tasks"></i></a>
            <a id="settings"><i class="fa fa-cog"></i></a>
        </nav>
    </div>
    <div class="rightbox">
        <form id="checkout" action="">
            <div class="profile">
                <h1>Movie booking information</h1>
                <h2 style="color: #d71532">Customer name</h2>
                <input
                        style="width: 80%;
                               height: 30px;
                               border-radius: 10px 10px 10px 10px;
                               margin-bottom: 10px;"
                        id=""
                        type="text"
                        placeholder="Enter the customer's name"
                />

                <h2 style="color: #d71532">Phone number</h2>
                <input
                        style="width: 80%;
                               height: 30px;
                               border-radius: 10px 10px 10px 10px;
                               margin-bottom: 10px;"
                        id="cardnumber"
                        type="text"
                        placeholder="Enter your phone number"
                />
                <h2 style="color: #d71532">Ticket</h2>
                <input
                        style="width: 80%;
                               height: 30px;
                               border-radius: 10px 10px 10px 10px;
                               margin-bottom: 10px;"
                        type="text"
                        readonly
                />
                <h2 style="color: #d71532">Amount</h2>
                <input
                        style="width: 80%;
                               height: 30px;
                               border-radius: 10px 10px 10px 10px;
                               margin-bottom: 10px;"
                        type="text"
                        readonly
                />

                <input class="btn" type="button" name="payment" value="Payment" />
                <input class="btn2" type="button" name="cancel" value="Cancel">
            </div>
        </form>
    </div>
</div>

<footer>
    <p>Made by <a href="https://www.facebook.com/tranbatrunghieu"> Trung Hieu</a> ♡</p>
</footer>
</body>
</html>
