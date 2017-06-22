package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.MessageUser;
import org.louis.hometutor.po.MessageUserExample;

public interface MessageUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    @SelectProvider(type=MessageUserSqlProvider.class, method="countByExample")
    int countByExample(MessageUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    @SelectProvider(type=MessageUserSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="platformCode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="platformType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="userId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="userType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="lastLoginTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="chatRoomNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="isSuccessAddToRoom", javaType=Boolean.class, jdbcType=JdbcType.BIT)
    })
    List<MessageUser> selectByExample(MessageUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"platformCode\", \"platformType\", ",
        "\"userId\", \"userType\", \"lastLoginTimeStamp\", \"chatRoomNo\", \"isSuccessAddToRoom\"",
        "from \"message_user\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="platformCode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="platformType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="userId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="userType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="lastLoginTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="chatRoomNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="isSuccessAddToRoom", javaType=Boolean.class, jdbcType=JdbcType.BIT)
    })
    MessageUser selectByPrimaryKey(Long id);
}