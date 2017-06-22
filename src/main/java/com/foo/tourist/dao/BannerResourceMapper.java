package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.BannerResource;
import org.louis.hometutor.po.BannerResourceExample;

public interface BannerResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    @SelectProvider(type=BannerResourceSqlProvider.class, method="countByExample")
    int countByExample(BannerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    @SelectProvider(type=BannerResourceSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="creatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="creator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bannerId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resourceUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pointUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sort", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="isShow", javaType=Boolean.class, jdbcType=JdbcType.BIT)
    })
    List<BannerResource> selectByExample(BannerResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"creatorId\", \"updatorId\", ",
        "\"creator\", \"updator\", \"bannerId\", \"resourceUrl\", \"pointUrl\", \"sort\", ",
        "\"isShow\"",
        "from \"banner_resource\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="creatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="creator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updator", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bannerId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resourceUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="pointUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sort", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="isShow", javaType=Boolean.class, jdbcType=JdbcType.BIT)
    })
    BannerResource selectByPrimaryKey(Long id);
}