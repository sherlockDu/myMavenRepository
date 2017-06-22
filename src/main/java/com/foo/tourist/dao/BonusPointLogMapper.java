package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.BonusPointLog;
import org.louis.hometutor.po.BonusPointLogExample;

public interface BonusPointLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    @SelectProvider(type=BonusPointLogSqlProvider.class, method="countByExample")
    int countByExample(BonusPointLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    @SelectProvider(type=BonusPointLogSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="targetId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="targetType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<BonusPointLog> selectByExample(BonusPointLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"count\", \"targetId\", \"targetType\", ",
        "\"reason\", \"remark\"",
        "from \"bonus_point_log\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="count", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="targetId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="targetType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="reason", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="remark", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    BonusPointLog selectByPrimaryKey(Long id);
}