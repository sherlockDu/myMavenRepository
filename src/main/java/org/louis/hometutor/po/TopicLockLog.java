package org.louis.hometutor.po;

import java.util.Date;

public class TopicLockLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_lock_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_lock_log.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_lock_log.userId
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_lock_log.userType
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_lock_log.lockReason
     *
     * @mbggenerated
     */
    private String lockReason;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_lock_log
     *
     * @mbggenerated
     */
    public TopicLockLog(Long id, Date createTimeStamp, Long userId, Integer userType, String lockReason) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.userId = userId;
        this.userType = userType;
        this.lockReason = lockReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_lock_log.id
     *
     * @return the value of topic_lock_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_lock_log.createTimeStamp
     *
     * @return the value of topic_lock_log.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_lock_log.userId
     *
     * @return the value of topic_lock_log.userId
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_lock_log.userType
     *
     * @return the value of topic_lock_log.userType
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_lock_log.lockReason
     *
     * @return the value of topic_lock_log.lockReason
     *
     * @mbggenerated
     */
    public String getLockReason() {
        return lockReason;
    }
}