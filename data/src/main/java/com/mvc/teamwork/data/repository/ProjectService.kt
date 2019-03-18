package com.mvc.teamwork.data.repository

import com.mvc.teamwork.data.entity.ProjectListDTO
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers


/**
 * Author: Mario Velasco Casquero
 * Date: 17/03/2019
 * Email: m3ario@gmail.com
 */
interface ProjectService {
    @Headers("Accept: application/json")
    @GET("projects.json")
    fun getProjects(): Observable<ProjectListDTO>
}