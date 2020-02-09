package com.example.admissionhelper;

public class saveImg {
    String year;
    String imageLink;
    public saveImg(){

    }
    public saveImg(String year, String imageLink) {
        this.year = year;
        this.imageLink = imageLink;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
