package com.example.apihit;

import com.example.apihit.TeamResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SportsApi {
    @GET("search_all_teams.php")
    Call<TeamResponse> getTeams(@Query("l") String league);


}


