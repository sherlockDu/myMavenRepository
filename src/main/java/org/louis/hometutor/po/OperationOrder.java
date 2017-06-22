package org.louis.hometutor.po;

import java.util.Date;

public class OperationOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.patientId
     *
     * @mbggenerated
     */
    private Long patientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.doctorName
     *
     * @mbggenerated
     */
    private String doctorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.hospital
     *
     * @mbggenerated
     */
    private String hospital;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.department
     *
     * @mbggenerated
     */
    private String department;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.no
     *
     * @mbggenerated
     */
    private String no;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.fee
     *
     * @mbggenerated
     */
    private Long fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.orderStatus
     *
     * @mbggenerated
     */
    private Integer orderStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.payStatus
     *
     * @mbggenerated
     */
    private Integer payStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.refundStatus
     *
     * @mbggenerated
     */
    private Integer refundStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.diseaseDiagnosis
     *
     * @mbggenerated
     */
    private String diseaseDiagnosis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.desc
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.phoneNo
     *
     * @mbggenerated
     */
    private String phoneNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column operation_order.surgeryPatientName
     *
     * @mbggenerated
     */
    private String surgeryPatientName;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_order
     *
     * @mbggenerated
     */
    public OperationOrder(Long id, Date createTimeStamp, Date updateTimeStamp, Long patientId, String doctorName, String hospital, String department, String no, Long fee, Integer orderStatus, Integer payStatus, Integer refundStatus, String diseaseDiagnosis, String desc, String phoneNo, String surgeryPatientName) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.hospital = hospital;
        this.department = department;
        this.no = no;
        this.fee = fee;
        this.orderStatus = orderStatus;
        this.payStatus = payStatus;
        this.refundStatus = refundStatus;
        this.diseaseDiagnosis = diseaseDiagnosis;
        this.desc = desc;
        this.phoneNo = phoneNo;
        this.surgeryPatientName = surgeryPatientName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.id
     *
     * @return the value of operation_order.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.createTimeStamp
     *
     * @return the value of operation_order.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.updateTimeStamp
     *
     * @return the value of operation_order.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.patientId
     *
     * @return the value of operation_order.patientId
     *
     * @mbggenerated
     */
    public Long getPatientId() {
        return patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.doctorName
     *
     * @return the value of operation_order.doctorName
     *
     * @mbggenerated
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.hospital
     *
     * @return the value of operation_order.hospital
     *
     * @mbggenerated
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.department
     *
     * @return the value of operation_order.department
     *
     * @mbggenerated
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.no
     *
     * @return the value of operation_order.no
     *
     * @mbggenerated
     */
    public String getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.fee
     *
     * @return the value of operation_order.fee
     *
     * @mbggenerated
     */
    public Long getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.orderStatus
     *
     * @return the value of operation_order.orderStatus
     *
     * @mbggenerated
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.payStatus
     *
     * @return the value of operation_order.payStatus
     *
     * @mbggenerated
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.refundStatus
     *
     * @return the value of operation_order.refundStatus
     *
     * @mbggenerated
     */
    public Integer getRefundStatus() {
        return refundStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.diseaseDiagnosis
     *
     * @return the value of operation_order.diseaseDiagnosis
     *
     * @mbggenerated
     */
    public String getDiseaseDiagnosis() {
        return diseaseDiagnosis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.desc
     *
     * @return the value of operation_order.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.phoneNo
     *
     * @return the value of operation_order.phoneNo
     *
     * @mbggenerated
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column operation_order.surgeryPatientName
     *
     * @return the value of operation_order.surgeryPatientName
     *
     * @mbggenerated
     */
    public String getSurgeryPatientName() {
        return surgeryPatientName;
    }
}