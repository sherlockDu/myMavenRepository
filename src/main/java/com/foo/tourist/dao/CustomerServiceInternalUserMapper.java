package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.CustomerServiceInternalUser;
import org.louis.hometutor.po.CustomerServiceInternalUserExample;

public interface CustomerServiceInternalUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    @SelectProvider(type=CustomerServiceInternalUserSqlProvider.class, method="countByExample")
    int countByExample(CustomerServiceInternalUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    @SelectProvider(type=CustomerServiceInternalUserSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="creator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="internalUserId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="customerServcieId", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<CustomerServiceInternalUser> selectByExample(CustomerServiceInternalUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"updator\", \"creator\", ",
        "\"internalUserId\", \"customerServcieId\"",
        "from \"customer_service_internal_user\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="creator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="internalUserId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="customerServcieId", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    CustomerServiceInternalUser selectByPrimaryKey(Long id);
}