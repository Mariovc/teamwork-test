package com.mvc.teamwork.domain.usecase

import com.mvc.teamwork.data.entity.ProjectDTO
import com.mvc.teamwork.data.entity.ProjectListDTO
import com.mvc.teamwork.data.repository.ProjectRepository
import com.mvc.teamwork.domain.entity.ProjectBO
import io.reactivex.Single


/**
 * Author: Mario Velasco Casquero
 * Date: 18/03/2019
 * Email: m3ario@gmail.com
 */
class ProjectUseCase : IProjectUseCase {
    override fun getProjects(): Single<List<ProjectBO>> {
        return ProjectRepository().getProjects() // TODO pass Project Repository as a dependency with dagger (Singleton)
            .map { projectList: ProjectListDTO -> mapProjectList(projectList.projects) }
    }

    private fun mapProjectList(projects: List<ProjectDTO>): List<ProjectBO> {
        val projectList: MutableList<ProjectBO> = mutableListOf()
        for (project in projects) {
            projectList.add(mapProject(project))
        }

        return projectList
    }

    private fun mapProject(project: ProjectDTO): ProjectBO {
        return ProjectBO(
            project.createdOn,
            project.description,
            project.endDate,
            project.id,
            project.lastChangedOn,
            project.logo,
            project.name,
            project.starred,
            project.startDate,
            project.status
        )
    }
}