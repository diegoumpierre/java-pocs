package com.umpierre.webfluxdemo.configuration;

import io.r2dbc.h2.H2Connection;
import io.r2dbc.h2.H2ConnectionConfiguration;
import io.r2dbc.h2.H2ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories(basePackages = "com.umpierre.webfluxdemo.reactivestream")
public class R2DBCConfiguration extends AbstractR2dbcConfiguration {
    @Bean
    public H2ConnectionFactory connectionFactory() {

        H2ConnectionFactory h2ConnectionFactory = new H2ConnectionFactory(
                H2ConnectionConfiguration.builder()
                        .file("/Users/dumpierre/h2-db")
                        .username("sa")
                        .build());

       return h2ConnectionFactory;
    }
}