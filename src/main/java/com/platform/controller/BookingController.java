package com.platform.controller;


import com.platform.request.BookingRequest;
import com.platform.response.BookingResponse;
import com.platform.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<BookingResponse> createBooking(@RequestBody BookingRequest booking) {
        BookingResponse bookingResponse = bookingService.createBooking(booking);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookingResponse);
    }
}
