package com.mogujie.jarvis.dto;

import java.io.Serializable;

public class TaskScheduleKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_schedule.jobId
     *
     * @mbggenerated Thu Nov 05 20:32:54 CST 2015
     */
    private Long jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_schedule.preJobId
     *
     * @mbggenerated Thu Nov 05 20:32:54 CST 2015
     */
    private Long preJobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_schedule.preTaskId
     *
     * @mbggenerated Thu Nov 05 20:32:54 CST 2015
     */
    private Long preTaskId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_schedule
     *
     * @mbggenerated Thu Nov 05 20:32:54 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_schedule.jobId
     *
     * @return the value of task_schedule.jobId
     *
     * @mbggenerated Thu Nov 05 20:32:54 CST 2015
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_schedule.jobId
     *
     * @param jobId the value for task_schedule.jobId
     *
     * @mbggenerated Thu Nov 05 20:32:54 CST 2015
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_schedule.preJobId
     *
     * @return the value of task_schedule.preJobId
     *
     * @mbggenerated Thu Nov 05 20:32:54 CST 2015
     */
    public Long getPreJobId() {
        return preJobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_schedule.preJobId
     *
     * @param preJobId the value for task_schedule.preJobId
     *
     * @mbggenerated Thu Nov 05 20:32:54 CST 2015
     */
    public void setPreJobId(Long preJobId) {
        this.preJobId = preJobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_schedule.preTaskId
     *
     * @return the value of task_schedule.preTaskId
     *
     * @mbggenerated Thu Nov 05 20:32:54 CST 2015
     */
    public Long getPreTaskId() {
        return preTaskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_schedule.preTaskId
     *
     * @param preTaskId the value for task_schedule.preTaskId
     *
     * @mbggenerated Thu Nov 05 20:32:54 CST 2015
     */
    public void setPreTaskId(Long preTaskId) {
        this.preTaskId = preTaskId;
    }
}