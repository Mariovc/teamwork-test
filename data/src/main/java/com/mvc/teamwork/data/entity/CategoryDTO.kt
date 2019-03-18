package com.mvc.teamwork.data.entity

import com.google.gson.annotations.SerializedName

data class CategoryDTO(
    @SerializedName("color")
    val color: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?
)