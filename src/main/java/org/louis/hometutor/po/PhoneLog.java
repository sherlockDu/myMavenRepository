package org.louis.hometutor.po;

import java.util.Date;

public class PhoneLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.callingPhoneNo
     *
     * @mbggenerated
     */
    private String callingPhoneNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.calledPhoneNo
     *
     * @mbggenerated
     */
    private String calledPhoneNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.beginTimeStamp
     *
     * @mbggenerated
     */
    private Date beginTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.endTimeStamp
     *
     * @mbggenerated
     */
    private Date endTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.isSuccess
     *
     * @mbggenerated
     */
    private Boolean isSuccess;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.failReason
     *
     * @mbggenerated
     */
    private String failReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.recordUrl
     *
     * @mbggenerated
     */
    private String recordUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.sessionId
     *
     * @mbggenerated
     */
    private String sessionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.fromObjectId
     *
     * @mbggenerated
     */
    private Long fromObjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.fromObjectType
     *
     * @mbggenerated
     */
    private Integer fromObjectType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.callReason
     *
     * @mbggenerated
     */
    private String callReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.toObjectId
     *
     * @mbggenerated
     */
    private Long toObjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.toObjectType
     *
     * @mbggenerated
     */
    private Integer toObjectType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_log.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_log
     *
     * @mbggenerated
     */
    public PhoneLog(Long id, Date createTimeStamp, Date updateTimeStamp, String callingPhoneNo, String calledPhoneNo, Date beginTimeStamp, Date endTimeStamp, Boolean isSuccess, String failReason, String recordUrl, String sessionId, Long fromObjectId, Integer fromObjectType, String callReason, Long toObjectId, Integer toObjectType, String status) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.callingPhoneNo = callingPhoneNo;
        this.calledPhoneNo = calledPhoneNo;
        this.beginTimeStamp = beginTimeStamp;
        this.endTimeStamp = endTimeStamp;
        this.isSuccess = isSuccess;
        this.failReason = failReason;
        this.recordUrl = recordUrl;
        this.sessionId = sessionId;
        this.fromObjectId = fromObjectId;
        this.fromObjectType = fromObjectType;
        this.callReason = callReason;
        this.toObjectId = toObjectId;
        this.toObjectType = toObjectType;
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.id
     *
     * @return the value of phone_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.createTimeStamp
     *
     * @return the value of phone_log.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.updateTimeStamp
     *
     * @return the value of phone_log.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.callingPhoneNo
     *
     * @return the value of phone_log.callingPhoneNo
     *
     * @mbggenerated
     */
    public String getCallingPhoneNo() {
        return callingPhoneNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.calledPhoneNo
     *
     * @return the value of phone_log.calledPhoneNo
     *
     * @mbggenerated
     */
    public String getCalledPhoneNo() {
        return calledPhoneNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.beginTimeStamp
     *
     * @return the value of phone_log.beginTimeStamp
     *
     * @mbggenerated
     */
    public Date getBeginTimeStamp() {
        return beginTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.endTimeStamp
     *
     * @return the value of phone_log.endTimeStamp
     *
     * @mbggenerated
     */
    public Date getEndTimeStamp() {
        return endTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.isSuccess
     *
     * @return the value of phone_log.isSuccess
     *
     * @mbggenerated
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.failReason
     *
     * @return the value of phone_log.failReason
     *
     * @mbggenerated
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.recordUrl
     *
     * @return the value of phone_log.recordUrl
     *
     * @mbggenerated
     */
    public String getRecordUrl() {
        return recordUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.sessionId
     *
     * @return the value of phone_log.sessionId
     *
     * @mbggenerated
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.fromObjectId
     *
     * @return the value of phone_log.fromObjectId
     *
     * @mbggenerated
     */
    public Long getFromObjectId() {
        return fromObjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.fromObjectType
     *
     * @return the value of phone_log.fromObjectType
     *
     * @mbggenerated
     */
    public Integer getFromObjectType() {
        return fromObjectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.callReason
     *
     * @return the value of phone_log.callReason
     *
     * @mbggenerated
     */
    public String getCallReason() {
        return callReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.toObjectId
     *
     * @return the value of phone_log.toObjectId
     *
     * @mbggenerated
     */
    public Long getToObjectId() {
        return toObjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.toObjectType
     *
     * @return the value of phone_log.toObjectType
     *
     * @mbggenerated
     */
    public Integer getToObjectType() {
        return toObjectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_log.status
     *
     * @return the value of phone_log.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }
}