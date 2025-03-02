package com.platform.service;

import com.platform.entity.Show;
import com.platform.repository.ShowRepo;
import com.platform.response.ShowResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ShowService {

    @Autowired
    private ShowRepo showRepo;

    public List<ShowResponse> findShowsByMovieCityAndDate(Long movieId, String city, LocalDate date) {
        System.out.println("Test 2 "+ movieId);
        List<Show> response = showRepo.findShowsByMovieCityAndDate(movieId,city,date);
        List<ShowResponse> list = new ArrayList<>();;

        return list;
        /*return response.stream().map(show ->
                new ShowResponse(
                        show.getName(),
                        show.getAddress(),
                        show.getShow().stream()
                                .filter(show -> show.getMovieId().equals(movieId) && show.getShowDate().equals(date))
                                .map(Show::getShowTime)
                                .collect(Collectors.toList())
                )
        ).collect(Collectors.toList());

         */
    }


}
