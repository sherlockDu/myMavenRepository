package org.louis.hometutor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerServiceInternalUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    public CustomerServiceInternalUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
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
     * This method corresponds to the database table customer_service_internal_user
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
     * This method corresponds to the database table customer_service_internal_user
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_service_internal_user
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
     * This class corresponds to the database table customer_service_internal_user
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

        public Criteria andUpdatorIsNull() {
            addCriterion("\"updator\" is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNotNull() {
            addCriterion("\"updator\" is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorEqualTo(String value) {
            addCriterion("\"updator\" =", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotEqualTo(String value) {
            addCriterion("\"updator\" <>", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThan(String value) {
            addCriterion("\"updator\" >", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThanOrEqualTo(String value) {
            addCriterion("\"updator\" >=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThan(String value) {
            addCriterion("\"updator\" <", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThanOrEqualTo(String value) {
            addCriterion("\"updator\" <=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLike(String value) {
            addCriterion("\"updator\" like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotLike(String value) {
            addCriterion("\"updator\" not like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIn(List<String> values) {
            addCriterion("\"updator\" in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotIn(List<String> values) {
            addCriterion("\"updator\" not in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorBetween(String value1, String value2) {
            addCriterion("\"updator\" between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotBetween(String value1, String value2) {
            addCriterion("\"updator\" not between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("\"creator\" is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("\"creator\" is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("\"creator\" =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("\"creator\" <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("\"creator\" >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("\"creator\" >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("\"creator\" <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("\"creator\" <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("\"creator\" like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("\"creator\" not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("\"creator\" in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("\"creator\" not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("\"creator\" between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("\"creator\" not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdIsNull() {
            addCriterion("\"internalUserId\" is null");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdIsNotNull() {
            addCriterion("\"internalUserId\" is not null");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdEqualTo(Long value) {
            addCriterion("\"internalUserId\" =", value, "internalUserId");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdNotEqualTo(Long value) {
            addCriterion("\"internalUserId\" <>", value, "internalUserId");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdGreaterThan(Long value) {
            addCriterion("\"internalUserId\" >", value, "internalUserId");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"internalUserId\" >=", value, "internalUserId");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdLessThan(Long value) {
            addCriterion("\"internalUserId\" <", value, "internalUserId");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdLessThanOrEqualTo(Long value) {
            addCriterion("\"internalUserId\" <=", value, "internalUserId");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdIn(List<Long> values) {
            addCriterion("\"internalUserId\" in", values, "internalUserId");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdNotIn(List<Long> values) {
            addCriterion("\"internalUserId\" not in", values, "internalUserId");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdBetween(Long value1, Long value2) {
            addCriterion("\"internalUserId\" between", value1, value2, "internalUserId");
            return (Criteria) this;
        }

        public Criteria andInternalUserIdNotBetween(Long value1, Long value2) {
            addCriterion("\"internalUserId\" not between", value1, value2, "internalUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdIsNull() {
            addCriterion("\"customerServcieId\" is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdIsNotNull() {
            addCriterion("\"customerServcieId\" is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdEqualTo(Long value) {
            addCriterion("\"customerServcieId\" =", value, "customerServcieId");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdNotEqualTo(Long value) {
            addCriterion("\"customerServcieId\" <>", value, "customerServcieId");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdGreaterThan(Long value) {
            addCriterion("\"customerServcieId\" >", value, "customerServcieId");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"customerServcieId\" >=", value, "customerServcieId");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdLessThan(Long value) {
            addCriterion("\"customerServcieId\" <", value, "customerServcieId");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdLessThanOrEqualTo(Long value) {
            addCriterion("\"customerServcieId\" <=", value, "customerServcieId");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdIn(List<Long> values) {
            addCriterion("\"customerServcieId\" in", values, "customerServcieId");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdNotIn(List<Long> values) {
            addCriterion("\"customerServcieId\" not in", values, "customerServcieId");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdBetween(Long value1, Long value2) {
            addCriterion("\"customerServcieId\" between", value1, value2, "customerServcieId");
            return (Criteria) this;
        }

        public Criteria andCustomerServcieIdNotBetween(Long value1, Long value2) {
            addCriterion("\"customerServcieId\" not between", value1, value2, "customerServcieId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_service_internal_user
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
     * This class corresponds to the database table customer_service_internal_user
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