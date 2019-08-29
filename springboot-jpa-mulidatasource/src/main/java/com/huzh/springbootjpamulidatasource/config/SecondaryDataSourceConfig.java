package com.huzh.springbootjpamulidatasource.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @ClassName SecondaryDataSourceConfig
 * @Description JPA多数据源配置 - 次数据源
 * @Date 2019/8/28 15:48
 * @Author huzh
 * @Version 1.0
 */
@Configuration
public class SecondaryDataSourceConfig {

    /**
     * 扫描spring.datasource.secondary开头的配置信息
     *
     * @return 数据源配置信息
     */
    @Bean(name = "secondaryDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     * 获取次数据源对象
     *
     * @param dataSourceProperties 注入名为secondaryDataSourceProperties的bean
     * @return 数据源对象
     */
    @Bean("secondaryDataSource")
    public DataSource dataSource(@Qualifier("secondaryDataSourceProperties") DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

    /**
     * 该方法仅在需要使用JdbcTemplate对象时选用
     *
     * @param dataSource 注入名为secondaryDataSource的bean
     * @return 数据源JdbcTemplate对象
     */
    @Bean(name = "secondaryJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("secondaryDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
