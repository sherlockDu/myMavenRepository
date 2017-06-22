package org.louis.hometutor.po;

import java.util.Date;

public class LeanCloudSession {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lean_cloud_session.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lean_cloud_session.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lean_cloud_session.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lean_cloud_session.sessionUserId
     *
     * @mbggenerated
     */
    private String sessionUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lean_cloud_session.sessionId
     *
     * @mbggenerated
     */
    private String sessionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lean_cloud_session
     *
     * @mbggenerated
     */
    public LeanCloudSession(Long id, Date createTimeStamp, Date updateTimeStamp, String sessionUserId, String sessionId) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.sessionUserId = sessionUserId;
        this.sessionId = sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lean_cloud_session.id
     *
     * @return the value of lean_cloud_session.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lean_cloud_session.createTimeStamp
     *
     * @return the value of lean_cloud_session.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lean_cloud_session.updateTimeStamp
     *
     * @return the value of lean_cloud_session.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lean_cloud_session.sessionUserId
     *
     * @return the value of lean_cloud_session.sessionUserId
     *
     * @mbggenerated
     */
    public String getSessionUserId() {
        return sessionUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lean_cloud_session.sessionId
     *
     * @return the value of lean_cloud_session.sessionId
     *
     * @mbggenerated
     */
    public String getSessionId() {
        return sessionId;
    }
}