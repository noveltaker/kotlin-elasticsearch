package com.example.elasticsearch.service

import com.example.elasticsearch.repository.search.EmployeeSearchRepository
import com.example.elasticsearch.service.dto.Created
import com.example.elasticsearch.service.dto.PageDTO
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class EmployeeService constructor(
    private val repository: EmployeeSearchRepository, private val searchRepository: EmployeeSearchRepository
) {
    @Transactional
    fun save(dto: Created) = repository.save(dto.toEntity())

    @Transactional(readOnly = true)
    fun getSearchName(name: String, dto: PageDTO) = searchRepository.searchByName(name, dto.getPageRequest())
}
