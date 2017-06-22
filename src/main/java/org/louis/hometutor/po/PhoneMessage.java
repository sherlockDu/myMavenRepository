package org.louis.hometutor.po;

import java.util.Date;

public class PhoneMessage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_message.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_message.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_message.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_message.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_message.isSend
     *
     * @mbggenerated
     */
    private Boolean isSend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_message.phoneNo
     *
     * @mbggenerated
     */
    private String phoneNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_message.desc
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phone_message
     *
     * @mbggenerated
     */
    public PhoneMessage(Long id, Date createTimeStamp, Date updateTimeStamp, String content, Boolean isSend, String phoneNo, String desc) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.content = content;
        this.isSend = isSend;
        this.phoneNo = phoneNo;
        this.desc = desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_message.id
     *
     * @return the value of phone_message.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_message.createTimeStamp
     *
     * @return the value of phone_message.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_message.updateTimeStamp
     *
     * @return the value of phone_message.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_message.content
     *
     * @return the value of phone_message.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_message.isSend
     *
     * @return the value of phone_message.isSend
     *
     * @mbggenerated
     */
    public Boolean getIsSend() {
        return isSend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_message.phoneNo
     *
     * @return the value of phone_message.phoneNo
     *
     * @mbggenerated
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_message.desc
     *
     * @return the value of phone_message.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }
}