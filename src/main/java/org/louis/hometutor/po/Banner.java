package org.louis.hometutor.po;

import java.util.Date;

public class Banner {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.creatorId
     *
     * @mbggenerated
     */
    private Long creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.updatorId
     *
     * @mbggenerated
     */
    private Long updatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.updator
     *
     * @mbggenerated
     */
    private String updator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.bannerType
     *
     * @mbggenerated
     */
    private Integer bannerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.bannerDesc
     *
     * @mbggenerated
     */
    private String bannerDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated
     */
    public Banner(Long id, Date createTimeStamp, Date updateTimeStamp, Long creatorId, Long updatorId, String creator, String updator, Integer bannerType, String bannerDesc) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.creatorId = creatorId;
        this.updatorId = updatorId;
        this.creator = creator;
        this.updator = updator;
        this.bannerType = bannerType;
        this.bannerDesc = bannerDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.id
     *
     * @return the value of banner.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.createTimeStamp
     *
     * @return the value of banner.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.updateTimeStamp
     *
     * @return the value of banner.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.creatorId
     *
     * @return the value of banner.creatorId
     *
     * @mbggenerated
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.updatorId
     *
     * @return the value of banner.updatorId
     *
     * @mbggenerated
     */
    public Long getUpdatorId() {
        return updatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.creator
     *
     * @return the value of banner.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.updator
     *
     * @return the value of banner.updator
     *
     * @mbggenerated
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.bannerType
     *
     * @return the value of banner.bannerType
     *
     * @mbggenerated
     */
    public Integer getBannerType() {
        return bannerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.bannerDesc
     *
     * @return the value of banner.bannerDesc
     *
     * @mbggenerated
     */
    public String getBannerDesc() {
        return bannerDesc;
    }
}