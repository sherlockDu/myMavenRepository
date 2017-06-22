package org.louis.hometutor.po;

import java.util.Date;

public class BannerResource {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.creatorId
     *
     * @mbggenerated
     */
    private Long creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.updatorId
     *
     * @mbggenerated
     */
    private Long updatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.updator
     *
     * @mbggenerated
     */
    private String updator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.bannerId
     *
     * @mbggenerated
     */
    private Long bannerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.resourceUrl
     *
     * @mbggenerated
     */
    private String resourceUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.pointUrl
     *
     * @mbggenerated
     */
    private String pointUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.sort
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner_resource.isShow
     *
     * @mbggenerated
     */
    private Boolean isShow;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    public BannerResource(Long id, Date createTimeStamp, Date updateTimeStamp, Long creatorId, Long updatorId, String creator, String updator, Long bannerId, String resourceUrl, String pointUrl, Integer sort, Boolean isShow) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.creatorId = creatorId;
        this.updatorId = updatorId;
        this.creator = creator;
        this.updator = updator;
        this.bannerId = bannerId;
        this.resourceUrl = resourceUrl;
        this.pointUrl = pointUrl;
        this.sort = sort;
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.id
     *
     * @return the value of banner_resource.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.createTimeStamp
     *
     * @return the value of banner_resource.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.updateTimeStamp
     *
     * @return the value of banner_resource.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.creatorId
     *
     * @return the value of banner_resource.creatorId
     *
     * @mbggenerated
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.updatorId
     *
     * @return the value of banner_resource.updatorId
     *
     * @mbggenerated
     */
    public Long getUpdatorId() {
        return updatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.creator
     *
     * @return the value of banner_resource.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.updator
     *
     * @return the value of banner_resource.updator
     *
     * @mbggenerated
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.bannerId
     *
     * @return the value of banner_resource.bannerId
     *
     * @mbggenerated
     */
    public Long getBannerId() {
        return bannerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.resourceUrl
     *
     * @return the value of banner_resource.resourceUrl
     *
     * @mbggenerated
     */
    public String getResourceUrl() {
        return resourceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.pointUrl
     *
     * @return the value of banner_resource.pointUrl
     *
     * @mbggenerated
     */
    public String getPointUrl() {
        return pointUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.sort
     *
     * @return the value of banner_resource.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner_resource.isShow
     *
     * @return the value of banner_resource.isShow
     *
     * @mbggenerated
     */
    public Boolean getIsShow() {
        return isShow;
    }
}