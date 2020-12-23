package com.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 多重数据源配置
 *
 * @author bigdata@tcfuture.tech
 * @since 2020/4/27
 */
@Configuration
public class MultiDatasourceConfig {

    @Primary
    @Bean("omsCoreDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.core")
    public DataSource initOmsCoreDatasource() {
        return DataSourceBuilder.create().build();
    }

}
