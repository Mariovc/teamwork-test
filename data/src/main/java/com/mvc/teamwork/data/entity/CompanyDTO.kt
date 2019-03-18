package com.mvc.teamwork.data.entity

import com.google.gson.annotations.SerializedName

data class CompanyDTO(
    @SerializedName("id")
    val id: String?,
    @SerializedName("is-owner")
    val isOwner: String?,
    @SerializedName("name")
    val name: String?
)