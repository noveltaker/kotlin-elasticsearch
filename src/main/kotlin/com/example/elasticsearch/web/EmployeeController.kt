package com.example.elasticsearch.web

import com.example.elasticsearch.service.EmployeeServiceImpl
import com.example.elasticsearch.service.dto.Created
import com.example.elasticsearch.service.dto.PageDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController constructor(private val service: EmployeeServiceImpl) {

    @PostMapping("employee")
    fun created(@RequestBody dto: Created) = ResponseEntity.status(HttpStatus.CREATED).body(service.save(dto))

    @GetMapping("employees/{name}")
    fun searchName(@PathVariable name: String, dto: PageDTO) = service.getSearchName(name, dto)
}
