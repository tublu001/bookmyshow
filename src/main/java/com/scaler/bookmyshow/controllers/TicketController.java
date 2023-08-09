package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.BookTicketResponseDto;
import com.scaler.bookmyshow.dtos.BookicketRequestDto;
import com.scaler.bookmyshow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {

   private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public BookTicketResponseDto bookTicket(BookicketRequestDto request) {
        BookTicketResponseDto response = new BookTicketResponseDto();

//        try {
////            ticketService.bookTicket()
//        } catch (TimeoutException e) {
//            response.setStatus("FAILURE");
//            response.setMessage("Something is wrong");
//        }

        return null;
    }
}
