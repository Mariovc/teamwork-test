package com.mvc.teamwork.data.entity

import com.google.gson.annotations.SerializedName

data class MicrosoftConnectorsDTO(
    @SerializedName("enabled")
    val enabled: Boolean?
)