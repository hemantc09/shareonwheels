package com.itu.shareonwheels.entity;

import com.itu.shareonwheels.enumerations.BookingStatus;

/**
 * Created by ramya on 10/1/15.
 */
public class TripRequest extends Trip {

    private Long tripRequestId;

    private Rider rider;

    private BookingStatus bookingStatus;

    public Long getTripRequestId() {
        return tripRequestId;
    }

    public void setTripRequestId(Long tripRequestId) {
        this.tripRequestId = tripRequestId;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}
