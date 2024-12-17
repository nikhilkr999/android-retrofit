package com.example.demo19movieappretrofit.serviceapi;

import com.example.demo19movieappretrofit.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {
    //service interfcae defines the structure and behavior of the API requests.
    //Acts as a bridge between App and APi

    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
