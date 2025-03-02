package com.platform.config;

import com.platform.service.BookingService;
import com.platform.service.ShowService;
import com.platform.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookingConfig {

    @Bean
    public UserService userBean() {
        return new UserService();
    }

    @Bean
    public ShowService showBean() {
        return new ShowService();
    }

    @Bean
    public BookingService bookingBean() {
        return new BookingService();
    }

    @Bean
    public ModelMapper modelMapperBean(){
        return new ModelMapper();
    }
}
