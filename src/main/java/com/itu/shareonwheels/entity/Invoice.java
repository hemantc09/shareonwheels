package com.itu.shareonwheels.entity;

/**
 * Created by ramya on 10/1/15.
 */
public class Invoice {

    private Long invoiceId;

    private TripRequest tripRequest;

    private Rider rider;

    private Driver driver;

    private Double cost;

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public TripRequest getTripRequest() {
        return tripRequest;
    }

    public void setTripRequest(TripRequest tripRequest) {
        this.tripRequest = tripRequest;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
