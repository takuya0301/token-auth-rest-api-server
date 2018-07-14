package com.example.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.session.web.http.HeaderHttpSessionIdResolver
import org.springframework.session.web.http.HttpSessionIdResolver

@Configuration
class SessionConfig {
    @Bean
    fun httpSessionIdResolver(): HttpSessionIdResolver =
            HeaderHttpSessionIdResolver.xAuthToken()
}
