package com.mvc.teamwork.data.entity

import com.google.gson.annotations.SerializedName

data class IntegrationsDTO(
    @SerializedName("microsoftConnectors")
    val microsoftConnectors: MicrosoftConnectorsDTO?,
    @SerializedName("onedrivebusiness")
    val onedrivebusiness: OnedrivebusinessDTO?,
    @SerializedName("sharepoint")
    val sharepoint: SharepointDTO?,
    @SerializedName("xero")
    val xero: XeroDTO?
)