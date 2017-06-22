package org.louis.hometutor.po;

import java.util.Date;

public class NotifyMessage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.targetObjectId
     *
     * @mbggenerated
     */
    private Long targetObjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.targetObjectType
     *
     * @mbggenerated
     */
    private Integer targetObjectType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.receiverId
     *
     * @mbggenerated
     */
    private Long receiverId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.userType
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.isRead
     *
     * @mbggenerated
     */
    private Boolean isRead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.senderId
     *
     * @mbggenerated
     */
    private Long senderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notify_message.sendType
     *
     * @mbggenerated
     */
    private Integer sendType;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_message
     *
     * @mbggenerated
     */
    public NotifyMessage(Long id, Date createTimeStamp, Date updateTimeStamp, Long targetObjectId, Integer targetObjectType, Long receiverId, Integer userType, Boolean isRead, String content, Long senderId, Integer sendType) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.targetObjectId = targetObjectId;
        this.targetObjectType = targetObjectType;
        this.receiverId = receiverId;
        this.userType = userType;
        this.isRead = isRead;
        this.content = content;
        this.senderId = senderId;
        this.sendType = sendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.id
     *
     * @return the value of notify_message.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.createTimeStamp
     *
     * @return the value of notify_message.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.updateTimeStamp
     *
     * @return the value of notify_message.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.targetObjectId
     *
     * @return the value of notify_message.targetObjectId
     *
     * @mbggenerated
     */
    public Long getTargetObjectId() {
        return targetObjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.targetObjectType
     *
     * @return the value of notify_message.targetObjectType
     *
     * @mbggenerated
     */
    public Integer getTargetObjectType() {
        return targetObjectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.receiverId
     *
     * @return the value of notify_message.receiverId
     *
     * @mbggenerated
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.userType
     *
     * @return the value of notify_message.userType
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.isRead
     *
     * @return the value of notify_message.isRead
     *
     * @mbggenerated
     */
    public Boolean getIsRead() {
        return isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.content
     *
     * @return the value of notify_message.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.senderId
     *
     * @return the value of notify_message.senderId
     *
     * @mbggenerated
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notify_message.sendType
     *
     * @return the value of notify_message.sendType
     *
     * @mbggenerated
     */
    public Integer getSendType() {
        return sendType;
    }
}