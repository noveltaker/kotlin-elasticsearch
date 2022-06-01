package com.example.elasticsearch.repository

import com.example.elasticsearch.config.ElasticSearchConfiguration
import com.example.elasticsearch.config.ElasticSearchProperties
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.context.annotation.Import
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit.jupiter.SpringExtension


@DataJpaTest
@ExtendWith(value = [SpringExtension::class])
@TestPropertySource("classpath:application.yml")
@Import(value = [ElasticSearchConfiguration::class, ElasticSearchProperties::class])
internal class EmployeeRepositoryTest {

    @Autowired
    private var employeeRepository: EmployeeRepository? = null

    @Test
    fun save() {

    }
}