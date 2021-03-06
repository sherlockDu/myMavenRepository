package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.Enum;
import org.louis.hometutor.po.EnumExample;

public interface EnumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enum
     *
     * @mbggenerated
     */
    @SelectProvider(type=EnumSqlProvider.class, method="countByExample")
    int countByExample(EnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enum
     *
     * @mbggenerated
     */
    @SelectProvider(type=EnumSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="creatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="creatorName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updatorName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="key", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="text", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Enum> selectByExample(EnumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enum
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"creatorId\", \"creatorName\", ",
        "\"updatorId\", \"updatorName\", \"key\", \"text\"",
        "from \"enum\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="creatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="creatorName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="updatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updatorName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="key", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="text", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Enum selectByPrimaryKey(Long id);
}