package com.example.elasticsearch.config

import org.elasticsearch.client.RestHighLevelClient
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.RestClients
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration

@TestConfiguration
class ElasticSearchTestConfiguration : AbstractElasticsearchConfiguration() {
    override fun elasticsearchClient(): RestHighLevelClient {
        val configuration =
            ClientConfiguration.builder().connectedTo("localhost:9200").build()
        return RestClients.create(configuration).rest()

    }
}