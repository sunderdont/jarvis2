package com.mogujie.jarvis.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaskExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public TaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
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
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("taskId =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("taskId <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("taskId >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("taskId >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("taskId <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("taskId <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("taskId in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("taskId not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("taskId between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("taskId not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andAttemptIdIsNull() {
            addCriterion("attemptId is null");
            return (Criteria) this;
        }

        public Criteria andAttemptIdIsNotNull() {
            addCriterion("attemptId is not null");
            return (Criteria) this;
        }

        public Criteria andAttemptIdEqualTo(Integer value) {
            addCriterion("attemptId =", value, "attemptId");
            return (Criteria) this;
        }

        public Criteria andAttemptIdNotEqualTo(Integer value) {
            addCriterion("attemptId <>", value, "attemptId");
            return (Criteria) this;
        }

        public Criteria andAttemptIdGreaterThan(Integer value) {
            addCriterion("attemptId >", value, "attemptId");
            return (Criteria) this;
        }

        public Criteria andAttemptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attemptId >=", value, "attemptId");
            return (Criteria) this;
        }

        public Criteria andAttemptIdLessThan(Integer value) {
            addCriterion("attemptId <", value, "attemptId");
            return (Criteria) this;
        }

        public Criteria andAttemptIdLessThanOrEqualTo(Integer value) {
            addCriterion("attemptId <=", value, "attemptId");
            return (Criteria) this;
        }

        public Criteria andAttemptIdIn(List<Integer> values) {
            addCriterion("attemptId in", values, "attemptId");
            return (Criteria) this;
        }

        public Criteria andAttemptIdNotIn(List<Integer> values) {
            addCriterion("attemptId not in", values, "attemptId");
            return (Criteria) this;
        }

        public Criteria andAttemptIdBetween(Integer value1, Integer value2) {
            addCriterion("attemptId between", value1, value2, "attemptId");
            return (Criteria) this;
        }

        public Criteria andAttemptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attemptId not between", value1, value2, "attemptId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("jobId is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("jobId is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Long value) {
            addCriterion("jobId =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Long value) {
            addCriterion("jobId <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Long value) {
            addCriterion("jobId >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("jobId >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Long value) {
            addCriterion("jobId <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Long value) {
            addCriterion("jobId <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Long> values) {
            addCriterion("jobId in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Long> values) {
            addCriterion("jobId not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Long value1, Long value2) {
            addCriterion("jobId between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Long value1, Long value2) {
            addCriterion("jobId not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobContentIsNull() {
            addCriterion("jobContent is null");
            return (Criteria) this;
        }

        public Criteria andJobContentIsNotNull() {
            addCriterion("jobContent is not null");
            return (Criteria) this;
        }

        public Criteria andJobContentEqualTo(String value) {
            addCriterion("jobContent =", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotEqualTo(String value) {
            addCriterion("jobContent <>", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentGreaterThan(String value) {
            addCriterion("jobContent >", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentGreaterThanOrEqualTo(String value) {
            addCriterion("jobContent >=", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLessThan(String value) {
            addCriterion("jobContent <", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLessThanOrEqualTo(String value) {
            addCriterion("jobContent <=", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLike(String value) {
            addCriterion("jobContent like", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotLike(String value) {
            addCriterion("jobContent not like", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentIn(List<String> values) {
            addCriterion("jobContent in", values, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotIn(List<String> values) {
            addCriterion("jobContent not in", values, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentBetween(String value1, String value2) {
            addCriterion("jobContent between", value1, value2, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotBetween(String value1, String value2) {
            addCriterion("jobContent not between", value1, value2, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobParamsIsNull() {
            addCriterion("jobParams is null");
            return (Criteria) this;
        }

        public Criteria andJobParamsIsNotNull() {
            addCriterion("jobParams is not null");
            return (Criteria) this;
        }

        public Criteria andJobParamsEqualTo(String value) {
            addCriterion("jobParams =", value, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsNotEqualTo(String value) {
            addCriterion("jobParams <>", value, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsGreaterThan(String value) {
            addCriterion("jobParams >", value, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsGreaterThanOrEqualTo(String value) {
            addCriterion("jobParams >=", value, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsLessThan(String value) {
            addCriterion("jobParams <", value, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsLessThanOrEqualTo(String value) {
            addCriterion("jobParams <=", value, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsLike(String value) {
            addCriterion("jobParams like", value, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsNotLike(String value) {
            addCriterion("jobParams not like", value, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsIn(List<String> values) {
            addCriterion("jobParams in", values, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsNotIn(List<String> values) {
            addCriterion("jobParams not in", values, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsBetween(String value1, String value2) {
            addCriterion("jobParams between", value1, value2, "jobParams");
            return (Criteria) this;
        }

        public Criteria andJobParamsNotBetween(String value1, String value2) {
            addCriterion("jobParams not between", value1, value2, "jobParams");
            return (Criteria) this;
        }

        public Criteria andDataYmdIsNull() {
            addCriterion("dataYmd is null");
            return (Criteria) this;
        }

        public Criteria andDataYmdIsNotNull() {
            addCriterion("dataYmd is not null");
            return (Criteria) this;
        }

        public Criteria andDataYmdEqualTo(Date value) {
            addCriterionForJDBCDate("dataYmd =", value, "dataYmd");
            return (Criteria) this;
        }

        public Criteria andDataYmdNotEqualTo(Date value) {
            addCriterionForJDBCDate("dataYmd <>", value, "dataYmd");
            return (Criteria) this;
        }

        public Criteria andDataYmdGreaterThan(Date value) {
            addCriterionForJDBCDate("dataYmd >", value, "dataYmd");
            return (Criteria) this;
        }

        public Criteria andDataYmdGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dataYmd >=", value, "dataYmd");
            return (Criteria) this;
        }

        public Criteria andDataYmdLessThan(Date value) {
            addCriterionForJDBCDate("dataYmd <", value, "dataYmd");
            return (Criteria) this;
        }

        public Criteria andDataYmdLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dataYmd <=", value, "dataYmd");
            return (Criteria) this;
        }

        public Criteria andDataYmdIn(List<Date> values) {
            addCriterionForJDBCDate("dataYmd in", values, "dataYmd");
            return (Criteria) this;
        }

        public Criteria andDataYmdNotIn(List<Date> values) {
            addCriterionForJDBCDate("dataYmd not in", values, "dataYmd");
            return (Criteria) this;
        }

        public Criteria andDataYmdBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dataYmd between", value1, value2, "dataYmd");
            return (Criteria) this;
        }

        public Criteria andDataYmdNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dataYmd not between", value1, value2, "dataYmd");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andExecuteUserIsNull() {
            addCriterion("executeUser is null");
            return (Criteria) this;
        }

        public Criteria andExecuteUserIsNotNull() {
            addCriterion("executeUser is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteUserEqualTo(String value) {
            addCriterion("executeUser =", value, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserNotEqualTo(String value) {
            addCriterion("executeUser <>", value, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserGreaterThan(String value) {
            addCriterion("executeUser >", value, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserGreaterThanOrEqualTo(String value) {
            addCriterion("executeUser >=", value, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserLessThan(String value) {
            addCriterion("executeUser <", value, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserLessThanOrEqualTo(String value) {
            addCriterion("executeUser <=", value, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserLike(String value) {
            addCriterion("executeUser like", value, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserNotLike(String value) {
            addCriterion("executeUser not like", value, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserIn(List<String> values) {
            addCriterion("executeUser in", values, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserNotIn(List<String> values) {
            addCriterion("executeUser not in", values, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserBetween(String value1, String value2) {
            addCriterion("executeUser between", value1, value2, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteUserNotBetween(String value1, String value2) {
            addCriterion("executeUser not between", value1, value2, "executeUser");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeIsNull() {
            addCriterion("executeStartTime is null");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeIsNotNull() {
            addCriterion("executeStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeEqualTo(Date value) {
            addCriterion("executeStartTime =", value, "executeStartTime");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeNotEqualTo(Date value) {
            addCriterion("executeStartTime <>", value, "executeStartTime");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeGreaterThan(Date value) {
            addCriterion("executeStartTime >", value, "executeStartTime");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("executeStartTime >=", value, "executeStartTime");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeLessThan(Date value) {
            addCriterion("executeStartTime <", value, "executeStartTime");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("executeStartTime <=", value, "executeStartTime");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeIn(List<Date> values) {
            addCriterion("executeStartTime in", values, "executeStartTime");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeNotIn(List<Date> values) {
            addCriterion("executeStartTime not in", values, "executeStartTime");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeBetween(Date value1, Date value2) {
            addCriterion("executeStartTime between", value1, value2, "executeStartTime");
            return (Criteria) this;
        }

        public Criteria andExecuteStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("executeStartTime not between", value1, value2, "executeStartTime");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeIsNull() {
            addCriterion("executeEndTime is null");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeIsNotNull() {
            addCriterion("executeEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeEqualTo(Date value) {
            addCriterion("executeEndTime =", value, "executeEndTime");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeNotEqualTo(Date value) {
            addCriterion("executeEndTime <>", value, "executeEndTime");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeGreaterThan(Date value) {
            addCriterion("executeEndTime >", value, "executeEndTime");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("executeEndTime >=", value, "executeEndTime");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeLessThan(Date value) {
            addCriterion("executeEndTime <", value, "executeEndTime");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("executeEndTime <=", value, "executeEndTime");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeIn(List<Date> values) {
            addCriterion("executeEndTime in", values, "executeEndTime");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeNotIn(List<Date> values) {
            addCriterion("executeEndTime not in", values, "executeEndTime");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeBetween(Date value1, Date value2) {
            addCriterion("executeEndTime between", value1, value2, "executeEndTime");
            return (Criteria) this;
        }

        public Criteria andExecuteEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("executeEndTime not between", value1, value2, "executeEndTime");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraIsNull() {
            addCriterion("attemptExtra is null");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraIsNotNull() {
            addCriterion("attemptExtra is not null");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraEqualTo(String value) {
            addCriterion("attemptExtra =", value, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraNotEqualTo(String value) {
            addCriterion("attemptExtra <>", value, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraGreaterThan(String value) {
            addCriterion("attemptExtra >", value, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraGreaterThanOrEqualTo(String value) {
            addCriterion("attemptExtra >=", value, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraLessThan(String value) {
            addCriterion("attemptExtra <", value, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraLessThanOrEqualTo(String value) {
            addCriterion("attemptExtra <=", value, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraLike(String value) {
            addCriterion("attemptExtra like", value, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraNotLike(String value) {
            addCriterion("attemptExtra not like", value, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraIn(List<String> values) {
            addCriterion("attemptExtra in", values, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraNotIn(List<String> values) {
            addCriterion("attemptExtra not in", values, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraBetween(String value1, String value2) {
            addCriterion("attemptExtra between", value1, value2, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andAttemptExtraNotBetween(String value1, String value2) {
            addCriterion("attemptExtra not between", value1, value2, "attemptExtra");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task
     *
     * @mbggenerated do_not_delete_during_merge Tue Sep 15 20:55:26 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
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