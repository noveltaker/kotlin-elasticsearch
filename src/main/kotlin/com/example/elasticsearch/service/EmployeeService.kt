package com.example.elasticsearch.service

import com.example.elasticsearch.domain.Employee
import com.example.elasticsearch.service.dto.Created
import com.example.elasticsearch.service.dto.PageDTO

interface EmployeeService {
    fun save(dto: Created): Employee
    fun getSearchName(name: String, dto: PageDTO): List<Employee>
}