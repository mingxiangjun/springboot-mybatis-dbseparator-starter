package org.ming.normal.rest.config;

import lombok.extern.slf4j.Slf4j;
import org.ming.normal.rest.common.DataSourceType;

/**
 * 数据源上下文
 *
 * @author MingXiangjun
 * @create 2018-08-08 22:47
 */
@Slf4j
public class DataSourceContextHolder {
    private static final ThreadLocal<String> local = new ThreadLocal<>();
    public static ThreadLocal<String> getLocal(){
        return local;
    }

    /**
     * 设置读取数据源
     */
    public static void setRead(){
        log.info("--------------数据库切换到读数据库------------------");
        local.set(DataSourceType.READ.getType());
    }

    /**
     * 设置写数据源
     */
    public static void setWrite(){
        log.info("--------------数据库切换到写数据库------------------");
        local.set(DataSourceType.WRITE.getType());
    }

    /**
     * 获取当前数据源信息
     * @return
     */
    public static String getReadOrWrite(){
        return local.get();
    }

    /**
     * 清理数据源
     */
    public static void clear(){
        local.remove();
    }
}
