package com.crow.module_book.model.resp.novel_catelogue

import com.squareup.moshi.Json


data class Book(

    @Json(name =  "name")
    val name: String,

    @Json(name =  "path_word")
    val pathWord: String,

    @Json(name =  "uuid")
    val uuid: String
)