package org.louis.hometutor.po;

import java.util.Date;

public class InternalUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.userName
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.realName
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.phoneNo
     *
     * @mbggenerated
     */
    private String phoneNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.isdel
     *
     * @mbggenerated
     */
    private Boolean isdel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.updatorId
     *
     * @mbggenerated
     */
    private Long updatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.creatorId
     *
     * @mbggenerated
     */
    private Long creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column internal_user.no
     *
     * @mbggenerated
     */
    private String no;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_user
     *
     * @mbggenerated
     */
    public InternalUser(Long id, Date createTimeStamp, Date updateTimeStamp, String userName, String password, String realName, String phoneNo, Boolean isdel, Long updatorId, Long creatorId, String no) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.userName = userName;
        this.password = password;
        this.realName = realName;
        this.phoneNo = phoneNo;
        this.isdel = isdel;
        this.updatorId = updatorId;
        this.creatorId = creatorId;
        this.no = no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.id
     *
     * @return the value of internal_user.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.createTimeStamp
     *
     * @return the value of internal_user.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.updateTimeStamp
     *
     * @return the value of internal_user.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.userName
     *
     * @return the value of internal_user.userName
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.password
     *
     * @return the value of internal_user.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.realName
     *
     * @return the value of internal_user.realName
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.phoneNo
     *
     * @return the value of internal_user.phoneNo
     *
     * @mbggenerated
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.isdel
     *
     * @return the value of internal_user.isdel
     *
     * @mbggenerated
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.updatorId
     *
     * @return the value of internal_user.updatorId
     *
     * @mbggenerated
     */
    public Long getUpdatorId() {
        return updatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.creatorId
     *
     * @return the value of internal_user.creatorId
     *
     * @mbggenerated
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column internal_user.no
     *
     * @return the value of internal_user.no
     *
     * @mbggenerated
     */
    public String getNo() {
        return no;
    }
}