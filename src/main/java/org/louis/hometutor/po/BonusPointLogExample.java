package org.louis.hometutor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BonusPointLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    public BonusPointLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
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
     * This method corresponds to the database table bonus_point_log
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
     * This method corresponds to the database table bonus_point_log
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bonus_point_log
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
     * This class corresponds to the database table bonus_point_log
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

        public Criteria andCountIsNull() {
            addCriterion("\"count\" is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("\"count\" is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("\"count\" =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("\"count\" <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("\"count\" >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"count\" >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("\"count\" <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("\"count\" <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("\"count\" in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("\"count\" not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("\"count\" between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("\"count\" not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNull() {
            addCriterion("\"targetId\" is null");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNotNull() {
            addCriterion("\"targetId\" is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIdEqualTo(Long value) {
            addCriterion("\"targetId\" =", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotEqualTo(Long value) {
            addCriterion("\"targetId\" <>", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThan(Long value) {
            addCriterion("\"targetId\" >", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"targetId\" >=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThan(Long value) {
            addCriterion("\"targetId\" <", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThanOrEqualTo(Long value) {
            addCriterion("\"targetId\" <=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdIn(List<Long> values) {
            addCriterion("\"targetId\" in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotIn(List<Long> values) {
            addCriterion("\"targetId\" not in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdBetween(Long value1, Long value2) {
            addCriterion("\"targetId\" between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotBetween(Long value1, Long value2) {
            addCriterion("\"targetId\" not between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNull() {
            addCriterion("\"targetType\" is null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNotNull() {
            addCriterion("\"targetType\" is not null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeEqualTo(Integer value) {
            addCriterion("\"targetType\" =", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotEqualTo(Integer value) {
            addCriterion("\"targetType\" <>", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThan(Integer value) {
            addCriterion("\"targetType\" >", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"targetType\" >=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThan(Integer value) {
            addCriterion("\"targetType\" <", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"targetType\" <=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIn(List<Integer> values) {
            addCriterion("\"targetType\" in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotIn(List<Integer> values) {
            addCriterion("\"targetType\" not in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"targetType\" between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"targetType\" not between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("\"reason\" is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("\"reason\" is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("\"reason\" =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("\"reason\" <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("\"reason\" >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("\"reason\" >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("\"reason\" <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("\"reason\" <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("\"reason\" like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("\"reason\" not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("\"reason\" in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("\"reason\" not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("\"reason\" between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("\"reason\" not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("\"remark\" is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("\"remark\" is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("\"remark\" =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("\"remark\" <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("\"remark\" >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("\"remark\" >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("\"remark\" <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("\"remark\" <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("\"remark\" like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("\"remark\" not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("\"remark\" in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("\"remark\" not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("\"remark\" between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("\"remark\" not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bonus_point_log
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
     * This class corresponds to the database table bonus_point_log
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