package com.mvc.teamwork.data.entity

import com.google.gson.annotations.SerializedName

data class ProjectListDTO(
    @SerializedName("STATUS")
    val sTATUS: String?,
    @SerializedName("projects")
    val projects: List<ProjectDTO>
)