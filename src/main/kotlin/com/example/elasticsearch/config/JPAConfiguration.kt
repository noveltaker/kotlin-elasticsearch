package com.example.elasticsearch.config

import com.example.elasticsearch.repository.search.EmployeeSearchRepository
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.FilterType
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaAuditing
@EnableJpaRepositories(
    basePackages = ["com.example.elasticsearch.repository"], excludeFilters = [ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE, classes = [EmployeeSearchRepository::class]
    )]
)
class JPAConfiguration {}
