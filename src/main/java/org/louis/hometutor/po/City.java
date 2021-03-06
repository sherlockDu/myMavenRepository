package org.louis.hometutor.po;

import java.util.Date;

public class City {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.createTimeStamp
     *
     * @mbggenerated
     */
    private Date createTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.updateTimeStamp
     *
     * @mbggenerated
     */
    private Date updateTimeStamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.provinceId
     *
     * @mbggenerated
     */
    private Long provinceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cityCode
     *
     * @mbggenerated
     */
    private String cityCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbggenerated
     */
    public City(Long id, Date createTimeStamp, Date updateTimeStamp, String name, Long provinceId, String cityCode) {
        this.id = id;
        this.createTimeStamp = createTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
        this.name = name;
        this.provinceId = provinceId;
        this.cityCode = cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.id
     *
     * @return the value of city.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.createTimeStamp
     *
     * @return the value of city.createTimeStamp
     *
     * @mbggenerated
     */
    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.updateTimeStamp
     *
     * @return the value of city.updateTimeStamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.name
     *
     * @return the value of city.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.provinceId
     *
     * @return the value of city.provinceId
     *
     * @mbggenerated
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cityCode
     *
     * @return the value of city.cityCode
     *
     * @mbggenerated
     */
    public String getCityCode() {
        return cityCode;
    }
}