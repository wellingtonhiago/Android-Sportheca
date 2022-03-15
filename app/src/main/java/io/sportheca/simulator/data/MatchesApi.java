package io.sportheca.simulator.data;

import java.util.List;

import io.sportheca.simulator.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("partidas.json")
    Call<List<Match>> getMatches();

}
