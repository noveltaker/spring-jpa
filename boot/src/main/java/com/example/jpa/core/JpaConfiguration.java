package com.example.jpa.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Jpa configuration </br>
 * Queerydsl configuration </br>
 *
 * @author gon-zo
 */
@Configuration
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.example.jpa.data.repository")
public class JpaConfiguration {

    @Bean
    public SpringSecurityAuditorAware auditorAware() {
        return new SpringSecurityAuditorAware();
    }

}