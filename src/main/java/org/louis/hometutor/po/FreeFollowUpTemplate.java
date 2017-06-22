package org.louis.hometutor.po;

import java.util.Date;

public class FreeFollowUpTemplate {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column free_follow_up_template.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column free_follow_up_template.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column free_follow_up_template.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column free_follow_up_template.count
     *
     * @mbggenerated
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column free_follow_up_template.docId
     *
     * @mbggenerated
     */
    private Long docId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_follow_up_template
     *
     * @mbggenerated
     */
    public FreeFollowUpTemplate(Long id, Date createTimeStamp, Date updateTimeStamp, Integer count, Long docId) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.count = count;
        this.docId = docId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column free_follow_up_template.id
     *
     * @return the value of free_follow_up_template.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column free_follow_up_template.createTimeStamp
     *
     * @return the value of free_follow_up_template.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column free_follow_up_template.updateTimeStamp
     *
     * @return the value of free_follow_up_template.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column free_follow_up_template.count
     *
     * @return the value of free_follow_up_template.count
     *
     * @mbggenerated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column free_follow_up_template.docId
     *
     * @return the value of free_follow_up_template.docId
     *
     * @mbggenerated
     */
    public Long getDocId() {
        return docId;
    }
}