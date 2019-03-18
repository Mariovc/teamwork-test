package com.mvc.teamwork.data.entity

import com.google.gson.annotations.SerializedName

data class DefaultsDTO(
    @SerializedName("privacy")
    val privacy: String?
)