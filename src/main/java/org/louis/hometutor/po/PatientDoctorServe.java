package org.louis.hometutor.po;

import java.util.Date;

public class PatientDoctorServe {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_doctor_serve.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_doctor_serve.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_doctor_serve.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_doctor_serve.beginTimeStamp
     *
     * @mbggenerated
     */
    private Date beginTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_doctor_serve.endTimeStamp
     *
     * @mbggenerated
     */
    private Date endTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_doctor_serve.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_doctor_serve.restCount
     *
     * @mbggenerated
     */
    private Integer restCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_doctor_serve.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column patient_doctor_serve.patientDoctorId
     *
     * @mbggenerated
     */
    private Long patientDoctorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public PatientDoctorServe(Long id, Date createTimeStamp, Date updateTimeStamp, Date beginTimeStamp, Date endTimeStamp, Integer type, Integer restCount, Integer status, Long patientDoctorId) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.beginTimeStamp = beginTimeStamp;
        this.endTimeStamp = endTimeStamp;
        this.type = type;
        this.restCount = restCount;
        this.status = status;
        this.patientDoctorId = patientDoctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_doctor_serve.id
     *
     * @return the value of patient_doctor_serve.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_doctor_serve.createTimeStamp
     *
     * @return the value of patient_doctor_serve.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_doctor_serve.updateTimeStamp
     *
     * @return the value of patient_doctor_serve.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_doctor_serve.beginTimeStamp
     *
     * @return the value of patient_doctor_serve.beginTimeStamp
     *
     * @mbggenerated
     */
    public Date getBeginTimeStamp() {
        return beginTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_doctor_serve.endTimeStamp
     *
     * @return the value of patient_doctor_serve.endTimeStamp
     *
     * @mbggenerated
     */
    public Date getEndTimeStamp() {
        return endTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_doctor_serve.type
     *
     * @return the value of patient_doctor_serve.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_doctor_serve.restCount
     *
     * @return the value of patient_doctor_serve.restCount
     *
     * @mbggenerated
     */
    public Integer getRestCount() {
        return restCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_doctor_serve.status
     *
     * @return the value of patient_doctor_serve.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column patient_doctor_serve.patientDoctorId
     *
     * @return the value of patient_doctor_serve.patientDoctorId
     *
     * @mbggenerated
     */
    public Long getPatientDoctorId() {
        return patientDoctorId;
    }
}