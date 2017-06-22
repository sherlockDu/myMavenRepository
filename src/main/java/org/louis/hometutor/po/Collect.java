package org.louis.hometutor.po;

import java.util.Date;

public class Collect {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.collectorId
     *
     * @mbggenerated
     */
    private Long collectorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.collectorType
     *
     * @mbggenerated
     */
    private Integer collectorType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.collectObjectId
     *
     * @mbggenerated
     */
    private Long collectObjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.collectObjectType
     *
     * @mbggenerated
     */
    private Integer collectObjectType;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    public Collect(Long id, Date createTimeStamp, Date updateTimeStamp, Long collectorId, Integer collectorType, Long collectObjectId, Integer collectObjectType) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.collectorId = collectorId;
        this.collectorType = collectorType;
        this.collectObjectId = collectObjectId;
        this.collectObjectType = collectObjectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.id
     *
     * @return the value of collect.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.createTimeStamp
     *
     * @return the value of collect.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.updateTimeStamp
     *
     * @return the value of collect.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.collectorId
     *
     * @return the value of collect.collectorId
     *
     * @mbggenerated
     */
    public Long getCollectorId() {
        return collectorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.collectorType
     *
     * @return the value of collect.collectorType
     *
     * @mbggenerated
     */
    public Integer getCollectorType() {
        return collectorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.collectObjectId
     *
     * @return the value of collect.collectObjectId
     *
     * @mbggenerated
     */
    public Long getCollectObjectId() {
        return collectObjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.collectObjectType
     *
     * @return the value of collect.collectObjectType
     *
     * @mbggenerated
     */
    public Integer getCollectObjectType() {
        return collectObjectType;
    }
}