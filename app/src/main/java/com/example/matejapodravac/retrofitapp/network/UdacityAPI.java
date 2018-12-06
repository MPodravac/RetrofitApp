package com.example.matejapodravac.retrofitapp.network;

import com.example.matejapodravac.retrofitapp.models.CoursesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UdacityAPI {
//poblize opisuje iduci red, znaci da se radi o get requestu, nadovezuje se na base url
    @GET("/public-api/v0/courses")
    Call<CoursesResponse>getCourses();
}
