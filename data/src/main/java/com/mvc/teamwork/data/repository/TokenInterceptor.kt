package com.mvc.teamwork.data.repository

import android.util.Base64
import com.mvc.teamwork.data.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response


/**
 * Author: Mario Velasco Casquero
 * Date: 18/03/2019
 * Email: m3ario@gmail.com
 */
class TokenInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        val requestBuilder = originalRequest.newBuilder()
            .addHeader("Authorization", getAuthString())

        val request = requestBuilder.build()
        return chain.proceed(request)
    }

    private fun getAuthString() : String {
        val userAndPassword = BuildConfig.API_TOKEN + ":" + "X" // token + fake password
        return "Basic " + Base64.encodeToString(userAndPassword.toByteArray(), Base64.NO_WRAP)
    }
}