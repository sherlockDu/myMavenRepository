package org.louis.hometutor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message_user
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message_user
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message_user
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    public MessageUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
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
     * This method corresponds to the database table message_user
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
     * This method corresponds to the database table message_user
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_user
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
     * This class corresponds to the database table message_user
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

        public Criteria andPlatformCodeIsNull() {
            addCriterion("\"platformCode\" is null");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIsNotNull() {
            addCriterion("\"platformCode\" is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeEqualTo(String value) {
            addCriterion("\"platformCode\" =", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotEqualTo(String value) {
            addCriterion("\"platformCode\" <>", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeGreaterThan(String value) {
            addCriterion("\"platformCode\" >", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeGreaterThanOrEqualTo(String value) {
            addCriterion("\"platformCode\" >=", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLessThan(String value) {
            addCriterion("\"platformCode\" <", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLessThanOrEqualTo(String value) {
            addCriterion("\"platformCode\" <=", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeLike(String value) {
            addCriterion("\"platformCode\" like", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotLike(String value) {
            addCriterion("\"platformCode\" not like", value, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeIn(List<String> values) {
            addCriterion("\"platformCode\" in", values, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotIn(List<String> values) {
            addCriterion("\"platformCode\" not in", values, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeBetween(String value1, String value2) {
            addCriterion("\"platformCode\" between", value1, value2, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformCodeNotBetween(String value1, String value2) {
            addCriterion("\"platformCode\" not between", value1, value2, "platformCode");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIsNull() {
            addCriterion("\"platformType\" is null");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIsNotNull() {
            addCriterion("\"platformType\" is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeEqualTo(Integer value) {
            addCriterion("\"platformType\" =", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotEqualTo(Integer value) {
            addCriterion("\"platformType\" <>", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeGreaterThan(Integer value) {
            addCriterion("\"platformType\" >", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"platformType\" >=", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLessThan(Integer value) {
            addCriterion("\"platformType\" <", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"platformType\" <=", value, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeIn(List<Integer> values) {
            addCriterion("\"platformType\" in", values, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotIn(List<Integer> values) {
            addCriterion("\"platformType\" not in", values, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"platformType\" between", value1, value2, "platformType");
            return (Criteria) this;
        }

        public Criteria andPlatformTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"platformType\" not between", value1, value2, "platformType");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("\"userId\" is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("\"userId\" is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("\"userId\" =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("\"userId\" <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("\"userId\" >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"userId\" >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("\"userId\" <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("\"userId\" <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("\"userId\" in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("\"userId\" not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("\"userId\" between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("\"userId\" not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("\"userType\" is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("\"userType\" is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("\"userType\" =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("\"userType\" <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("\"userType\" >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"userType\" >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("\"userType\" <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"userType\" <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("\"userType\" in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("\"userType\" not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"userType\" between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"userType\" not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampIsNull() {
            addCriterion("\"lastLoginTimeStamp\" is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampIsNotNull() {
            addCriterion("\"lastLoginTimeStamp\" is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampEqualTo(Date value) {
            addCriterion("\"lastLoginTimeStamp\" =", value, "lastLoginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampNotEqualTo(Date value) {
            addCriterion("\"lastLoginTimeStamp\" <>", value, "lastLoginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampGreaterThan(Date value) {
            addCriterion("\"lastLoginTimeStamp\" >", value, "lastLoginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampGreaterThanOrEqualTo(Date value) {
            addCriterion("\"lastLoginTimeStamp\" >=", value, "lastLoginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampLessThan(Date value) {
            addCriterion("\"lastLoginTimeStamp\" <", value, "lastLoginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampLessThanOrEqualTo(Date value) {
            addCriterion("\"lastLoginTimeStamp\" <=", value, "lastLoginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampIn(List<Date> values) {
            addCriterion("\"lastLoginTimeStamp\" in", values, "lastLoginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampNotIn(List<Date> values) {
            addCriterion("\"lastLoginTimeStamp\" not in", values, "lastLoginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampBetween(Date value1, Date value2) {
            addCriterion("\"lastLoginTimeStamp\" between", value1, value2, "lastLoginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeStampNotBetween(Date value1, Date value2) {
            addCriterion("\"lastLoginTimeStamp\" not between", value1, value2, "lastLoginTimeStamp");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoIsNull() {
            addCriterion("\"chatRoomNo\" is null");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoIsNotNull() {
            addCriterion("\"chatRoomNo\" is not null");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoEqualTo(String value) {
            addCriterion("\"chatRoomNo\" =", value, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoNotEqualTo(String value) {
            addCriterion("\"chatRoomNo\" <>", value, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoGreaterThan(String value) {
            addCriterion("\"chatRoomNo\" >", value, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoGreaterThanOrEqualTo(String value) {
            addCriterion("\"chatRoomNo\" >=", value, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoLessThan(String value) {
            addCriterion("\"chatRoomNo\" <", value, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoLessThanOrEqualTo(String value) {
            addCriterion("\"chatRoomNo\" <=", value, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoLike(String value) {
            addCriterion("\"chatRoomNo\" like", value, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoNotLike(String value) {
            addCriterion("\"chatRoomNo\" not like", value, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoIn(List<String> values) {
            addCriterion("\"chatRoomNo\" in", values, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoNotIn(List<String> values) {
            addCriterion("\"chatRoomNo\" not in", values, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoBetween(String value1, String value2) {
            addCriterion("\"chatRoomNo\" between", value1, value2, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andChatRoomNoNotBetween(String value1, String value2) {
            addCriterion("\"chatRoomNo\" not between", value1, value2, "chatRoomNo");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomIsNull() {
            addCriterion("\"isSuccessAddToRoom\" is null");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomIsNotNull() {
            addCriterion("\"isSuccessAddToRoom\" is not null");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomEqualTo(Boolean value) {
            addCriterion("\"isSuccessAddToRoom\" =", value, "isSuccessAddToRoom");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomNotEqualTo(Boolean value) {
            addCriterion("\"isSuccessAddToRoom\" <>", value, "isSuccessAddToRoom");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomGreaterThan(Boolean value) {
            addCriterion("\"isSuccessAddToRoom\" >", value, "isSuccessAddToRoom");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomGreaterThanOrEqualTo(Boolean value) {
            addCriterion("\"isSuccessAddToRoom\" >=", value, "isSuccessAddToRoom");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomLessThan(Boolean value) {
            addCriterion("\"isSuccessAddToRoom\" <", value, "isSuccessAddToRoom");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomLessThanOrEqualTo(Boolean value) {
            addCriterion("\"isSuccessAddToRoom\" <=", value, "isSuccessAddToRoom");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomIn(List<Boolean> values) {
            addCriterion("\"isSuccessAddToRoom\" in", values, "isSuccessAddToRoom");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomNotIn(List<Boolean> values) {
            addCriterion("\"isSuccessAddToRoom\" not in", values, "isSuccessAddToRoom");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomBetween(Boolean value1, Boolean value2) {
            addCriterion("\"isSuccessAddToRoom\" between", value1, value2, "isSuccessAddToRoom");
            return (Criteria) this;
        }

        public Criteria andIsSuccessAddToRoomNotBetween(Boolean value1, Boolean value2) {
            addCriterion("\"isSuccessAddToRoom\" not between", value1, value2, "isSuccessAddToRoom");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table message_user
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
     * This class corresponds to the database table message_user
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