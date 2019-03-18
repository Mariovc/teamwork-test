package com.mvc.teamwork.data.repository

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.mvc.teamwork.data.BuildConfig
import com.mvc.teamwork.data.entity.ProjectListDTO
import io.reactivex.Single
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Author: Mario Velasco Casquero
 * Date: 17/03/2019
 * Email: m3ario@gmail.com
 */
class ProjectRepository : IProjectRepository {
    private val projectService: ProjectService

    init {
        projectService = getRetrofit().create(ProjectService::class.java)
    }

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(getHttpClient())
            .build()
    }

    fun getHttpClient(): OkHttpClient {
        val httpClientBuilder = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC))
            .addInterceptor(TokenInterceptor())

        return httpClientBuilder.build()
    }

    override fun getProjects(): Single<ProjectListDTO> {
        return projectService.getProjects().singleOrError()
    }


}