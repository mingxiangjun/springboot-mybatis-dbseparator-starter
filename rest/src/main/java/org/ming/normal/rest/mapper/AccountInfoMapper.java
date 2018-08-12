package org.ming.normal.rest.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.ming.normal.rest.entity.AccountInfo;

import java.util.List;
import java.util.Map;

/**
 * Mapper
 * @author MingXiangjun
 * @create 2018-08-12 9:42
 **/
@Mapper
public interface AccountInfoMapper {
    static final String baseColumn = "id as id,user_name as userName,email,password,salt,security_ans as securityAns,security_ques as securityQues,create_time as createTime";
    @Insert(value = "insert into account_(id,email,password,salt,security_ans,security_ques,user_name) " +
            "values(#{id},#{email},#{password},#{salt},#{securityAns},#{securityQues},#{userName})")
    void save(AccountInfo accountInfo);

    @Update(value = "update account_ set email=#{email}," +
            "password=#{password}," +
            "salt=#{salt}," +
            "security_ans=#{securityAns}," +
            "security_ques=#{securityQues}," +
            "user_name=#{userName} " +
            "where id=#{id}"
           )
    void update(AccountInfo accountInfo);
    @Select(value = "<script>" +
            "select " + baseColumn +
            "from account_" +
            "<if test='userName!=null and userName != null '>" +
            "  user_name = #{userName}" +
            "</if>" +
            "</script>")
    List<AccountInfo> selectByCondition(Map condition);

    @Select("select "+baseColumn+" from account_ where id=#{id}")
    AccountInfo selectById(String id);
}
