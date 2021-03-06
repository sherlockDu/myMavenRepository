package org.louis.hometutor.po;

import java.util.Date;

public class TopicFreeConsultContent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.topicId
     *
     * @mbggenerated
     */
    private Long topicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.creatorId
     *
     * @mbggenerated
     */
    private Long creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.creatorType
     *
     * @mbggenerated
     */
    private Integer creatorType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.updatorId
     *
     * @mbggenerated
     */
    private Long updatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.updatorType
     *
     * @mbggenerated
     */
    private Integer updatorType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.diseaseDesc
     *
     * @mbggenerated
     */
    private String diseaseDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.treatmentHistory
     *
     * @mbggenerated
     */
    private String treatmentHistory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.answerId
     *
     * @mbggenerated
     */
    private Long answerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.answerType
     *
     * @mbggenerated
     */
    private Integer answerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.answerName
     *
     * @mbggenerated
     */
    private String answerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_free_consult_content.replyStatus
     *
     * @mbggenerated
     */
    private Integer replyStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_free_consult_content
     *
     * @mbggenerated
     */
    public TopicFreeConsultContent(Long id, Long topicId, Date createTimeStamp, Date updateTimeStamp, Long creatorId, Integer creatorType, Long updatorId, Integer updatorType, String diseaseDesc, String treatmentHistory, Long answerId, Integer answerType, String answerName, Integer replyStatus) {
        this.id = id;
        this.topicId = topicId;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.creatorId = creatorId;
        this.creatorType = creatorType;
        this.updatorId = updatorId;
        this.updatorType = updatorType;
        this.diseaseDesc = diseaseDesc;
        this.treatmentHistory = treatmentHistory;
        this.answerId = answerId;
        this.answerType = answerType;
        this.answerName = answerName;
        this.replyStatus = replyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.id
     *
     * @return the value of topic_free_consult_content.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.topicId
     *
     * @return the value of topic_free_consult_content.topicId
     *
     * @mbggenerated
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.createTimeStamp
     *
     * @return the value of topic_free_consult_content.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.updateTimeStamp
     *
     * @return the value of topic_free_consult_content.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.creatorId
     *
     * @return the value of topic_free_consult_content.creatorId
     *
     * @mbggenerated
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.creatorType
     *
     * @return the value of topic_free_consult_content.creatorType
     *
     * @mbggenerated
     */
    public Integer getCreatorType() {
        return creatorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.updatorId
     *
     * @return the value of topic_free_consult_content.updatorId
     *
     * @mbggenerated
     */
    public Long getUpdatorId() {
        return updatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.updatorType
     *
     * @return the value of topic_free_consult_content.updatorType
     *
     * @mbggenerated
     */
    public Integer getUpdatorType() {
        return updatorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.diseaseDesc
     *
     * @return the value of topic_free_consult_content.diseaseDesc
     *
     * @mbggenerated
     */
    public String getDiseaseDesc() {
        return diseaseDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.treatmentHistory
     *
     * @return the value of topic_free_consult_content.treatmentHistory
     *
     * @mbggenerated
     */
    public String getTreatmentHistory() {
        return treatmentHistory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.answerId
     *
     * @return the value of topic_free_consult_content.answerId
     *
     * @mbggenerated
     */
    public Long getAnswerId() {
        return answerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.answerType
     *
     * @return the value of topic_free_consult_content.answerType
     *
     * @mbggenerated
     */
    public Integer getAnswerType() {
        return answerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.answerName
     *
     * @return the value of topic_free_consult_content.answerName
     *
     * @mbggenerated
     */
    public String getAnswerName() {
        return answerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_free_consult_content.replyStatus
     *
     * @return the value of topic_free_consult_content.replyStatus
     *
     * @mbggenerated
     */
    public Integer getReplyStatus() {
        return replyStatus;
    }
}