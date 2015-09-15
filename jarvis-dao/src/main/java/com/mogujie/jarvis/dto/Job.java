package com.mogujie.jarvis.dto;

import java.util.Date;

public class Job {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.jobId
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Long jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.originJobId
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Long originJobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.jobName
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private String jobName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.jobType
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private String jobType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.jobFlag
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Integer jobFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.content
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.params
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private String params;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.submitUser
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private String submitUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.priority
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Integer priority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.appName
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private String appName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.workerGroupId
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Integer workerGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.rejectAttempts
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Integer rejectAttempts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.rejectInterval
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Integer rejectInterval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.failedAttempts
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Integer failedAttempts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.failedInterval
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Integer failedInterval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.createTime
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.updateTime
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.updateUser
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    private String updateUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.jobId
     *
     * @return the value of job.jobId
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.jobId
     *
     * @param jobId the value for job.jobId
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.originJobId
     *
     * @return the value of job.originJobId
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Long getOriginJobId() {
        return originJobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.originJobId
     *
     * @param originJobId the value for job.originJobId
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setOriginJobId(Long originJobId) {
        this.originJobId = originJobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.jobName
     *
     * @return the value of job.jobName
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.jobName
     *
     * @param jobName the value for job.jobName
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.jobType
     *
     * @return the value of job.jobType
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.jobType
     *
     * @param jobType the value for job.jobType
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.jobFlag
     *
     * @return the value of job.jobFlag
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Integer getJobFlag() {
        return jobFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.jobFlag
     *
     * @param jobFlag the value for job.jobFlag
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setJobFlag(Integer jobFlag) {
        this.jobFlag = jobFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.content
     *
     * @return the value of job.content
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.content
     *
     * @param content the value for job.content
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.params
     *
     * @return the value of job.params
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.params
     *
     * @param params the value for job.params
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.submitUser
     *
     * @return the value of job.submitUser
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public String getSubmitUser() {
        return submitUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.submitUser
     *
     * @param submitUser the value for job.submitUser
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setSubmitUser(String submitUser) {
        this.submitUser = submitUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.priority
     *
     * @return the value of job.priority
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.priority
     *
     * @param priority the value for job.priority
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.appName
     *
     * @return the value of job.appName
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public String getAppName() {
        return appName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.appName
     *
     * @param appName the value for job.appName
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.workerGroupId
     *
     * @return the value of job.workerGroupId
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Integer getWorkerGroupId() {
        return workerGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.workerGroupId
     *
     * @param workerGroupId the value for job.workerGroupId
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setWorkerGroupId(Integer workerGroupId) {
        this.workerGroupId = workerGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.rejectAttempts
     *
     * @return the value of job.rejectAttempts
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Integer getRejectAttempts() {
        return rejectAttempts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.rejectAttempts
     *
     * @param rejectAttempts the value for job.rejectAttempts
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setRejectAttempts(Integer rejectAttempts) {
        this.rejectAttempts = rejectAttempts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.rejectInterval
     *
     * @return the value of job.rejectInterval
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Integer getRejectInterval() {
        return rejectInterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.rejectInterval
     *
     * @param rejectInterval the value for job.rejectInterval
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setRejectInterval(Integer rejectInterval) {
        this.rejectInterval = rejectInterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.failedAttempts
     *
     * @return the value of job.failedAttempts
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Integer getFailedAttempts() {
        return failedAttempts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.failedAttempts
     *
     * @param failedAttempts the value for job.failedAttempts
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setFailedAttempts(Integer failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.failedInterval
     *
     * @return the value of job.failedInterval
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Integer getFailedInterval() {
        return failedInterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.failedInterval
     *
     * @param failedInterval the value for job.failedInterval
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setFailedInterval(Integer failedInterval) {
        this.failedInterval = failedInterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.createTime
     *
     * @return the value of job.createTime
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.createTime
     *
     * @param createTime the value for job.createTime
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.updateTime
     *
     * @return the value of job.updateTime
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.updateTime
     *
     * @param updateTime the value for job.updateTime
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.updateUser
     *
     * @return the value of job.updateUser
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.updateUser
     *
     * @param updateUser the value for job.updateUser
     *
     * @mbggenerated Tue Sep 15 20:55:26 CST 2015
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}