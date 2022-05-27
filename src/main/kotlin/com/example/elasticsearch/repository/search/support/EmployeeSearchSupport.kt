package com.example.elasticsearch.repository.search.support

import com.example.elasticsearch.domain.Employee
import org.springframework.data.domain.Pageable

interface EmployeeSearchSupport {

    fun searchByName(name: String, pageable: Pageable): List<Employee>
}
