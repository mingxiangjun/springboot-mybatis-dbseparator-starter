package org.ming.normal.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户账号实体类
 * @author MingXiangjun
 * @create 2018-08-12 9:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountInfo {
    String id;
    String userName;
    String email;
    String password;
    String securityAns;
    String securityQues;
    Date createTime;
    String salt;
}
