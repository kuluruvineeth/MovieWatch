package com.kuluruvineeth.moviewatch.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class TmdbResponse {
    @SerializedName("page")
    @Expose
    var page: Int? = null
    @SerializedName("total_results")
    @Expose
    var totalResults: Int? = null
    @SerializedName("totak_pages")
    @Expose
    var totalPages: Int? = null
    @SerializedName("results")
    @Expose
    var results: List<Movie>? = null
}