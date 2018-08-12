package org.ming.normal.rest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * mysql数据库配置文件
 *
 * @author MingXiangjun
 * @create 2018-08-08 22:40
 */
@ConfigurationProperties(prefix = "mysql.datasource")
public class MySqlProperties extends HashMap<String,Object> {
}
