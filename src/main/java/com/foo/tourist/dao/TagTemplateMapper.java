package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.TagTemplate;
import org.louis.hometutor.po.TagTemplateExample;

public interface TagTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_template
     *
     * @mbggenerated
     */
    @SelectProvider(type=TagTemplateSqlProvider.class, method="countByExample")
    int countByExample(TagTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_template
     *
     * @mbggenerated
     */
    @SelectProvider(type=TagTemplateSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<TagTemplate> selectByExample(TagTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_template
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"name\", \"type\"",
        "from \"tag_template\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="type", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    TagTemplate selectByPrimaryKey(Long id);
}