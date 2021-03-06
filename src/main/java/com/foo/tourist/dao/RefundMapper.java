package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.Refund;
import org.louis.hometutor.po.RefundExample;

public interface RefundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund
     *
     * @mbggenerated
     */
    @SelectProvider(type=RefundSqlProvider.class, method="countByExample")
    int countByExample(RefundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund
     *
     * @mbggenerated
     */
    @SelectProvider(type=RefundSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="orderId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="orderType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="refundTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="refundRreson", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="refundStatus", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="refundAcceptorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="refundAcceptorName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="refuseReason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="orderNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="refundFee", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="operator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="refundNo", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Refund> selectByExample(RefundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table refund
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"orderId\", \"orderType\", ",
        "\"refundTimeStamp\", \"refundRreson\", \"refundStatus\", \"refundAcceptorId\", ",
        "\"refundAcceptorName\", \"refuseReason\", \"orderNo\", \"refundFee\", \"operator\", ",
        "\"operatorId\", \"refundNo\"",
        "from \"refund\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="orderId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="orderType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="refundTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="refundRreson", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="refundStatus", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="refundAcceptorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="refundAcceptorName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="refuseReason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="orderNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="refundFee", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="operator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="operatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="refundNo", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Refund selectByPrimaryKey(Long id);
}