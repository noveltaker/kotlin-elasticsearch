package com.example.elasticsearch.service.dto

import org.springframework.data.domain.PageRequest

data class PageDTO(private val page: Int, private val size: Int) {
    fun getPage() = this.page
    fun getSize() = this.size
    fun getPageRequest() = PageRequest.of(this.page, this.size)
}
