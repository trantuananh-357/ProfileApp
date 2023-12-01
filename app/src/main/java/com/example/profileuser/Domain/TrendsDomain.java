package com.example.profileuser.Domain;

public class TrendsDomain {

    private String title;
    private  String subtitle;
    private String picAddres;


    public TrendsDomain(String title, String subtitle, String picAddres) {
        this.title = title;
        this.subtitle = subtitle;
        this.picAddres = picAddres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPicAddres() {
        return picAddres;
    }

    public void setPicAddres(String picAddres) {
        this.picAddres = picAddres;
    }
}
