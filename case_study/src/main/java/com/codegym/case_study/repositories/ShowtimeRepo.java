package com.codegym.case_study.repositories;

import com.codegym.case_study.models.Showtime;
import com.codegym.case_study.models.ShowtimeTicket;
import com.codegym.case_study.models.Ticket;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShowtimeRepo {
    public List<Showtime> getShowtimeByMovieId(int movieId) {
        List<Showtime> showtimes = new ArrayList<>();
        try {
            Connection connection = BaseRepo.getConnection();
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("SELECT * FROM cinema.showtimes WHERE movie_id = ?");
            preparedStatement.setInt(1, movieId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
//                int movieId = resultSet.getInt("movie_id");
                int roomId = resultSet.getInt("room_id");
                Date day = resultSet.getDate("day");
                String time = resultSet.getString("hour");
                showtimes.add(new Showtime(id, movieId, roomId, day, time));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return showtimes;
    }

    public List<Showtime> getShowtimeByMovieIdAndDay(int movieId, String date) {
        List<Showtime> showtimes = new ArrayList<>();
        try {
            Connection connection = BaseRepo.getConnection();
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("SELECT * FROM cinema.showtimes WHERE movie_id = ? AND day = ?");
            preparedStatement.setInt(1, movieId);
            preparedStatement.setString(2, date);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
//                int movieId = resultSet.getInt("movie_id");
                int roomId = resultSet.getInt("room_id");
                Date day = resultSet.getDate("day");
                String time = resultSet.getString("hour");
                showtimes.add(new Showtime(id, movieId, roomId, day, time));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return showtimes;
    }

    public int getShowtime(int movieId, String date, String hour) {
        List<Ticket> tickets = new ArrayList<>();
        try {
            Connection connection = BaseRepo.getConnection();
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("SELECT * FROM cinema.showtimes WHERE movie_id = ? AND day = ? AND hour = ?");
            preparedStatement.setInt(1, movieId);
            preparedStatement.setString(2, date);
            preparedStatement.setString(3, hour);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return resultSet.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

    public List<ShowtimeTicket> getShowtimeTicket(int showtimeId) {
        List<ShowtimeTicket> showtimeTickets = new ArrayList<>();
        try {
            Connection connection = BaseRepo.getConnection();
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("SELECT * FROM cinema.showtime_seats WHERE showtime_id = ?");
            preparedStatement.setInt(1, showtimeId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
//                int movieId = resultSet.getInt("movie_id");
                int seatId = resultSet.getInt("seat_id");
                boolean isFree = resultSet.getBoolean("is_free");
                showtimeTickets.add(new ShowtimeTicket(id, showtimeId, seatId, isFree));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return showtimeTickets;
    }

    public List<ShowtimeTicket> getTicketOrder(String[] tickets) {
        List<ShowtimeTicket> showtimeTickets = new ArrayList<>();
        int id;
        int showtimeId;
        int seatId;
        boolean isFree;
        for (String ticket : tickets) {
            try {
                Connection connection = BaseRepo.getConnection();
                PreparedStatement preparedStatement = null;
                preparedStatement = connection.prepareStatement("SELECT * FROM cinema.showtime_seats WHERE showtime_id = ?");
                preparedStatement.setInt(1, Integer.parseInt(ticket));
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                     id = resultSet.getInt("id");
                     showtimeId = resultSet.getInt("showtime_id");
                     seatId = resultSet.getInt("seat_id");
                     isFree = resultSet.getBoolean("is_free");
                    showtimeTickets.add(new ShowtimeTicket(id, showtimeId, seatId, isFree));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return showtimeTickets;
    }

    public int getOrderAmount(String[] tickets) {
        try {
            Connection connection = BaseRepo.getConnection();
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement("SELECT prices.price FROM cinema.prices JOIN cinema.showtimes ON prices.movie_id = showtimes.movie_id JOIN cinema.showtime_seats ON showtimes.id = showtime_seats.showtime_id  WHERE showtime_seats.id = ?");
            preparedStatement.setInt(1, Integer.parseInt(tickets[0]));
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return resultSet.getInt("price");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
