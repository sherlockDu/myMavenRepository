package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.Topic;
import org.louis.hometutor.po.TopicExample;

public interface TopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated
     */
    @SelectProvider(type=TopicSqlProvider.class, method="countByExample")
    int countByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated
     */
    @SelectProvider(type=TopicSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="creatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="creatorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updatorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="answerCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="lastReplyTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="lockExpireDate", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="isLock", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="isShow", javaType=Boolean.class, jdbcType=JdbcType.BIT)
    })
    List<Topic> selectByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"creatorId\", \"creatorType\", ",
        "\"updatorId\", \"updatorType\", \"answerCount\", \"lastReplyTimeStamp\", \"lockExpireDate\", ",
        "\"isLock\", \"type\", \"content\", \"title\", \"isShow\"",
        "from \"topic\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="creatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="creatorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updatorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="answerCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="lastReplyTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="lockExpireDate", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="isLock", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="isShow", javaType=Boolean.class, jdbcType=JdbcType.BIT)
    })
    Topic selectByPrimaryKey(Long id);
}