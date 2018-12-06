package com.example.matejapodravac.retrofitapp.models;

import java.util.ArrayList;

public class CoursesResponse {

    ArrayList<Course>courses;

    public CoursesResponse() {
    }

    public CoursesResponse(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
