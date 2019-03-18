package com.mvc.teamwork.data.entity

import com.google.gson.annotations.SerializedName

data class OnedrivebusinessDTO(
    @SerializedName("account")
    val account: String?,
    @SerializedName("enabled")
    val enabled: Boolean?,
    @SerializedName("folder")
    val folder: String?,
    @SerializedName("foldername")
    val foldername: String?
)