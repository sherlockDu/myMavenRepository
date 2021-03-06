package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.NotifyMessage;
import org.louis.hometutor.po.NotifyMessageExample;

public interface NotifyMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_message
     *
     * @mbggenerated
     */
    @SelectProvider(type=NotifyMessageSqlProvider.class, method="countByExample")
    int countByExample(NotifyMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_message
     *
     * @mbggenerated
     */
    @SelectProvider(type=NotifyMessageSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="targetObjectId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="targetObjectType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="receiverId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="userType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="isRead", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="senderId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sendType", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<NotifyMessage> selectByExample(NotifyMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_message
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"targetObjectId\", \"targetObjectType\", ",
        "\"receiverId\", \"userType\", \"isRead\", \"content\", \"senderId\", \"sendType\"",
        "from \"notify_message\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="targetObjectId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="targetObjectType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="receiverId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="userType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="isRead", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="content", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="senderId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="sendType", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    NotifyMessage selectByPrimaryKey(Long id);
}