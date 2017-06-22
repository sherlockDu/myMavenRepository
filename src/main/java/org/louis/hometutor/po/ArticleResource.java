package org.louis.hometutor.po;

import java.util.Date;

public class ArticleResource {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_resource.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_resource.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_resource.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_resource.resourceUrl
     *
     * @mbggenerated
     */
    private String resourceUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_resource.articleId
     *
     * @mbggenerated
     */
    private Long articleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_resource
     *
     * @mbggenerated
     */
    public ArticleResource(Long id, Date createTimeStamp, Date updateTimeStamp, String resourceUrl, Long articleId) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.resourceUrl = resourceUrl;
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_resource.id
     *
     * @return the value of article_resource.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_resource.createTimeStamp
     *
     * @return the value of article_resource.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_resource.updateTimeStamp
     *
     * @return the value of article_resource.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_resource.resourceUrl
     *
     * @return the value of article_resource.resourceUrl
     *
     * @mbggenerated
     */
    public String getResourceUrl() {
        return resourceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_resource.articleId
     *
     * @return the value of article_resource.articleId
     *
     * @mbggenerated
     */
    public Long getArticleId() {
        return articleId;
    }
}