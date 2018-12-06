package com.example.matejapodravac.retrofitapp.models;

public class Instructor {

    String bio;
    String image;
    String name;


    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor(String bio, String image, String name) {
        this.bio = bio;
        this.image = image;
        this.name = name;
    }
}
