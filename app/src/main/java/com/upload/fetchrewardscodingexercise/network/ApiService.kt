package com.upload.fetchrewardscodingexercise.network

import com.upload.fetchrewardscodingexercise.Item
import retrofit2.http.GET

interface ApiService {
    @GET("hiring.json")
    suspend fun getItems(): List<Item>
}
