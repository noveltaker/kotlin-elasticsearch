package com.example.elasticsearch.repository

import com.example.elasticsearch.domain.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employee, Long> {
}
