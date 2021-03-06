package com.christopher.wallpaperapp.api

import com.christopher.wallpaperapp.model.SearchedPhotos
import com.christopher.wallpaperapp.model.TrendingPhotos
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

private const val API_KEY = "563492ad6f9170000100000176c2c175fccd4ef49048d87c28263ebf"

interface PexelsApiService {

    //get trending pictures
    @Headers("Authorization: $API_KEY")
    @GET("curated?per_page=16")
    suspend fun getTrendingPhotos(
        @Query("page") page: Int
    ): TrendingPhotos

    //search photos
    @Headers("Authorization: $API_KEY")
    @GET("search?per_page=16")
    suspend fun searchPhotos(
        @Query("query") query: String,
        @Query("page") page: Int
    ): SearchedPhotos
}