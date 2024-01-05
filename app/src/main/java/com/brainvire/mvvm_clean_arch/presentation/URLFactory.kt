package com.brainvire.mvvm_clean_arch.presentation

import okhttp3.HttpUrl

object URLFactory {

    private var SCHEME = "https"
    private lateinit var HOST: String
    private lateinit var API_SAGEMENT: String
    private var BASE_URL_API = "shahennew.demo.brainvire.dev"

    fun provideHttpUrl(): HttpUrl {
        val httpUrl = HttpUrl.Builder()

        SCHEME = "https"
        HOST = BASE_URL_API
        API_SAGEMENT = "api/"

        return httpUrl
            .scheme(SCHEME)
            .host(HOST)
            .addPathSegments(API_SAGEMENT)
            .build()
    }

    const val EP_Login = "login"
}