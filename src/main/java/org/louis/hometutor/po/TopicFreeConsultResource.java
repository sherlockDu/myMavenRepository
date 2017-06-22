package org.louis.hometutor.po;

import java.util.Date;

public class TopicFreeConsultResource {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_resource.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_resource.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_resource.topicId
     *
     * @mbggenerated
     */
    private Long topicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_resource.resourceUrl
     *
     * @mbggenerated
     */
    private String resourceUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_free_consult_resource
     *
     * @mbggenerated
     */
    public TopicFreeConsultResource(Long id, Date createTimeStamp, Long topicId, String resourceUrl) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.topicId = topicId;
        this.resourceUrl = resourceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_resource.id
     *
     * @return the value of topic_free_consult_resource.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_resource.createTimeStamp
     *
     * @return the value of topic_free_consult_resource.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_resource.topicId
     *
     * @return the value of topic_free_consult_resource.topicId
     *
     * @mbggenerated
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_resource.resourceUrl
     *
     * @return the value of topic_free_consult_resource.resourceUrl
     *
     * @mbggenerated
     */
    public String getResourceUrl() {
        return resourceUrl;
    }
}