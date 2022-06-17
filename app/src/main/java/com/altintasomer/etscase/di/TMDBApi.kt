package com.altintasomer.etscase.di

import com.altintasomer.etscase.di.Utils.Companion.API_KEY
import com.altintasomer.etscase.model.network.FilmDetail
import com.altintasomer.etscase.model.network.PopularFilm
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TMDBApi {

    @GET("3/tv/popular")
    suspend fun getFilms(@Query("api_key") apiKey : String? = API_KEY,@Query("query") query : String?,@Query("language") language : String? = Utils.LANGUAGE,@Query("page") page : String? = "1") : Response<PopularFilm>

    @GET("3/tv/{tv_id}")
    suspend fun getFilmDetail(@Path("tv_id") tv_id : String,@Query("api_key") apiKey : String? = API_KEY) : Response<FilmDetail>
}