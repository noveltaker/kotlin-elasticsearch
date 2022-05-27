package com.example.elasticsearch.config

import org.elasticsearch.client.RestHighLevelClient
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.RestClients
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories

@Configuration
@EnableElasticsearchRepositories(basePackages = ["com.example.elasticsearch.repository.search"])
class ElasticSearchConfiguration(private val elasticSearchProperties: ElasticSearchProperties) :
    AbstractElasticsearchConfiguration() {

    override fun elasticsearchClient(): RestHighLevelClient {
        val configuration =
            ClientConfiguration.builder().connectedTo(elasticSearchProperties.getConfig().getFullUrl()).build()
        return RestClients.create(configuration).rest()
    }
}
