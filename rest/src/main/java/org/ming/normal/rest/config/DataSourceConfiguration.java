package org.ming.normal.rest.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 数据源配置文件
 *
 * @author MingXiangjun
 * @create 2018-08-08 22:43
 */
@Slf4j
@Configuration
@EnableConfigurationProperties(MySqlProperties.class)
public class DataSourceConfiguration {
    @Autowired
    MySqlProperties mySqlProperties;

    @Value("${mysql.datasource.type}")
    private Class<? extends DataSource> dataSourceType;

    @Bean(name = "writeDataSource")
    @Primary
    @ConfigurationProperties(prefix = "mysql.datasource.write")
    public DataSource writeDataSource(){
        log.info("--------------init writeDataSource--------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

    @Bean(name = "readDataSource")
    @ConfigurationProperties(prefix = "mysql.datasource.read01")
    public DataSource readDataSource(){
        log.info("--------------init readDataSource--------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }
}
