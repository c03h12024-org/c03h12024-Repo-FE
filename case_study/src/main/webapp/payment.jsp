<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 7/4/2024
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Form Thanh Toán</title>
    <link rel="stylesheet" href="css/payment.css">
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
                        style="width: 80%; height: 30px;border-radius: 10px 10px 10px 10px"
                        id="cardnumber"
                        type="text"
                        placeholder="Enter the customer's name"
                />

                <h2 style="color: #d71532">Phone number</h2>
                <input
                        style="width: 80%; height: 30px;border-radius: 10px 10px 10px 10px"
                        id="cardnumber"
                        type="text"
                        placeholder="Enter your phone number"
                />
                <h2 style="color: #d71532">Amount</h2>
                <input
                        style="width: 80%; height: 30px;border-radius: 10px 10px 10px 10px"
                        id="cardnumber"
                        type="text"
                        placeholder="Enter the amount"
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
