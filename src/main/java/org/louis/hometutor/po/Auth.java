package org.louis.hometutor.po;

import java.util.Date;

public class Auth {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.text
     *
     * @mbggenerated
     */
    private String text;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.key
     *
     * @mbggenerated
     */
    private String key;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.sort
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.enable
     *
     * @mbggenerated
     */
    private Boolean enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.desc
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.parentAuthId
     *
     * @mbggenerated
     */
    private Long parentAuthId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.keypath
     *
     * @mbggenerated
     */
    private String keypath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.isdel
     *
     * @mbggenerated
     */
    private Boolean isdel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.updatorId
     *
     * @mbggenerated
     */
    private Long updatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth.creatorId
     *
     * @mbggenerated
     */
    private Long creatorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbggenerated
     */
    public Auth(Long id, Date createTimeStamp, Date updateTimeStamp, String text, String key, Integer type, String url, Integer sort, Boolean enable, String desc, Long parentAuthId, String keypath, Boolean isdel, Long updatorId, Long creatorId) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.text = text;
        this.key = key;
        this.type = type;
        this.url = url;
        this.sort = sort;
        this.enable = enable;
        this.desc = desc;
        this.parentAuthId = parentAuthId;
        this.keypath = keypath;
        this.isdel = isdel;
        this.updatorId = updatorId;
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.id
     *
     * @return the value of auth.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.createTimeStamp
     *
     * @return the value of auth.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.updateTimeStamp
     *
     * @return the value of auth.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.text
     *
     * @return the value of auth.text
     *
     * @mbggenerated
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.key
     *
     * @return the value of auth.key
     *
     * @mbggenerated
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.type
     *
     * @return the value of auth.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.url
     *
     * @return the value of auth.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.sort
     *
     * @return the value of auth.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.enable
     *
     * @return the value of auth.enable
     *
     * @mbggenerated
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.desc
     *
     * @return the value of auth.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.parentAuthId
     *
     * @return the value of auth.parentAuthId
     *
     * @mbggenerated
     */
    public Long getParentAuthId() {
        return parentAuthId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.keypath
     *
     * @return the value of auth.keypath
     *
     * @mbggenerated
     */
    public String getKeypath() {
        return keypath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.isdel
     *
     * @return the value of auth.isdel
     *
     * @mbggenerated
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.updatorId
     *
     * @return the value of auth.updatorId
     *
     * @mbggenerated
     */
    public Long getUpdatorId() {
        return updatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth.creatorId
     *
     * @return the value of auth.creatorId
     *
     * @mbggenerated
     */
    public Long getCreatorId() {
        return creatorId;
    }
}