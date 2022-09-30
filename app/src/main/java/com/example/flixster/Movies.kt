package com.example.flixster

import com.google.gson.annotations.SerializedName


class Movies {



    @JvmField
    @SerializedName("original_title")
    var title: String? = null



    @SerializedName("poster_path")
    var poster: String? = null


    @SerializedName("overview")
    var description: String? = null



}