package com.in.dazzling.pusher;

public class DataModel {
    String HotelName, Location, Ratings, Cost, Description;

    public DataModel(String hotelName, String location, String ratings, String cost, String description) {
        HotelName = hotelName;
        Location = location;
        Ratings = ratings;
        Cost = cost;
        Description = description;
    }

    public DataModel() {
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getRatings() {
        return Ratings;
    }

    public void setRatings(String ratings) {
        Ratings = ratings;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
