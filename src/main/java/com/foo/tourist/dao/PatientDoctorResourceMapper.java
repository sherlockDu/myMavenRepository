package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.PatientDoctorResource;
import org.louis.hometutor.po.PatientDoctorResourceExample;

public interface PatientDoctorResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_resource
     *
     * @mbggenerated
     */
    @SelectProvider(type=PatientDoctorResourceSqlProvider.class, method="countByExample")
    int countByExample(PatientDoctorResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_resource
     *
     * @mbggenerated
     */
    @SelectProvider(type=PatientDoctorResourceSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="patientDoctorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resourceUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<PatientDoctorResource> selectByExample(PatientDoctorResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_resource
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"patientDoctorId\", \"resourceUrl\"",
        "from \"patient_doctor_resource\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="patientDoctorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="resourceUrl", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    PatientDoctorResource selectByPrimaryKey(Long id);
}