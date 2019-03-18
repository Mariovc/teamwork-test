package com.mvc.teamwork.domain.usecase

import com.mvc.teamwork.domain.entity.ProjectBO
import io.reactivex.Single


/**
 * Author: Mario Velasco Casquero
 * Date: 18/03/2019
 * Email: m3ario@gmail.com
 */
interface IProjectUseCase {
    fun getProjects(): Single<List<ProjectBO>>
}