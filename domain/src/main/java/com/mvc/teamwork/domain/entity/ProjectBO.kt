package com.mvc.teamwork.domain.entity

data class ProjectBO(
    val createdOn: String?,
    val description: String?,
    val endDate: String?,
    val id: String?,
    val lastChangedOn: String?,
    val logo: String?,
    val name: String?,
    val starred: Boolean?,
    val startDate: String?,
    val status: String?
)