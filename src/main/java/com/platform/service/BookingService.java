package com.platform.service;

import com.platform.entity.Booking;
import com.platform.repository.BookingRepo;
import com.platform.request.BookingRequest;
import com.platform.response.BookingResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookingService {
    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private ModelMapper mapper;

    public BookingResponse createBooking(BookingRequest bookingRequest) {
        Booking booking = new Booking(bookingRequest);
        Booking resp = bookingRepo.save(booking);
        return mapper.map(resp, BookingResponse.class);
    }

}
