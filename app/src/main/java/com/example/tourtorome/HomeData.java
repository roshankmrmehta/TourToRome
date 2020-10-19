package com.example.tourtorome;

public class HomeData {

    private String homeTitle;
    private String homeInfo;
    private String homeTime;
    private String homeCost;
    private String homeLocation;
    private String homeWeb;
    private int homeImage;

    public HomeData(String homeTitle, String homeInfo, String homeTime, String homeCost, String homeLocation, String homeWeb, int homeImage) {
        this.homeTitle = homeTitle;
        this.homeInfo = homeInfo;
        this.homeTime = homeTime;
        this.homeCost = homeCost;
        this.homeLocation = homeLocation;
        this.homeWeb = homeWeb;
        this.homeImage = homeImage;
    }

    public String getHomeTitle() {
        return homeTitle;
    }

    public String getHomeInfo() {
        return homeInfo;
    }

    public String getHomeTime() {
        return homeTime;
    }

    public String getHomeCost() {
        return homeCost;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    public String getHomeWeb() {
        return homeWeb;
    }

    public int getHomeImage() {
        return homeImage;
    }
}
