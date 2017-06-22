package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.LoginUserToken;
import org.louis.hometutor.po.LoginUserTokenExample;

public interface LoginUserTokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_user_token
     *
     * @mbggenerated
     */
    @SelectProvider(type=LoginUserTokenSqlProvider.class, method="countByExample")
    int countByExample(LoginUserTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_user_token
     *
     * @mbggenerated
     */
    @SelectProvider(type=LoginUserTokenSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="token", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="userId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="userType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="logoutTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<LoginUserToken> selectByExample(LoginUserTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_user_token
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"token\", \"userId\", \"userType\", ",
        "\"logoutTimeStamp\"",
        "from \"login_user_token\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="token", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="userId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="userType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="logoutTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    LoginUserToken selectByPrimaryKey(Long id);
}