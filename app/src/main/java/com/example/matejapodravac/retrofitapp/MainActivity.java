package com.example.matejapodravac.retrofitapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.matejapodravac.retrofitapp.R;
import com.example.matejapodravac.retrofitapp.models.CoursesResponse;
import com.example.matejapodravac.retrofitapp.network.RetrofitManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<CoursesResponse> {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Call<CoursesResponse> callResponse = RetrofitManager.getInstance().getService().getCourses();
        callResponse.enqueue(MainActivity.this);
    }

    @Override
    public void onResponse(@NonNull Call<CoursesResponse> call, @NonNull Response<CoursesResponse> response) {
        String text;
        if (response.isSuccessful() && response.body() != null){
            text = response.body().getCourses().toString();
        }
        else{
            text = "Došlo je do greške, podaci nisu dostupni";
        }
        setText(text);
    }

    @Override
    public void onFailure(@NonNull Call<CoursesResponse> call, @NonNull Throwable t) {
        setText("Došlo je do greške " + t.getMessage());
    }

    void setText(String text)
    {
        textView.setText(text);
    }
}
