package com.platform.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheaterResponse {
    private String movieId;
    private String movieName;
    private String cityName;
    private LocalDate showDate;
    private List<ShowResponse> showResponseList;
}
