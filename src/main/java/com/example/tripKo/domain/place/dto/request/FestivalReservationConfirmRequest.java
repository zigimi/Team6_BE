package com.example.tripKo.domain.place.dto.request;

import com.example.tripKo.domain.place.PlaceType;
import com.sun.istack.NotNull;
import lombok.Getter;

@Getter
public class FestivalReservationConfirmRequest {

    private Reservation reservation;

    @Getter
    public static class Reservation {
        @NotNull
        private Long id;
        @NotNull
        private Long placeId;
        @NotNull
        private String reservationDate;
        @NotNull
        private Long headCount;
        private String message;
    }
}
