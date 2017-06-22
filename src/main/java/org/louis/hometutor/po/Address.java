package org.louis.hometutor.po;

import java.util.Date;

public class Address {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.ownerId
     *
     * @mbggenerated
     */
    private Long ownerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.ownerType
     *
     * @mbggenerated
     */
    private Integer ownerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.detailAddress
     *
     * @mbggenerated
     */
    private String detailAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.province
     *
     * @mbggenerated
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.zone
     *
     * @mbggenerated
     */
    private String zone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.provinceId
     *
     * @mbggenerated
     */
    private Long provinceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.cityId
     *
     * @mbggenerated
     */
    private Long cityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.zoneId
     *
     * @mbggenerated
     */
    private Long zoneId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.receiverName
     *
     * @mbggenerated
     */
    private String receiverName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.receiverContact
     *
     * @mbggenerated
     */
    private String receiverContact;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated
     */
    public Address(Long id, Date createTimeStamp, Date updateTimeStamp, Long ownerId, Integer ownerType, String detailAddress, String province, String city, String zone, Long provinceId, Long cityId, Long zoneId, String receiverName, String receiverContact) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.ownerId = ownerId;
        this.ownerType = ownerType;
        this.detailAddress = detailAddress;
        this.province = province;
        this.city = city;
        this.zone = zone;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.zoneId = zoneId;
        this.receiverName = receiverName;
        this.receiverContact = receiverContact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.id
     *
     * @return the value of address.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.createTimeStamp
     *
     * @return the value of address.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.updateTimeStamp
     *
     * @return the value of address.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.ownerId
     *
     * @return the value of address.ownerId
     *
     * @mbggenerated
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.ownerType
     *
     * @return the value of address.ownerType
     *
     * @mbggenerated
     */
    public Integer getOwnerType() {
        return ownerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.detailAddress
     *
     * @return the value of address.detailAddress
     *
     * @mbggenerated
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.province
     *
     * @return the value of address.province
     *
     * @mbggenerated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.city
     *
     * @return the value of address.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.zone
     *
     * @return the value of address.zone
     *
     * @mbggenerated
     */
    public String getZone() {
        return zone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.provinceId
     *
     * @return the value of address.provinceId
     *
     * @mbggenerated
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.cityId
     *
     * @return the value of address.cityId
     *
     * @mbggenerated
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.zoneId
     *
     * @return the value of address.zoneId
     *
     * @mbggenerated
     */
    public Long getZoneId() {
        return zoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.receiverName
     *
     * @return the value of address.receiverName
     *
     * @mbggenerated
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.receiverContact
     *
     * @return the value of address.receiverContact
     *
     * @mbggenerated
     */
    public String getReceiverContact() {
        return receiverContact;
    }
}