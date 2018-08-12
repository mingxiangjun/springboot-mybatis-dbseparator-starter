package org.ming.normal.rest.common;

import lombok.Getter;

/**
 * 数据源类型枚举
 * @author Mingxiangjun
 * @date 22点45分
 */
@Getter
public enum DataSourceType {
    READ("read"),
    WRITE("write");
    private String type;
    DataSourceType(String type){
        this.type = type;
    }
}
