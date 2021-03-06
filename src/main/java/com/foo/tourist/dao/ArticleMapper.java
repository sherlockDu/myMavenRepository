package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.Article;
import org.louis.hometutor.po.ArticleExample;

public interface ArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @SelectProvider(type=ArticleSqlProvider.class, method="countByExample")
    int countByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @SelectProvider(type=ArticleSqlProvider.class, method="selectByExampleWithBLOBs")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="author", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="thumbnailUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ownerId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="creatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ownerType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="creatorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updatorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="likeCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="commentCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="collectCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="resourceCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="hasVideo", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="hasAudio", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="isShow", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="readCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="publicTime", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="content", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @SelectProvider(type=ArticleSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="author", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="thumbnailUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ownerId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="creatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ownerType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="creatorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updatorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="likeCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="commentCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="collectCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="resourceCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="hasVideo", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="hasAudio", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="isShow", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="readCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="publicTime", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP)
    })
    List<Article> selectByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"type\", \"desc\", \"author\", ",
        "\"thumbnailUrl\", \"title\", \"ownerId\", \"creatorId\", \"updatorId\", \"ownerType\", ",
        "\"creatorType\", \"updatorType\", \"likeCount\", \"commentCount\", \"collectCount\", ",
        "\"resourceCount\", \"hasVideo\", \"hasAudio\", \"isShow\", \"readCount\", \"publicTime\", ",
        "\"content\"",
        "from \"article\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="type", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="desc", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="author", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="thumbnailUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="title", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ownerId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="creatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="updatorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ownerType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="creatorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="updatorType", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="likeCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="commentCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="collectCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="resourceCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="hasVideo", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="hasAudio", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="isShow", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="readCount", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="publicTime", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="content", javaType=String.class, jdbcType=JdbcType.LONGVARCHAR)
    })
    Article selectByPrimaryKey(Long id);
}