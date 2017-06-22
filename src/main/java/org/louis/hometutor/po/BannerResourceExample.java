package org.louis.hometutor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BannerResourceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    public BannerResourceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
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
     * This method corresponds to the database table banner_resource
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
     * This method corresponds to the database table banner_resource
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner_resource
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
     * This class corresponds to the database table banner_resource
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

        public Criteria andCreatorIdIsNull() {
            addCriterion("\"creatorId\" is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("\"creatorId\" is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("\"creatorId\" =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("\"creatorId\" <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("\"creatorId\" >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"creatorId\" >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("\"creatorId\" <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("\"creatorId\" <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("\"creatorId\" in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("\"creatorId\" not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("\"creatorId\" between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("\"creatorId\" not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdIsNull() {
            addCriterion("\"updatorId\" is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdIsNotNull() {
            addCriterion("\"updatorId\" is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdEqualTo(Long value) {
            addCriterion("\"updatorId\" =", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdNotEqualTo(Long value) {
            addCriterion("\"updatorId\" <>", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdGreaterThan(Long value) {
            addCriterion("\"updatorId\" >", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"updatorId\" >=", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdLessThan(Long value) {
            addCriterion("\"updatorId\" <", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdLessThanOrEqualTo(Long value) {
            addCriterion("\"updatorId\" <=", value, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdIn(List<Long> values) {
            addCriterion("\"updatorId\" in", values, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdNotIn(List<Long> values) {
            addCriterion("\"updatorId\" not in", values, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdBetween(Long value1, Long value2) {
            addCriterion("\"updatorId\" between", value1, value2, "updatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatorIdNotBetween(Long value1, Long value2) {
            addCriterion("\"updatorId\" not between", value1, value2, "updatorId");
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

        public Criteria andBannerIdIsNull() {
            addCriterion("\"bannerId\" is null");
            return (Criteria) this;
        }

        public Criteria andBannerIdIsNotNull() {
            addCriterion("\"bannerId\" is not null");
            return (Criteria) this;
        }

        public Criteria andBannerIdEqualTo(Long value) {
            addCriterion("\"bannerId\" =", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotEqualTo(Long value) {
            addCriterion("\"bannerId\" <>", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThan(Long value) {
            addCriterion("\"bannerId\" >", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"bannerId\" >=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThan(Long value) {
            addCriterion("\"bannerId\" <", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdLessThanOrEqualTo(Long value) {
            addCriterion("\"bannerId\" <=", value, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdIn(List<Long> values) {
            addCriterion("\"bannerId\" in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotIn(List<Long> values) {
            addCriterion("\"bannerId\" not in", values, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdBetween(Long value1, Long value2) {
            addCriterion("\"bannerId\" between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andBannerIdNotBetween(Long value1, Long value2) {
            addCriterion("\"bannerId\" not between", value1, value2, "bannerId");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIsNull() {
            addCriterion("\"resourceUrl\" is null");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIsNotNull() {
            addCriterion("\"resourceUrl\" is not null");
            return (Criteria) this;
        }

        public Criteria andResourceUrlEqualTo(String value) {
            addCriterion("\"resourceUrl\" =", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotEqualTo(String value) {
            addCriterion("\"resourceUrl\" <>", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlGreaterThan(String value) {
            addCriterion("\"resourceUrl\" >", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("\"resourceUrl\" >=", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLessThan(String value) {
            addCriterion("\"resourceUrl\" <", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLessThanOrEqualTo(String value) {
            addCriterion("\"resourceUrl\" <=", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLike(String value) {
            addCriterion("\"resourceUrl\" like", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotLike(String value) {
            addCriterion("\"resourceUrl\" not like", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIn(List<String> values) {
            addCriterion("\"resourceUrl\" in", values, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotIn(List<String> values) {
            addCriterion("\"resourceUrl\" not in", values, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlBetween(String value1, String value2) {
            addCriterion("\"resourceUrl\" between", value1, value2, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotBetween(String value1, String value2) {
            addCriterion("\"resourceUrl\" not between", value1, value2, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlIsNull() {
            addCriterion("\"pointUrl\" is null");
            return (Criteria) this;
        }

        public Criteria andPointUrlIsNotNull() {
            addCriterion("\"pointUrl\" is not null");
            return (Criteria) this;
        }

        public Criteria andPointUrlEqualTo(String value) {
            addCriterion("\"pointUrl\" =", value, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlNotEqualTo(String value) {
            addCriterion("\"pointUrl\" <>", value, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlGreaterThan(String value) {
            addCriterion("\"pointUrl\" >", value, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlGreaterThanOrEqualTo(String value) {
            addCriterion("\"pointUrl\" >=", value, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlLessThan(String value) {
            addCriterion("\"pointUrl\" <", value, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlLessThanOrEqualTo(String value) {
            addCriterion("\"pointUrl\" <=", value, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlLike(String value) {
            addCriterion("\"pointUrl\" like", value, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlNotLike(String value) {
            addCriterion("\"pointUrl\" not like", value, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlIn(List<String> values) {
            addCriterion("\"pointUrl\" in", values, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlNotIn(List<String> values) {
            addCriterion("\"pointUrl\" not in", values, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlBetween(String value1, String value2) {
            addCriterion("\"pointUrl\" between", value1, value2, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andPointUrlNotBetween(String value1, String value2) {
            addCriterion("\"pointUrl\" not between", value1, value2, "pointUrl");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("\"sort\" is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("\"sort\" is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("\"sort\" =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("\"sort\" <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("\"sort\" >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"sort\" >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("\"sort\" <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("\"sort\" <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("\"sort\" in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("\"sort\" not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("\"sort\" between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("\"sort\" not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("\"isShow\" is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("\"isShow\" is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Boolean value) {
            addCriterion("\"isShow\" =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Boolean value) {
            addCriterion("\"isShow\" <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Boolean value) {
            addCriterion("\"isShow\" >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("\"isShow\" >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Boolean value) {
            addCriterion("\"isShow\" <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Boolean value) {
            addCriterion("\"isShow\" <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Boolean> values) {
            addCriterion("\"isShow\" in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Boolean> values) {
            addCriterion("\"isShow\" not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Boolean value1, Boolean value2) {
            addCriterion("\"isShow\" between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("\"isShow\" not between", value1, value2, "isShow");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table banner_resource
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
     * This class corresponds to the database table banner_resource
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