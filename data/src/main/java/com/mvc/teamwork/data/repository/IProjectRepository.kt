package com.mvc.teamwork.data.repository

import com.mvc.teamwork.data.entity.ProjectListDTO
import io.reactivex.Single


/**
 * Author: Mario Velasco Casquero
 * Date: 17/03/2019
 * Email: m3ario@gmail.com
 */
interface IProjectRepository {
    fun getProjects(): Single<ProjectListDTO>
}