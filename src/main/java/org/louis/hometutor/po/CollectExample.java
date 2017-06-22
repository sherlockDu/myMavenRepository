package org.louis.hometutor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table collect
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table collect
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table collect
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    public CollectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
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
     * This method corresponds to the database table collect
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
     * This method corresponds to the database table collect
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
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
     * This class corresponds to the database table collect
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

        public Criteria andCollectorIdIsNull() {
            addCriterion("\"collectorId\" is null");
            return (Criteria) this;
        }

        public Criteria andCollectorIdIsNotNull() {
            addCriterion("\"collectorId\" is not null");
            return (Criteria) this;
        }

        public Criteria andCollectorIdEqualTo(Long value) {
            addCriterion("\"collectorId\" =", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdNotEqualTo(Long value) {
            addCriterion("\"collectorId\" <>", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdGreaterThan(Long value) {
            addCriterion("\"collectorId\" >", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"collectorId\" >=", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdLessThan(Long value) {
            addCriterion("\"collectorId\" <", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdLessThanOrEqualTo(Long value) {
            addCriterion("\"collectorId\" <=", value, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdIn(List<Long> values) {
            addCriterion("\"collectorId\" in", values, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdNotIn(List<Long> values) {
            addCriterion("\"collectorId\" not in", values, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdBetween(Long value1, Long value2) {
            addCriterion("\"collectorId\" between", value1, value2, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorIdNotBetween(Long value1, Long value2) {
            addCriterion("\"collectorId\" not between", value1, value2, "collectorId");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeIsNull() {
            addCriterion("\"collectorType\" is null");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeIsNotNull() {
            addCriterion("\"collectorType\" is not null");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeEqualTo(Integer value) {
            addCriterion("\"collectorType\" =", value, "collectorType");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeNotEqualTo(Integer value) {
            addCriterion("\"collectorType\" <>", value, "collectorType");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeGreaterThan(Integer value) {
            addCriterion("\"collectorType\" >", value, "collectorType");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"collectorType\" >=", value, "collectorType");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeLessThan(Integer value) {
            addCriterion("\"collectorType\" <", value, "collectorType");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"collectorType\" <=", value, "collectorType");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeIn(List<Integer> values) {
            addCriterion("\"collectorType\" in", values, "collectorType");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeNotIn(List<Integer> values) {
            addCriterion("\"collectorType\" not in", values, "collectorType");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"collectorType\" between", value1, value2, "collectorType");
            return (Criteria) this;
        }

        public Criteria andCollectorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"collectorType\" not between", value1, value2, "collectorType");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdIsNull() {
            addCriterion("\"collectObjectId\" is null");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdIsNotNull() {
            addCriterion("\"collectObjectId\" is not null");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdEqualTo(Long value) {
            addCriterion("\"collectObjectId\" =", value, "collectObjectId");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdNotEqualTo(Long value) {
            addCriterion("\"collectObjectId\" <>", value, "collectObjectId");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdGreaterThan(Long value) {
            addCriterion("\"collectObjectId\" >", value, "collectObjectId");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"collectObjectId\" >=", value, "collectObjectId");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdLessThan(Long value) {
            addCriterion("\"collectObjectId\" <", value, "collectObjectId");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdLessThanOrEqualTo(Long value) {
            addCriterion("\"collectObjectId\" <=", value, "collectObjectId");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdIn(List<Long> values) {
            addCriterion("\"collectObjectId\" in", values, "collectObjectId");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdNotIn(List<Long> values) {
            addCriterion("\"collectObjectId\" not in", values, "collectObjectId");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdBetween(Long value1, Long value2) {
            addCriterion("\"collectObjectId\" between", value1, value2, "collectObjectId");
            return (Criteria) this;
        }

        public Criteria andCollectObjectIdNotBetween(Long value1, Long value2) {
            addCriterion("\"collectObjectId\" not between", value1, value2, "collectObjectId");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeIsNull() {
            addCriterion("\"collectObjectType\" is null");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeIsNotNull() {
            addCriterion("\"collectObjectType\" is not null");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeEqualTo(Integer value) {
            addCriterion("\"collectObjectType\" =", value, "collectObjectType");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeNotEqualTo(Integer value) {
            addCriterion("\"collectObjectType\" <>", value, "collectObjectType");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeGreaterThan(Integer value) {
            addCriterion("\"collectObjectType\" >", value, "collectObjectType");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"collectObjectType\" >=", value, "collectObjectType");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeLessThan(Integer value) {
            addCriterion("\"collectObjectType\" <", value, "collectObjectType");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"collectObjectType\" <=", value, "collectObjectType");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeIn(List<Integer> values) {
            addCriterion("\"collectObjectType\" in", values, "collectObjectType");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeNotIn(List<Integer> values) {
            addCriterion("\"collectObjectType\" not in", values, "collectObjectType");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"collectObjectType\" between", value1, value2, "collectObjectType");
            return (Criteria) this;
        }

        public Criteria andCollectObjectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"collectObjectType\" not between", value1, value2, "collectObjectType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table collect
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
     * This class corresponds to the database table collect
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