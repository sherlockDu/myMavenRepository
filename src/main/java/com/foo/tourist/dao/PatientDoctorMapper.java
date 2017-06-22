package com.foo.tourist.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.louis.hometutor.po.PatientDoctor;
import org.louis.hometutor.po.PatientDoctorExample;

public interface PatientDoctorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor
     *
     * @mbggenerated
     */
    @SelectProvider(type=PatientDoctorSqlProvider.class, method="countByExample")
    int countByExample(PatientDoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor
     *
     * @mbggenerated
     */
    @SelectProvider(type=PatientDoctorSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="patientId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="doctorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="patientName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sex", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="birthday", javaType=Date.class, jdbcType=JdbcType.DATE),
        @Arg(column="note", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="outPatientNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="inPatientNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="fileNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bedNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="idCode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="firstLetter", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<PatientDoctor> selectByExample(PatientDoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "\"id\", \"createTimeStamp\", \"updateTimeStamp\", \"patientId\", \"doctorId\", ",
        "\"status\", \"patientName\", \"sex\", \"birthday\", \"note\", \"outPatientNo\", ",
        "\"inPatientNo\", \"fileNo\", \"bedNo\", \"idCode\", \"firstLetter\"",
        "from \"patient_doctor\"",
        "where \"id\" = #{id,jdbcType=BIGINT}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="createTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="updateTimeStamp", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="patientId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="doctorId", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="status", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="patientName", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="sex", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="birthday", javaType=Date.class, jdbcType=JdbcType.DATE),
        @Arg(column="note", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="outPatientNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="inPatientNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="fileNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="bedNo", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="idCode", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="firstLetter", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    PatientDoctor selectByPrimaryKey(Long id);
}