package com.mvc.teamwork.data.entity

import com.google.gson.annotations.SerializedName

data class XeroDTO(
    @SerializedName("basecurrency")
    val basecurrency: String?,
    @SerializedName("connected")
    val connected: String?,
    @SerializedName("countrycode")
    val countrycode: String?,
    @SerializedName("enabled")
    val enabled: Boolean?,
    @SerializedName("organisation")
    val organisation: String?
)