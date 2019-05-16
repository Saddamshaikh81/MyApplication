package com.example.myapplication;

public class List_Data {
    private String name;
    private String Title;
    private String image_url;
    private String Club;

    public List_Data(String name, String title, String image_url, String club) {
        this.name = name;
        Title = title;
        this.image_url = image_url;
        Club = club;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return Title;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getClub() {
        return Club;
    }
}