package org.louis.hometutor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public CommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
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
     * This method corresponds to the database table comment
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
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
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
     * This class corresponds to the database table comment
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

        public Criteria andPosterIdIsNull() {
            addCriterion("\"posterId\" is null");
            return (Criteria) this;
        }

        public Criteria andPosterIdIsNotNull() {
            addCriterion("\"posterId\" is not null");
            return (Criteria) this;
        }

        public Criteria andPosterIdEqualTo(Long value) {
            addCriterion("\"posterId\" =", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdNotEqualTo(Long value) {
            addCriterion("\"posterId\" <>", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdGreaterThan(Long value) {
            addCriterion("\"posterId\" >", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"posterId\" >=", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdLessThan(Long value) {
            addCriterion("\"posterId\" <", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdLessThanOrEqualTo(Long value) {
            addCriterion("\"posterId\" <=", value, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdIn(List<Long> values) {
            addCriterion("\"posterId\" in", values, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdNotIn(List<Long> values) {
            addCriterion("\"posterId\" not in", values, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdBetween(Long value1, Long value2) {
            addCriterion("\"posterId\" between", value1, value2, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterIdNotBetween(Long value1, Long value2) {
            addCriterion("\"posterId\" not between", value1, value2, "posterId");
            return (Criteria) this;
        }

        public Criteria andPosterTypeIsNull() {
            addCriterion("\"posterType\" is null");
            return (Criteria) this;
        }

        public Criteria andPosterTypeIsNotNull() {
            addCriterion("\"posterType\" is not null");
            return (Criteria) this;
        }

        public Criteria andPosterTypeEqualTo(Integer value) {
            addCriterion("\"posterType\" =", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeNotEqualTo(Integer value) {
            addCriterion("\"posterType\" <>", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeGreaterThan(Integer value) {
            addCriterion("\"posterType\" >", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"posterType\" >=", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeLessThan(Integer value) {
            addCriterion("\"posterType\" <", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"posterType\" <=", value, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeIn(List<Integer> values) {
            addCriterion("\"posterType\" in", values, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeNotIn(List<Integer> values) {
            addCriterion("\"posterType\" not in", values, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"posterType\" between", value1, value2, "posterType");
            return (Criteria) this;
        }

        public Criteria andPosterTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"posterType\" not between", value1, value2, "posterType");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdIsNull() {
            addCriterion("\"replyTargetId\" is null");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdIsNotNull() {
            addCriterion("\"replyTargetId\" is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdEqualTo(Long value) {
            addCriterion("\"replyTargetId\" =", value, "replyTargetId");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdNotEqualTo(Long value) {
            addCriterion("\"replyTargetId\" <>", value, "replyTargetId");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdGreaterThan(Long value) {
            addCriterion("\"replyTargetId\" >", value, "replyTargetId");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"replyTargetId\" >=", value, "replyTargetId");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdLessThan(Long value) {
            addCriterion("\"replyTargetId\" <", value, "replyTargetId");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdLessThanOrEqualTo(Long value) {
            addCriterion("\"replyTargetId\" <=", value, "replyTargetId");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdIn(List<Long> values) {
            addCriterion("\"replyTargetId\" in", values, "replyTargetId");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdNotIn(List<Long> values) {
            addCriterion("\"replyTargetId\" not in", values, "replyTargetId");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdBetween(Long value1, Long value2) {
            addCriterion("\"replyTargetId\" between", value1, value2, "replyTargetId");
            return (Criteria) this;
        }

        public Criteria andReplyTargetIdNotBetween(Long value1, Long value2) {
            addCriterion("\"replyTargetId\" not between", value1, value2, "replyTargetId");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeIsNull() {
            addCriterion("\"replyTargetType\" is null");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeIsNotNull() {
            addCriterion("\"replyTargetType\" is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeEqualTo(Integer value) {
            addCriterion("\"replyTargetType\" =", value, "replyTargetType");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeNotEqualTo(Integer value) {
            addCriterion("\"replyTargetType\" <>", value, "replyTargetType");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeGreaterThan(Integer value) {
            addCriterion("\"replyTargetType\" >", value, "replyTargetType");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"replyTargetType\" >=", value, "replyTargetType");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeLessThan(Integer value) {
            addCriterion("\"replyTargetType\" <", value, "replyTargetType");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"replyTargetType\" <=", value, "replyTargetType");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeIn(List<Integer> values) {
            addCriterion("\"replyTargetType\" in", values, "replyTargetType");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeNotIn(List<Integer> values) {
            addCriterion("\"replyTargetType\" not in", values, "replyTargetType");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"replyTargetType\" between", value1, value2, "replyTargetType");
            return (Criteria) this;
        }

        public Criteria andReplyTargetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"replyTargetType\" not between", value1, value2, "replyTargetType");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdIsNull() {
            addCriterion("\"commentTargetId\" is null");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdIsNotNull() {
            addCriterion("\"commentTargetId\" is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdEqualTo(Long value) {
            addCriterion("\"commentTargetId\" =", value, "commentTargetId");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdNotEqualTo(Long value) {
            addCriterion("\"commentTargetId\" <>", value, "commentTargetId");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdGreaterThan(Long value) {
            addCriterion("\"commentTargetId\" >", value, "commentTargetId");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"commentTargetId\" >=", value, "commentTargetId");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdLessThan(Long value) {
            addCriterion("\"commentTargetId\" <", value, "commentTargetId");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdLessThanOrEqualTo(Long value) {
            addCriterion("\"commentTargetId\" <=", value, "commentTargetId");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdIn(List<Long> values) {
            addCriterion("\"commentTargetId\" in", values, "commentTargetId");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdNotIn(List<Long> values) {
            addCriterion("\"commentTargetId\" not in", values, "commentTargetId");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdBetween(Long value1, Long value2) {
            addCriterion("\"commentTargetId\" between", value1, value2, "commentTargetId");
            return (Criteria) this;
        }

        public Criteria andCommentTargetIdNotBetween(Long value1, Long value2) {
            addCriterion("\"commentTargetId\" not between", value1, value2, "commentTargetId");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeIsNull() {
            addCriterion("\"commentTargetType\" is null");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeIsNotNull() {
            addCriterion("\"commentTargetType\" is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeEqualTo(Integer value) {
            addCriterion("\"commentTargetType\" =", value, "commentTargetType");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeNotEqualTo(Integer value) {
            addCriterion("\"commentTargetType\" <>", value, "commentTargetType");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeGreaterThan(Integer value) {
            addCriterion("\"commentTargetType\" >", value, "commentTargetType");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"commentTargetType\" >=", value, "commentTargetType");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeLessThan(Integer value) {
            addCriterion("\"commentTargetType\" <", value, "commentTargetType");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"commentTargetType\" <=", value, "commentTargetType");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeIn(List<Integer> values) {
            addCriterion("\"commentTargetType\" in", values, "commentTargetType");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeNotIn(List<Integer> values) {
            addCriterion("\"commentTargetType\" not in", values, "commentTargetType");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"commentTargetType\" between", value1, value2, "commentTargetType");
            return (Criteria) this;
        }

        public Criteria andCommentTargetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"commentTargetType\" not between", value1, value2, "commentTargetType");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("\"content\" is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("\"content\" is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("\"content\" =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("\"content\" <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("\"content\" >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("\"content\" >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("\"content\" <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("\"content\" <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("\"content\" like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("\"content\" not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("\"content\" in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("\"content\" not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("\"content\" between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("\"content\" not between", value1, value2, "content");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comment
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
     * This class corresponds to the database table comment
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