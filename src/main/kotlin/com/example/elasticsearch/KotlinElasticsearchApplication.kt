package com.example.elasticsearch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class KotlinElasticsearchApplication

fun main(args: Array<String>) {
    runApplication<KotlinElasticsearchApplication>(*args)
}
