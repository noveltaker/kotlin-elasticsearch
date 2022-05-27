package com.example.elasticsearch.repository.search.support

import com.example.elasticsearch.domain.Employee
import org.springframework.data.domain.Pageable
import org.springframework.data.elasticsearch.core.ElasticsearchOperations
import org.springframework.data.elasticsearch.core.query.Criteria
import org.springframework.data.elasticsearch.core.query.CriteriaQuery

class EmployeeSearchSupportImpl constructor(private val operations: ElasticsearchOperations) : EmployeeSearchSupport {

    override fun searchByName(name: String, pageable: Pageable): List<Employee> {
        val criteria = Criteria.where("basicProfile.name").contains(name)
        val query = CriteriaQuery(criteria, pageable)
        val search = operations.search(query, Employee::class.java)
        return search.map { map -> map.content }.toList()
    }
}

