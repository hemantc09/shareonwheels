package com.itu.shareonwheels.dto;

/**
 * Created by nikitasonthalia on 10/17/15.
 */
public class TripRequestDto {

    private  int tripId;
    private int seatAvailable;
    private String userId;
    private String userType;
    private  String tripType;





    public int getSeatavailable()
    {
        return this.seatAvailable;
    }

    public void setSeatavailable(int seatavailable)
    {
        this.seatAvailable=seatavailable;
    }

    public String getUserid()
    {
        return this.userId;
    }

    public void setUserid(String userid)
    {
        this.userId=userid;
    }

    public String getUsertype()
    {
        return this.userType;
    }

    public void setUsertype(String usertype)
    {
        this.userType=usertype;
    }


    public String getTripType()
    {
        return this.tripType;

    }
    public void setTripType(String tripType)
    {
        this.tripType=tripType;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }
}
