package org.louis.hometutor.po;

import java.util.Date;

public class RoleAuth {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_auth.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_auth.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_auth.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_auth.roleId
     *
     * @mbggenerated
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_auth.authId
     *
     * @mbggenerated
     */
    private Long authId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_auth.isdel
     *
     * @mbggenerated
     */
    private Boolean isdel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_auth.updatorId
     *
     * @mbggenerated
     */
    private Long updatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_auth.creatorId
     *
     * @mbggenerated
     */
    private Long creatorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_auth
     *
     * @mbggenerated
     */
    public RoleAuth(Long id, Date createTimeStamp, Date updateTimeStamp, Long roleId, Long authId, Boolean isdel, Long updatorId, Long creatorId) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.roleId = roleId;
        this.authId = authId;
        this.isdel = isdel;
        this.updatorId = updatorId;
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_auth.id
     *
     * @return the value of role_auth.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_auth.createTimeStamp
     *
     * @return the value of role_auth.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_auth.updateTimeStamp
     *
     * @return the value of role_auth.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_auth.roleId
     *
     * @return the value of role_auth.roleId
     *
     * @mbggenerated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_auth.authId
     *
     * @return the value of role_auth.authId
     *
     * @mbggenerated
     */
    public Long getAuthId() {
        return authId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_auth.isdel
     *
     * @return the value of role_auth.isdel
     *
     * @mbggenerated
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_auth.updatorId
     *
     * @return the value of role_auth.updatorId
     *
     * @mbggenerated
     */
    public Long getUpdatorId() {
        return updatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_auth.creatorId
     *
     * @return the value of role_auth.creatorId
     *
     * @mbggenerated
     */
    public Long getCreatorId() {
        return creatorId;
    }
}