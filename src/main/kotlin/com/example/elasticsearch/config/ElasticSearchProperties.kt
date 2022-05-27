package com.example.elasticsearch.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "elasticsearch")
data class ElasticSearchProperties constructor(
    private val config: Config
) {
    fun getConfig() = this.config

    data class Config(private val ip: String, private val port: String) {
        fun getIp() = this.ip
        fun getPort() = this.port
        fun getFullUrl() = "${ip}:${port}"
    }
}
