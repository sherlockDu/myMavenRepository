package org.louis.hometutor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table payment
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table payment
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table payment
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated
     */
    public PaymentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
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
     * This method corresponds to the database table payment
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
     * This method corresponds to the database table payment
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
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
     * This class corresponds to the database table payment
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

        public Criteria andOrderIdIsNull() {
            addCriterion("\"orderId\" is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("\"orderId\" is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("\"orderId\" =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("\"orderId\" <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("\"orderId\" >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"orderId\" >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("\"orderId\" <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("\"orderId\" <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("\"orderId\" in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("\"orderId\" not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("\"orderId\" between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("\"orderId\" not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("\"orderType\" is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("\"orderType\" is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("\"orderType\" =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("\"orderType\" <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("\"orderType\" >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"orderType\" >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("\"orderType\" <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"orderType\" <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("\"orderType\" in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("\"orderType\" not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"orderType\" between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"orderType\" not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampIsNull() {
            addCriterion("\"payTimeStamp\" is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampIsNotNull() {
            addCriterion("\"payTimeStamp\" is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampEqualTo(Date value) {
            addCriterion("\"payTimeStamp\" =", value, "payTimeStamp");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampNotEqualTo(Date value) {
            addCriterion("\"payTimeStamp\" <>", value, "payTimeStamp");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampGreaterThan(Date value) {
            addCriterion("\"payTimeStamp\" >", value, "payTimeStamp");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampGreaterThanOrEqualTo(Date value) {
            addCriterion("\"payTimeStamp\" >=", value, "payTimeStamp");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampLessThan(Date value) {
            addCriterion("\"payTimeStamp\" <", value, "payTimeStamp");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampLessThanOrEqualTo(Date value) {
            addCriterion("\"payTimeStamp\" <=", value, "payTimeStamp");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampIn(List<Date> values) {
            addCriterion("\"payTimeStamp\" in", values, "payTimeStamp");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampNotIn(List<Date> values) {
            addCriterion("\"payTimeStamp\" not in", values, "payTimeStamp");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampBetween(Date value1, Date value2) {
            addCriterion("\"payTimeStamp\" between", value1, value2, "payTimeStamp");
            return (Criteria) this;
        }

        public Criteria andPayTimeStampNotBetween(Date value1, Date value2) {
            addCriterion("\"payTimeStamp\" not between", value1, value2, "payTimeStamp");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("\"fee\" is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("\"fee\" is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(Long value) {
            addCriterion("\"fee\" =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(Long value) {
            addCriterion("\"fee\" <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(Long value) {
            addCriterion("\"fee\" >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("\"fee\" >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(Long value) {
            addCriterion("\"fee\" <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(Long value) {
            addCriterion("\"fee\" <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<Long> values) {
            addCriterion("\"fee\" in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<Long> values) {
            addCriterion("\"fee\" not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(Long value1, Long value2) {
            addCriterion("\"fee\" between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(Long value1, Long value2) {
            addCriterion("\"fee\" not between", value1, value2, "fee");
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

        public Criteria andThirdPartyPlateFormIdIsNull() {
            addCriterion("\"thirdPartyPlateFormId\" is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdIsNotNull() {
            addCriterion("\"thirdPartyPlateFormId\" is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdEqualTo(String value) {
            addCriterion("\"thirdPartyPlateFormId\" =", value, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdNotEqualTo(String value) {
            addCriterion("\"thirdPartyPlateFormId\" <>", value, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdGreaterThan(String value) {
            addCriterion("\"thirdPartyPlateFormId\" >", value, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"thirdPartyPlateFormId\" >=", value, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdLessThan(String value) {
            addCriterion("\"thirdPartyPlateFormId\" <", value, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdLessThanOrEqualTo(String value) {
            addCriterion("\"thirdPartyPlateFormId\" <=", value, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdLike(String value) {
            addCriterion("\"thirdPartyPlateFormId\" like", value, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdNotLike(String value) {
            addCriterion("\"thirdPartyPlateFormId\" not like", value, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdIn(List<String> values) {
            addCriterion("\"thirdPartyPlateFormId\" in", values, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdNotIn(List<String> values) {
            addCriterion("\"thirdPartyPlateFormId\" not in", values, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdBetween(String value1, String value2) {
            addCriterion("\"thirdPartyPlateFormId\" between", value1, value2, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormIdNotBetween(String value1, String value2) {
            addCriterion("\"thirdPartyPlateFormId\" not between", value1, value2, "thirdPartyPlateFormId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("\"orderNo\" is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("\"orderNo\" is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("\"orderNo\" =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("\"orderNo\" <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("\"orderNo\" >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("\"orderNo\" >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("\"orderNo\" <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("\"orderNo\" <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("\"orderNo\" like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("\"orderNo\" not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("\"orderNo\" in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("\"orderNo\" not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("\"orderNo\" between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("\"orderNo\" not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdIsNull() {
            addCriterion("\"thirdPartyPlateFormPrepayId\" is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdIsNotNull() {
            addCriterion("\"thirdPartyPlateFormPrepayId\" is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdEqualTo(String value) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" =", value, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdNotEqualTo(String value) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" <>", value, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdGreaterThan(String value) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" >", value, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdGreaterThanOrEqualTo(String value) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" >=", value, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdLessThan(String value) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" <", value, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdLessThanOrEqualTo(String value) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" <=", value, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdLike(String value) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" like", value, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdNotLike(String value) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" not like", value, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdIn(List<String> values) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" in", values, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdNotIn(List<String> values) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" not in", values, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdBetween(String value1, String value2) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" between", value1, value2, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyPlateFormPrepayIdNotBetween(String value1, String value2) {
            addCriterion("\"thirdPartyPlateFormPrepayId\" not between", value1, value2, "thirdPartyPlateFormPrepayId");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNull() {
            addCriterion("\"paymentNo\" is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNotNull() {
            addCriterion("\"paymentNo\" is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoEqualTo(String value) {
            addCriterion("\"paymentNo\" =", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotEqualTo(String value) {
            addCriterion("\"paymentNo\" <>", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThan(String value) {
            addCriterion("\"paymentNo\" >", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("\"paymentNo\" >=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThan(String value) {
            addCriterion("\"paymentNo\" <", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("\"paymentNo\" <=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLike(String value) {
            addCriterion("\"paymentNo\" like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotLike(String value) {
            addCriterion("\"paymentNo\" not like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIn(List<String> values) {
            addCriterion("\"paymentNo\" in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotIn(List<String> values) {
            addCriterion("\"paymentNo\" not in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoBetween(String value1, String value2) {
            addCriterion("\"paymentNo\" between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotBetween(String value1, String value2) {
            addCriterion("\"paymentNo\" not between", value1, value2, "paymentNo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table payment
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
     * This class corresponds to the database table payment
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