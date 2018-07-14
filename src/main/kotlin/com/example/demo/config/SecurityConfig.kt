package com.example.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.provisioning.JdbcUserDetailsManager
import javax.sql.DataSource

@Configuration
class SecurityConfig {
    @Bean
    fun jdbcUserDetailsManager(dataSource: DataSource): JdbcUserDetailsManager {
        val jdbcUserDetailsManager = JdbcUserDetailsManager()
        jdbcUserDetailsManager.setDataSource(dataSource)
        return jdbcUserDetailsManager
    }
}
