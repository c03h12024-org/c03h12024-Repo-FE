package com.codegym.case_study.services;

import com.codegym.case_study.models.Showtime;
import com.codegym.case_study.models.ShowtimeTicket;
import com.codegym.case_study.repositories.ShowtimeRepo;

import java.util.List;

public class ShowtimeService {
    private ShowtimeRepo showtimeRepo = new ShowtimeRepo();
    public List<Showtime> getShowtimeByMovieId(int movieId) {
        return showtimeRepo.getShowtimeByMovieId(movieId);
    }

    public List<Showtime> getShowtimeByMovieIdAndDay(int movieId, String date) {
        return showtimeRepo.getShowtimeByMovieIdAndDay(movieId,date);
    }

    public int getShowtime(int id, String date, String hour) {
        return showtimeRepo.getShowtime(id, date,hour);
    }

    public List<ShowtimeTicket> getShowtimeTicket(int showtimeId) {
        return showtimeRepo.getShowtimeTicket(showtimeId);
    }

    public List<ShowtimeTicket> getTicketOrder(String[] tickets) {
        return showtimeRepo.getTicketOrder(tickets);
    }

    public int getOrderAmount(String[] tickets) {
        return showtimeRepo.getOrderAmount(tickets);
    }
}
