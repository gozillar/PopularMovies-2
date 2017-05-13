package com.example.relearn.popularmovies2.rest;

import com.example.relearn.popularmovies2.model.MovieList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/3/movie/popular")
    Call<MovieList> getPopularMovies(@Query("api_key") String filters);

    @GET("/3/movie/top_rated")
    Call<MovieList> getTopRatedMovies(@Query("api_key") String filters);

    @GET("/3/movie/{id}/videos")
    Call<MovieList> getVideos(
            @Path("id") int id,
            @Query("api_key") String filters);

    @GET("/3/movie/{id}/reviews")
    Call<MovieList> getReviews(
            @Path("id") int id,
            @Query("api_key") String filters);

}
