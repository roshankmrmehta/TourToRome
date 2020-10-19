package com.example.tourtorome;

public class RestaurantData {

    private String resName;
    private String resInfo;
    private String resTime;
    private String resCost;
    private String resLocation;
    private String resWebLink;
    private int resImg;

    public RestaurantData(String resName, String resInfo, String resTime, String resCost, String resLocation, String resWebLink, int resImg) {
        this.resName = resName;
        this.resInfo = resInfo;
        this.resTime = resTime;
        this.resCost = resCost;
        this.resLocation = resLocation;
        this.resWebLink = resWebLink;
        this.resImg = resImg;
    }

    public String getResName() {
        return resName;
    }

    public String getResInfo() {
        return resInfo;
    }

    public String getResTime() {
        return resTime;
    }

    public String getResCost() {
        return resCost;
    }

    public String getResLocation() {
        return resLocation;
    }

    public String getResWebLink() {
        return resWebLink;
    }

    public int getResImg() {
        return resImg;
    }
}
