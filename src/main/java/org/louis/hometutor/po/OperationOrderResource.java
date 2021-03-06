package org.louis.hometutor.po;

import java.util.Date;

public class OperationOrderResource {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order_resource.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order_resource.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order_resource.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order_resource.resourceUrl
     *
     * @mbggenerated
     */
    private String resourceUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order_resource.operationOrderId
     *
     * @mbggenerated
     */
    private Long operationOrderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_order_resource
     *
     * @mbggenerated
     */
    public OperationOrderResource(Long id, Date createTimeStamp, Date updateTimeStamp, String resourceUrl, Long operationOrderId) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.resourceUrl = resourceUrl;
        this.operationOrderId = operationOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order_resource.id
     *
     * @return the value of operation_order_resource.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order_resource.createTimeStamp
     *
     * @return the value of operation_order_resource.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order_resource.updateTimeStamp
     *
     * @return the value of operation_order_resource.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order_resource.resourceUrl
     *
     * @return the value of operation_order_resource.resourceUrl
     *
     * @mbggenerated
     */
    public String getResourceUrl() {
        return resourceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order_resource.operationOrderId
     *
     * @return the value of operation_order_resource.operationOrderId
     *
     * @mbggenerated
     */
    public Long getOperationOrderId() {
        return operationOrderId;
    }
}