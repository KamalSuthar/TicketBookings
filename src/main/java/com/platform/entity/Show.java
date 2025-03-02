package com.platform.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="Shows")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long showId;

    private LocalDate showDate;
    private LocalTime showTime;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "TheatreID", nullable = false)
    private Theatre theatre;

    @ManyToOne
    @JoinColumn(name = "MovieID", nullable = false)
    private Movie movie;


}
