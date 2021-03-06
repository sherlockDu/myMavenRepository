package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.Collect;
import org.louis.hometutor.po.CollectExample;

public interface CollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    @SelectProvider(type=CollectSqlProvider.class, method="countByExample")
    int countByExample(CollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    @SelectProvider(type=CollectSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="collectorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="collectorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="collectObjectId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="collectObjectType", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<Collect> selectByExample(CollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"collectorId\", \"collectorType\", ",
        "\"collectObjectId\", \"collectObjectType\"",
        "from \"collect\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="collectorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="collectorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="collectObjectId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="collectObjectType", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Collect selectByPrimaryKey(Long id);
}