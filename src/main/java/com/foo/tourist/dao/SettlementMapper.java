package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.Settlement;
import org.louis.hometutor.po.SettlementExample;

public interface SettlementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbggenerated
     */
    @SelectProvider(type=SettlementSqlProvider.class, method="countByExample")
    int countByExample(SettlementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbggenerated
     */
    @SelectProvider(type=SettlementSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="orderId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="orderType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="paymentId", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="targetType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="fee", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="toSettmentTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="toSettleUserId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="orderNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="isRead", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="settlement", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Settlement> selectByExample(SettlementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"orderId\", \"orderType\", ",
        "\"paymentId\", \"targetType\", \"status\", \"fee\", \"toSettmentTimeStamp\", ",
        "\"toSettleUserId\", \"orderNo\", \"isRead\", \"settlement\"",
        "from \"settlement\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="orderId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="orderType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="paymentId", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="targetType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="fee", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="toSettmentTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="toSettleUserId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="orderNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="isRead", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="settlement", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Settlement selectByPrimaryKey(Long id);
}