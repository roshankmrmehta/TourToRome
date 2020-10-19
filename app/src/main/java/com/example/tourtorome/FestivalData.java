package com.example.tourtorome;

public class FestivalData {

    private String eventTitle;
    private String eventInfo;
    private String eventTime;
    private String eventLocation;
    private String eventWebLink;
    private int eventImg;

    public FestivalData(String eventTitle, String eventInfo, String eventTime, String eventLocation, String eventWebLink, int eventImg) {
        this.eventTitle = eventTitle;
        this.eventInfo = eventInfo;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.eventWebLink = eventWebLink;
        this.eventImg = eventImg;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventInfo() {
        return eventInfo;
    }

    public String getEventTime() {
        return eventTime;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public String getEventWebLink() {
        return eventWebLink;
    }

    public int getEventImg() {
        return eventImg;
    }
}
