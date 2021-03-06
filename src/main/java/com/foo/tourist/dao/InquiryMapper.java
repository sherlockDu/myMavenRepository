package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.Inquiry;
import org.louis.hometutor.po.InquiryExample;

public interface InquiryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inquiry
     *
     * @mbggenerated
     */
    @SelectProvider(type=InquirySqlProvider.class, method="countByExample")
    int countByExample(InquiryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inquiry
     *
     * @mbggenerated
     */
    @SelectProvider(type=InquirySqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="orderId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="dpId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="treatment", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Inquiry> selectByExample(InquiryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inquiry
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"orderId\", \"dpId\", \"desc\", ",
        "\"treatment\"",
        "from \"inquiry\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="orderId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="dpId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="treatment", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Inquiry selectByPrimaryKey(Long id);
}