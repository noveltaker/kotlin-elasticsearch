package com.example.elasticsearch.repository.search

import com.example.elasticsearch.domain.Employee
import com.example.elasticsearch.repository.search.support.EmployeeSearchSupport
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface EmployeeSearchRepository : ElasticsearchRepository<Employee, Long> , EmployeeSearchSupport {
}
