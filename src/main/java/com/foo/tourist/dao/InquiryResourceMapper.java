package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.InquiryResource;
import org.louis.hometutor.po.InquiryResourceExample;

public interface InquiryResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inquiry_resource
     *
     * @mbggenerated
     */
    @SelectProvider(type=InquiryResourceSqlProvider.class, method="countByExample")
    int countByExample(InquiryResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inquiry_resource
     *
     * @mbggenerated
     */
    @SelectProvider(type=InquiryResourceSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="resourceUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="inquiryId", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<InquiryResource> selectByExample(InquiryResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inquiry_resource
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"resourceUrl\", \"inquiryId\"",
        "from \"inquiry_resource\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="resourceUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="inquiryId", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    InquiryResource selectByPrimaryKey(Long id);
}