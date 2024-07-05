<%@ page import="java.sql.Date" %><%--
  Created by IntelliJ IDEA.
  User: trung
  Date: 7/3/2024
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Ticket Booking</title>
    <link
            href="https://fonts.googleapis.com/icon?family=Material+Icons|Material+Icons+Outlined|Material+Icons+Round|Material+Icons+Sharp|Material+Icons+Two+Tone"
            rel="stylesheet"
    />
    <link rel="preconnect" href="https://fonts.googleapis.com"/>
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin/>
    <link rel="stylesheet" href="css/style.css">
    <link rel="icon" type="image/x-icon" href="images/favicon.ico">
    <link
            href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap"
            rel="stylesheet"
    />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="center">
    <form method="post">
        <div class="tickets">
            <div class="ticket-selector">
                <div class="head">
                    <div class="title">${movie.title}</div>
                </div>
                <div class="seats">
                    <div class="status">
                        <div class="item">Available</div>
                        <div class="item">Booked</div>
                        <div class="item">Selected</div>
                    </div>
                    <%--                <div class="all-seats">--%>
                    <div class="all-seats">
                        <c:forEach var="showtimeTickets" items="${showtimeTickets}">
                            <input type="checkbox" name="tickets"
                                   id="s+${showtimeTickets.id}" value="${showtimeTickets.id}" ${showtimeTickets.isFree() ? "": "disabled"} />
                            <label for="s+${showtimeTickets.id}" class=${showtimeTickets.isFree() ? "seat booked": "seat"}></label>
                        </c:forEach>
                    </div>
                </div>
                <div class="timings">
                    <%Date date1 = new Date(System.currentTimeMillis());%>
                    <%Date date2 = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000);%>
                    <%Date date3 = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000 * 2);%>
                    <%Date date4 = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000 * 3);%>
                    <%Date date5 = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000 * 4);%>
                    <%Date date6 = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000 * 5);%>
                    <%Date date7 = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000 * 6);%>
                    <div>
                        <a href="/movie?action=book&day=<%out.print(date1);%>&movieId=${movieId}">
                            <button type="button" class="btn btn-success"><%out.print(date1);%></button>
                        </a>
                        <a href="/movie?action=book&day=<%out.print(date2);%>&movieId=${movieId}">
                            <button type="button" class="btn btn-success"><%out.print(date2);%></button>
                        </a>
                        <a href="/movie?action=book&day=<%out.print(date3);%>&movieId=${movieId}">
                            <button type="button" class="btn btn-success"><%out.print(date3);%></button>
                        </a>
                        <%--                    <a href = "/movie?action=book&day=<%out.print(date4);%>&movieId=${movieId}"><button type="button" class="btn btn-success"><%out.print(date4);%></button></a>--%>
                        <%--                    <a href = "/movie?action=book&day=<%out.print(date5);%>&movieId=${movieId}"><button type="button" class="btn btn-success"><%out.print(date5);%></button></a>--%>
                    </div>

                    <div class="times">
                        <c:forEach var="showtimes" items="${showtimes}">
                            <a href="/movie?action=book&day=${showtimes.day}&movieId=${showtimes.id}&hour=${showtimes.hour}"><button
                                    type= "button">${showtimes.hour}</button>
                            </a>
                        </c:forEach>
                    </div>
                </div>
            </div>
            <div class="price">
                <div class="total">
                    <span> <span class="count">0</span> Tickets </span>
                    <div class="amount">0</div>
                </div>
                <a href="payment.jsp">
                    <button type="submit">Book</button>
                </a>
            </div>
        </div>
    </form>
</div>
<script src="js/main.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>