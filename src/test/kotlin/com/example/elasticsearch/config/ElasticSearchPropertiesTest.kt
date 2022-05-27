package com.example.elasticsearch.config

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.test.autoconfigure.data.elasticsearch.AutoConfigureDataElasticsearch
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor
import org.springframework.test.context.TestPropertySource

@SpringBootTest
@AutoConfigureDataJpa
@AutoConfigureDataElasticsearch
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@EnableConfigurationProperties(ElasticSearchProperties::class)
@TestPropertySource("classpath:application.yml")
internal class ElasticSearchPropertiesTest constructor(
    val elasticSearchProperties: ElasticSearchProperties,
) {


    @Test
    fun getProperties() {
        Assertions.assertEquals(elasticSearchProperties.getConfig().getIp(), "localhost")
        Assertions.assertEquals(elasticSearchProperties.getConfig().getPort(), "9200")
        Assertions.assertEquals(elasticSearchProperties.getConfig().getFullUrl(), "localhost:9200")
    }
}
