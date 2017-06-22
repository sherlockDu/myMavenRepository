package org.louis.hometutor.po;

import java.util.Date;

public class LoginUserToken {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_user_token.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_user_token.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_user_token.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_user_token.token
     *
     * @mbggenerated
     */
    private String token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_user_token.userId
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_user_token.userType
     *
     * @mbggenerated
     */
    private Integer userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_user_token.logoutTimeStamp
     *
     * @mbggenerated
     */
    private Date logoutTimeStamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_user_token
     *
     * @mbggenerated
     */
    public LoginUserToken(Long id, Date createTimeStamp, Date updateTimeStamp, String token, Long userId, Integer userType, Date logoutTimeStamp) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.token = token;
        this.userId = userId;
        this.userType = userType;
        this.logoutTimeStamp = logoutTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_user_token.id
     *
     * @return the value of login_user_token.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_user_token.createTimeStamp
     *
     * @return the value of login_user_token.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_user_token.updateTimeStamp
     *
     * @return the value of login_user_token.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_user_token.token
     *
     * @return the value of login_user_token.token
     *
     * @mbggenerated
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_user_token.userId
     *
     * @return the value of login_user_token.userId
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_user_token.userType
     *
     * @return the value of login_user_token.userType
     *
     * @mbggenerated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_user_token.logoutTimeStamp
     *
     * @return the value of login_user_token.logoutTimeStamp
     *
     * @mbggenerated
     */
    public Date getLogoutTimeStamp() {
        return logoutTimeStamp;
    }
}