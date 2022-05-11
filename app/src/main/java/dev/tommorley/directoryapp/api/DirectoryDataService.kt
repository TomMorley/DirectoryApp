package dev.tommorley.directoryapp.api

import dev.tommorley.directoryapp.data.models.Contact
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface DirectoryDataService {
    @GET("people")
    suspend fun getPeople(): List<Contact>

    companion object {
        private const val BASE_URL = "https://61e947967bc0550017bc61bf.mockapi.io/api/v1/"

        fun create(): DirectoryDataService {

            val client = OkHttpClient.Builder()
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(DirectoryDataService::class.java)
        }
    }
}