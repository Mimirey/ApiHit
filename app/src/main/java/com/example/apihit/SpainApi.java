package com.example.apihit;

import com.example.apihit.TeamResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SpainApi {
    @GET("search_all_teams.php")
    Call<TeamResponse> getTeamsByCountry(
            @Query("s") String sport,
            @Query("c") String country
    );
}