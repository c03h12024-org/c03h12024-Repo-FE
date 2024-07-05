package com.codegym.case_study.controllers;

import com.codegym.case_study.models.Showtime;
import com.codegym.case_study.models.ShowtimeTicket;
import com.codegym.case_study.models.Ticket;
import com.codegym.case_study.services.ShowtimeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "MainController", urlPatterns = "/movie")
public class MainController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShowtimeService showtimeService = new ShowtimeService();
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "book":
//                int movieId = Integer.parseInt(req.getParameter("movieId"));
                String date = req.getParameter("day");
                String hour = req.getParameter("hour");
                List<Showtime> showtimes = showtimeService.getShowtimeByMovieIdAndDay(1, date);
                req.setAttribute("showtimes", showtimes);
                if (hour == null) {
                    req.getRequestDispatcher("/order.jsp").forward(req, resp);
                } else {
                    int showtimeId = showtimeService.getShowtime(1, date, hour);
                    List<ShowtimeTicket> showtimeTickets = showtimeService.getShowtimeTicket(showtimeId);
                    req.setAttribute("showtimeTickets", showtimeTickets);
                    req.getRequestDispatcher("/order.jsp").forward(req, resp);
                }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShowtimeService showtimeService = new ShowtimeService();
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "book":
                String[] tickets =  req.getParameterValues("tickets");
//                List<ShowtimeTicket> showtimeTickets = showtimeService.getTicketOrder(tickets);
                if (tickets == null){
                    req.getRequestDispatcher("/order.jsp").forward(req, resp);
                } else {
                    int totalAmount = showtimeService.getOrderAmount(tickets);
                    req.setAttribute("tickets", tickets);
                    req.setAttribute("totalAmount", totalAmount);
                    req.getRequestDispatcher("/payment.jsp").forward(req, resp);
                    break;
                }
        }
    }
}
