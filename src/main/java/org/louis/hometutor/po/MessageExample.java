package org.louis.hometutor.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    public MessageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
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
     * This method corresponds to the database table message
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
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
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
     * This class corresponds to the database table message
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

        public Criteria andSenderIdIsNull() {
            addCriterion("\"senderId\" is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("\"senderId\" is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(Long value) {
            addCriterion("\"senderId\" =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(Long value) {
            addCriterion("\"senderId\" <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(Long value) {
            addCriterion("\"senderId\" >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"senderId\" >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(Long value) {
            addCriterion("\"senderId\" <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(Long value) {
            addCriterion("\"senderId\" <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<Long> values) {
            addCriterion("\"senderId\" in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<Long> values) {
            addCriterion("\"senderId\" not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(Long value1, Long value2) {
            addCriterion("\"senderId\" between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(Long value1, Long value2) {
            addCriterion("\"senderId\" not between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("\"receiverId\" is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("\"receiverId\" is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(Long value) {
            addCriterion("\"receiverId\" =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(Long value) {
            addCriterion("\"receiverId\" <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(Long value) {
            addCriterion("\"receiverId\" >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"receiverId\" >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(Long value) {
            addCriterion("\"receiverId\" <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(Long value) {
            addCriterion("\"receiverId\" <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<Long> values) {
            addCriterion("\"receiverId\" in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<Long> values) {
            addCriterion("\"receiverId\" not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(Long value1, Long value2) {
            addCriterion("\"receiverId\" between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(Long value1, Long value2) {
            addCriterion("\"receiverId\" not between", value1, value2, "receiverId");
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

        public Criteria andMessageTypeIsNull() {
            addCriterion("\"messageType\" is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("\"messageType\" is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(Integer value) {
            addCriterion("\"messageType\" =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(Integer value) {
            addCriterion("\"messageType\" <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(Integer value) {
            addCriterion("\"messageType\" >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"messageType\" >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(Integer value) {
            addCriterion("\"messageType\" <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"messageType\" <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<Integer> values) {
            addCriterion("\"messageType\" in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<Integer> values) {
            addCriterion("\"messageType\" not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"messageType\" between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"messageType\" not between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNull() {
            addCriterion("\"isRead\" is null");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNotNull() {
            addCriterion("\"isRead\" is not null");
            return (Criteria) this;
        }

        public Criteria andIsReadEqualTo(Boolean value) {
            addCriterion("\"isRead\" =", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotEqualTo(Boolean value) {
            addCriterion("\"isRead\" <>", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThan(Boolean value) {
            addCriterion("\"isRead\" >", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("\"isRead\" >=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThan(Boolean value) {
            addCriterion("\"isRead\" <", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThanOrEqualTo(Boolean value) {
            addCriterion("\"isRead\" <=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadIn(List<Boolean> values) {
            addCriterion("\"isRead\" in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotIn(List<Boolean> values) {
            addCriterion("\"isRead\" not in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadBetween(Boolean value1, Boolean value2) {
            addCriterion("\"isRead\" between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("\"isRead\" not between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampIsNull() {
            addCriterion("\"readTimeStamp\" is null");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampIsNotNull() {
            addCriterion("\"readTimeStamp\" is not null");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampEqualTo(Date value) {
            addCriterion("\"readTimeStamp\" =", value, "readTimeStamp");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampNotEqualTo(Date value) {
            addCriterion("\"readTimeStamp\" <>", value, "readTimeStamp");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampGreaterThan(Date value) {
            addCriterion("\"readTimeStamp\" >", value, "readTimeStamp");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampGreaterThanOrEqualTo(Date value) {
            addCriterion("\"readTimeStamp\" >=", value, "readTimeStamp");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampLessThan(Date value) {
            addCriterion("\"readTimeStamp\" <", value, "readTimeStamp");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampLessThanOrEqualTo(Date value) {
            addCriterion("\"readTimeStamp\" <=", value, "readTimeStamp");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampIn(List<Date> values) {
            addCriterion("\"readTimeStamp\" in", values, "readTimeStamp");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampNotIn(List<Date> values) {
            addCriterion("\"readTimeStamp\" not in", values, "readTimeStamp");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampBetween(Date value1, Date value2) {
            addCriterion("\"readTimeStamp\" between", value1, value2, "readTimeStamp");
            return (Criteria) this;
        }

        public Criteria andReadTimeStampNotBetween(Date value1, Date value2) {
            addCriterion("\"readTimeStamp\" not between", value1, value2, "readTimeStamp");
            return (Criteria) this;
        }

        public Criteria andSenderTypeIsNull() {
            addCriterion("\"senderType\" is null");
            return (Criteria) this;
        }

        public Criteria andSenderTypeIsNotNull() {
            addCriterion("\"senderType\" is not null");
            return (Criteria) this;
        }

        public Criteria andSenderTypeEqualTo(Integer value) {
            addCriterion("\"senderType\" =", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeNotEqualTo(Integer value) {
            addCriterion("\"senderType\" <>", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeGreaterThan(Integer value) {
            addCriterion("\"senderType\" >", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"senderType\" >=", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeLessThan(Integer value) {
            addCriterion("\"senderType\" <", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"senderType\" <=", value, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeIn(List<Integer> values) {
            addCriterion("\"senderType\" in", values, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeNotIn(List<Integer> values) {
            addCriterion("\"senderType\" not in", values, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"senderType\" between", value1, value2, "senderType");
            return (Criteria) this;
        }

        public Criteria andSenderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"senderType\" not between", value1, value2, "senderType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeIsNull() {
            addCriterion("\"receiverType\" is null");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeIsNotNull() {
            addCriterion("\"receiverType\" is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeEqualTo(Integer value) {
            addCriterion("\"receiverType\" =", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotEqualTo(Integer value) {
            addCriterion("\"receiverType\" <>", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeGreaterThan(Integer value) {
            addCriterion("\"receiverType\" >", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"receiverType\" >=", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeLessThan(Integer value) {
            addCriterion("\"receiverType\" <", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeLessThanOrEqualTo(Integer value) {
            addCriterion("\"receiverType\" <=", value, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeIn(List<Integer> values) {
            addCriterion("\"receiverType\" in", values, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotIn(List<Integer> values) {
            addCriterion("\"receiverType\" not in", values, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeBetween(Integer value1, Integer value2) {
            addCriterion("\"receiverType\" between", value1, value2, "receiverType");
            return (Criteria) this;
        }

        public Criteria andReceiverTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("\"receiverType\" not between", value1, value2, "receiverType");
            return (Criteria) this;
        }

        public Criteria andContentLengthIsNull() {
            addCriterion("\"contentLength\" is null");
            return (Criteria) this;
        }

        public Criteria andContentLengthIsNotNull() {
            addCriterion("\"contentLength\" is not null");
            return (Criteria) this;
        }

        public Criteria andContentLengthEqualTo(String value) {
            addCriterion("\"contentLength\" =", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthNotEqualTo(String value) {
            addCriterion("\"contentLength\" <>", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthGreaterThan(String value) {
            addCriterion("\"contentLength\" >", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthGreaterThanOrEqualTo(String value) {
            addCriterion("\"contentLength\" >=", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthLessThan(String value) {
            addCriterion("\"contentLength\" <", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthLessThanOrEqualTo(String value) {
            addCriterion("\"contentLength\" <=", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthLike(String value) {
            addCriterion("\"contentLength\" like", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthNotLike(String value) {
            addCriterion("\"contentLength\" not like", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthIn(List<String> values) {
            addCriterion("\"contentLength\" in", values, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthNotIn(List<String> values) {
            addCriterion("\"contentLength\" not in", values, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthBetween(String value1, String value2) {
            addCriterion("\"contentLength\" between", value1, value2, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthNotBetween(String value1, String value2) {
            addCriterion("\"contentLength\" not between", value1, value2, "contentLength");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendIsNull() {
            addCriterion("\"isSystemSend\" is null");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendIsNotNull() {
            addCriterion("\"isSystemSend\" is not null");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendEqualTo(Boolean value) {
            addCriterion("\"isSystemSend\" =", value, "isSystemSend");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendNotEqualTo(Boolean value) {
            addCriterion("\"isSystemSend\" <>", value, "isSystemSend");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendGreaterThan(Boolean value) {
            addCriterion("\"isSystemSend\" >", value, "isSystemSend");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("\"isSystemSend\" >=", value, "isSystemSend");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendLessThan(Boolean value) {
            addCriterion("\"isSystemSend\" <", value, "isSystemSend");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendLessThanOrEqualTo(Boolean value) {
            addCriterion("\"isSystemSend\" <=", value, "isSystemSend");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendIn(List<Boolean> values) {
            addCriterion("\"isSystemSend\" in", values, "isSystemSend");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendNotIn(List<Boolean> values) {
            addCriterion("\"isSystemSend\" not in", values, "isSystemSend");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendBetween(Boolean value1, Boolean value2) {
            addCriterion("\"isSystemSend\" between", value1, value2, "isSystemSend");
            return (Criteria) this;
        }

        public Criteria andIsSystemSendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("\"isSystemSend\" not between", value1, value2, "isSystemSend");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table message
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
     * This class corresponds to the database table message
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