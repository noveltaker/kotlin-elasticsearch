package com.example.elasticsearch.service.dto

import com.example.elasticsearch.domain.Employee
import kotlinx.serialization.Serializable

@Serializable
data class Created constructor(private val name: String) {
    fun toEntity() = Employee(name)
}
