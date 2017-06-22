package org.louis.hometutor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientDoctorServeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public PatientDoctorServeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("\"id\" is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("\"id\" is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("\"id\" =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("\"id\" <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("\"id\" >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"id\" >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("\"id\" <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("\"id\" <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("\"id\" in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("\"id\" not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("\"id\" between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("\"id\" not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampIsNull() {
            addCriterion("\"createTimeStamp\" is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampIsNotNull() {
            addCriterion("\"createTimeStamp\" is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampEqualTo(Date value) {
            addCriterion("\"createTimeStamp\" =", value, "createTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampNotEqualTo(Date value) {
            addCriterion("\"createTimeStamp\" <>", value, "createTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampGreaterThan(Date value) {
            addCriterion("\"createTimeStamp\" >", value, "createTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampGreaterThanOrEqualTo(Date value) {
            addCriterion("\"createTimeStamp\" >=", value, "createTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampLessThan(Date value) {
            addCriterion("\"createTimeStamp\" <", value, "createTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampLessThanOrEqualTo(Date value) {
            addCriterion("\"createTimeStamp\" <=", value, "createTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampIn(List<Date> values) {
            addCriterion("\"createTimeStamp\" in", values, "createTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampNotIn(List<Date> values) {
            addCriterion("\"createTimeStamp\" not in", values, "createTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampBetween(Date value1, Date value2) {
            addCriterion("\"createTimeStamp\" between", value1, value2, "createTimeStamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStampNotBetween(Date value1, Date value2) {
            addCriterion("\"createTimeStamp\" not between", value1, value2, "createTimeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampIsNull() {
            addCriterion("\"updateTimeStamp\" is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampIsNotNull() {
            addCriterion("\"updateTimeStamp\" is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampEqualTo(Date value) {
            addCriterion("\"updateTimeStamp\" =", value, "updateTimeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampNotEqualTo(Date value) {
            addCriterion("\"updateTimeStamp\" <>", value, "updateTimeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampGreaterThan(Date value) {
            addCriterion("\"updateTimeStamp\" >", value, "updateTimeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampGreaterThanOrEqualTo(Date value) {
            addCriterion("\"updateTimeStamp\" >=", value, "updateTimeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampLessThan(Date value) {
            addCriterion("\"updateTimeStamp\" <", value, "updateTimeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampLessThanOrEqualTo(Date value) {
            addCriterion("\"updateTimeStamp\" <=", value, "updateTimeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampIn(List<Date> values) {
            addCriterion("\"updateTimeStamp\" in", values, "updateTimeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampNotIn(List<Date> values) {
            addCriterion("\"updateTimeStamp\" not in", values, "updateTimeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampBetween(Date value1, Date value2) {
            addCriterion("\"updateTimeStamp\" between", value1, value2, "updateTimeStamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeStampNotBetween(Date value1, Date value2) {
            addCriterion("\"updateTimeStamp\" not between", value1, value2, "updateTimeStamp");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampIsNull() {
            addCriterion("\"beginTimeStamp\" is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampIsNotNull() {
            addCriterion("\"beginTimeStamp\" is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampEqualTo(Date value) {
            addCriterion("\"beginTimeStamp\" =", value, "beginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampNotEqualTo(Date value) {
            addCriterion("\"beginTimeStamp\" <>", value, "beginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampGreaterThan(Date value) {
            addCriterion("\"beginTimeStamp\" >", value, "beginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampGreaterThanOrEqualTo(Date value) {
            addCriterion("\"beginTimeStamp\" >=", value, "beginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampLessThan(Date value) {
            addCriterion("\"beginTimeStamp\" <", value, "beginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampLessThanOrEqualTo(Date value) {
            addCriterion("\"beginTimeStamp\" <=", value, "beginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampIn(List<Date> values) {
            addCriterion("\"beginTimeStamp\" in", values, "beginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampNotIn(List<Date> values) {
            addCriterion("\"beginTimeStamp\" not in", values, "beginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampBetween(Date value1, Date value2) {
            addCriterion("\"beginTimeStamp\" between", value1, value2, "beginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andBeginTimeStampNotBetween(Date value1, Date value2) {
            addCriterion("\"beginTimeStamp\" not between", value1, value2, "beginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampIsNull() {
            addCriterion("\"endTimeStamp\" is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampIsNotNull() {
            addCriterion("\"endTimeStamp\" is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampEqualTo(Date value) {
            addCriterion("\"endTimeStamp\" =", value, "endTimeStamp");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampNotEqualTo(Date value) {
            addCriterion("\"endTimeStamp\" <>", value, "endTimeStamp");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampGreaterThan(Date value) {
            addCriterion("\"endTimeStamp\" >", value, "endTimeStamp");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampGreaterThanOrEqualTo(Date value) {
            addCriterion("\"endTimeStamp\" >=", value, "endTimeStamp");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampLessThan(Date value) {
            addCriterion("\"endTimeStamp\" <", value, "endTimeStamp");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampLessThanOrEqualTo(Date value) {
            addCriterion("\"endTimeStamp\" <=", value, "endTimeStamp");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampIn(List<Date> values) {
            addCriterion("\"endTimeStamp\" in", values, "endTimeStamp");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampNotIn(List<Date> values) {
            addCriterion("\"endTimeStamp\" not in", values, "endTimeStamp");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampBetween(Date value1, Date value2) {
            addCriterion("\"endTimeStamp\" between", value1, value2, "endTimeStamp");
            return (Criteria) this;
        }

        public Criteria andEndTimeStampNotBetween(Date value1, Date value2) {
            addCriterion("\"endTimeStamp\" not between", value1, value2, "endTimeStamp");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("\"type\" is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("\"type\" is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("\"type\" =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("\"type\" <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("\"type\" >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"type\" >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("\"type\" <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"type\" <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("\"type\" in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("\"type\" not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"type\" between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"type\" not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRestCountIsNull() {
            addCriterion("\"restCount\" is null");
            return (Criteria) this;
        }

        public Criteria andRestCountIsNotNull() {
            addCriterion("\"restCount\" is not null");
            return (Criteria) this;
        }

        public Criteria andRestCountEqualTo(Integer value) {
            addCriterion("\"restCount\" =", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountNotEqualTo(Integer value) {
            addCriterion("\"restCount\" <>", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountGreaterThan(Integer value) {
            addCriterion("\"restCount\" >", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"restCount\" >=", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountLessThan(Integer value) {
            addCriterion("\"restCount\" <", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountLessThanOrEqualTo(Integer value) {
            addCriterion("\"restCount\" <=", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountIn(List<Integer> values) {
            addCriterion("\"restCount\" in", values, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountNotIn(List<Integer> values) {
            addCriterion("\"restCount\" not in", values, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountBetween(Integer value1, Integer value2) {
            addCriterion("\"restCount\" between", value1, value2, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountNotBetween(Integer value1, Integer value2) {
            addCriterion("\"restCount\" not between", value1, value2, "restCount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("\"status\" is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("\"status\" is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("\"status\" =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("\"status\" <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("\"status\" >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"status\" >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("\"status\" <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("\"status\" <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("\"status\" in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("\"status\" not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("\"status\" between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("\"status\" not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdIsNull() {
            addCriterion("\"patientDoctorId\" is null");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdIsNotNull() {
            addCriterion("\"patientDoctorId\" is not null");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdEqualTo(Long value) {
            addCriterion("\"patientDoctorId\" =", value, "patientDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdNotEqualTo(Long value) {
            addCriterion("\"patientDoctorId\" <>", value, "patientDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdGreaterThan(Long value) {
            addCriterion("\"patientDoctorId\" >", value, "patientDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"patientDoctorId\" >=", value, "patientDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdLessThan(Long value) {
            addCriterion("\"patientDoctorId\" <", value, "patientDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdLessThanOrEqualTo(Long value) {
            addCriterion("\"patientDoctorId\" <=", value, "patientDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdIn(List<Long> values) {
            addCriterion("\"patientDoctorId\" in", values, "patientDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdNotIn(List<Long> values) {
            addCriterion("\"patientDoctorId\" not in", values, "patientDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdBetween(Long value1, Long value2) {
            addCriterion("\"patientDoctorId\" between", value1, value2, "patientDoctorId");
            return (Criteria) this;
        }

        public Criteria andPatientDoctorIdNotBetween(Long value1, Long value2) {
            addCriterion("\"patientDoctorId\" not between", value1, value2, "patientDoctorId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table patient_doctor_serve
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}