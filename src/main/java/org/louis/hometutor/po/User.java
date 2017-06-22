package org.louis.hometutor.po;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userObjectType
     *
     * @mbggenerated
     */
    private Integer userObjectType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userObjectId
     *
     * @mbggenerated
     */
    private Long userObjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.customerServiceMessageUnReadCount
     *
     * @mbggenerated
     */
    private Integer customerServiceMessageUnReadCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated
     */
    private Boolean sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lastAskBoneTimestamp
     *
     * @mbggenerated
     */
    private Date lastAskBoneTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.no
     *
     * @mbggenerated
     */
    private String no;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public User(Long id, Date createTimeStamp, Date updateTimeStamp, Integer userObjectType, Long userObjectId, Integer customerServiceMessageUnReadCount, String name, Boolean sex, Date lastAskBoneTimestamp, String no) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.userObjectType = userObjectType;
        this.userObjectId = userObjectId;
        this.customerServiceMessageUnReadCount = customerServiceMessageUnReadCount;
        this.name = name;
        this.sex = sex;
        this.lastAskBoneTimestamp = lastAskBoneTimestamp;
        this.no = no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.createTimeStamp
     *
     * @return the value of user.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.updateTimeStamp
     *
     * @return the value of user.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userObjectType
     *
     * @return the value of user.userObjectType
     *
     * @mbggenerated
     */
    public Integer getUserObjectType() {
        return userObjectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userObjectId
     *
     * @return the value of user.userObjectId
     *
     * @mbggenerated
     */
    public Long getUserObjectId() {
        return userObjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.customerServiceMessageUnReadCount
     *
     * @return the value of user.customerServiceMessageUnReadCount
     *
     * @mbggenerated
     */
    public Integer getCustomerServiceMessageUnReadCount() {
        return customerServiceMessageUnReadCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lastAskBoneTimestamp
     *
     * @return the value of user.lastAskBoneTimestamp
     *
     * @mbggenerated
     */
    public Date getLastAskBoneTimestamp() {
        return lastAskBoneTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.no
     *
     * @return the value of user.no
     *
     * @mbggenerated
     */
    public String getNo() {
        return no;
    }
}