package org.louis.hometutor.po;

import java.util.Date;

public class DeviceInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_info.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_info.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_info.deviceType
     *
     * @mbggenerated
     */
    private Integer deviceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_info.userId
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_info.deviceInfo
     *
     * @mbggenerated
     */
    private String deviceInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_info.userType
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_info.pushToken
     *
     * @mbggenerated
     */
    private String pushToken;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_info
     *
     * @mbggenerated
     */
    public DeviceInfo(Long id, Date createTimeStamp, Date updateTimeStamp, Integer deviceType, Long userId, String deviceInfo, Integer userType, String pushToken) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.deviceType = deviceType;
        this.userId = userId;
        this.deviceInfo = deviceInfo;
        this.userType = userType;
        this.pushToken = pushToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_info.id
     *
     * @return the value of device_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_info.createTimeStamp
     *
     * @return the value of device_info.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_info.updateTimeStamp
     *
     * @return the value of device_info.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_info.deviceType
     *
     * @return the value of device_info.deviceType
     *
     * @mbggenerated
     */
    public Integer getDeviceType() {
        return deviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_info.userId
     *
     * @return the value of device_info.userId
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_info.deviceInfo
     *
     * @return the value of device_info.deviceInfo
     *
     * @mbggenerated
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_info.userType
     *
     * @return the value of device_info.userType
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_info.pushToken
     *
     * @return the value of device_info.pushToken
     *
     * @mbggenerated
     */
    public String getPushToken() {
        return pushToken;
    }
}