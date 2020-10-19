package com.example.tourtorome;

public class HotelData {

    private String hotelName;
    private String hotelInfo;
    private String hotelTime;
    private String hotelCost;
    private String hotelLocation;
    private String hotelWebLink;
    private int hotelImg;

    public HotelData(String hotelName, String hotelInfo, String hotelTime, String hotelCost, String hotelLocation, String hotelWebLink, int hotelImg) {
        this.hotelName = hotelName;
        this.hotelInfo = hotelInfo;
        this.hotelTime = hotelTime;
        this.hotelCost = hotelCost;
        this.hotelLocation = hotelLocation;
        this.hotelWebLink = hotelWebLink;
        this.hotelImg = hotelImg;
    }


    public String getHotelName() {
        return hotelName;
    }

    public String getHotelInfo() {
        return hotelInfo;
    }

    public String getHotelTime() {
        return hotelTime;
    }

    public String getHotelCost() {
        return hotelCost;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public String getHotelWebLink() {
        return hotelWebLink;
    }

    public int getHotelImg() {
        return hotelImg;
    }
}
