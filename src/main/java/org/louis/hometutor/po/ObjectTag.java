package org.louis.hometutor.po;

import java.util.Date;

public class ObjectTag {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column object_tag.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column object_tag.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column object_tag.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column object_tag.objectId
     *
     * @mbggenerated
     */
    private Long objectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column object_tag.objectType
     *
     * @mbggenerated
     */
    private Integer objectType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column object_tag.tagName
     *
     * @mbggenerated
     */
    private String tagName;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tag
     *
     * @mbggenerated
     */
    public ObjectTag(Long id, Date createTimeStamp, Date updateTimeStamp, Long objectId, Integer objectType, String tagName) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.objectId = objectId;
        this.objectType = objectType;
        this.tagName = tagName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column object_tag.id
     *
     * @return the value of object_tag.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column object_tag.createTimeStamp
     *
     * @return the value of object_tag.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column object_tag.updateTimeStamp
     *
     * @return the value of object_tag.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column object_tag.objectId
     *
     * @return the value of object_tag.objectId
     *
     * @mbggenerated
     */
    public Long getObjectId() {
        return objectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column object_tag.objectType
     *
     * @return the value of object_tag.objectType
     *
     * @mbggenerated
     */
    public Integer getObjectType() {
        return objectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column object_tag.tagName
     *
     * @return the value of object_tag.tagName
     *
     * @mbggenerated
     */
    public String getTagName() {
        return tagName;
    }
}