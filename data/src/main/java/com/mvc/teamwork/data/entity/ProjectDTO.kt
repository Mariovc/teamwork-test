package com.mvc.teamwork.data.entity

import com.google.gson.annotations.SerializedName

data class ProjectDTO(
    @SerializedName("announcement")
    val announcement: String?,
    @SerializedName("announcementHTML")
    val announcementHTML: String?,
    @SerializedName("boardData")
    val boardData: BoardDataDTO?,
    @SerializedName("category")
    val category: CategoryDTO?,
    @SerializedName("company")
    val company: CompanyDTO?,
    @SerializedName("created-on")
    val createdOn: String?,
    @SerializedName("defaultPrivacy")
    val defaultPrivacy: String?,
    @SerializedName("defaults")
    val defaults: DefaultsDTO?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("endDate")
    val endDate: String?,
    @SerializedName("filesAutoNewVersion")
    val filesAutoNewVersion: Boolean?,
    @SerializedName("harvest-timers-enabled")
    val harvestTimersEnabled: Boolean?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("integrations")
    val integrations: IntegrationsDTO?,
    @SerializedName("isProjectAdmin")
    val isProjectAdmin: Boolean?,
    @SerializedName("last-changed-on")
    val lastChangedOn: String?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("notifyeveryone")
    val notifyeveryone: Boolean?,
    @SerializedName("overview-start-page")
    val overviewStartPage: String?,
    @SerializedName("privacyEnabled")
    val privacyEnabled: Boolean?,
    @SerializedName("replyByEmailEnabled")
    val replyByEmailEnabled: Boolean?,
    @SerializedName("show-announcement")
    val showAnnouncement: Boolean?,
    @SerializedName("starred")
    val starred: Boolean?,
    @SerializedName("start-page")
    val startPage: String?,
    @SerializedName("startDate")
    val startDate: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("subStatus")
    val subStatus: String?,
    @SerializedName("tags")
    val tags: List<Any?>?,
    @SerializedName("tasks-start-page")
    val tasksStartPage: String?
)