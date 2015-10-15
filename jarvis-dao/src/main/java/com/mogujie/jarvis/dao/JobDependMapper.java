package com.mogujie.jarvis.dao;

import com.mogujie.jarvis.dto.JobDepend;
import com.mogujie.jarvis.dto.JobDependExample;
import com.mogujie.jarvis.dto.JobDependKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobDependMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    int countByExample(JobDependExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    int deleteByExample(JobDependExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    int deleteByPrimaryKey(JobDependKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    int insert(JobDepend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    int insertSelective(JobDepend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    List<JobDepend> selectByExample(JobDependExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    JobDepend selectByPrimaryKey(JobDependKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    int updateByExampleSelective(@Param("record") JobDepend record, @Param("example") JobDependExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    int updateByExample(@Param("record") JobDepend record, @Param("example") JobDependExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    int updateByPrimaryKeySelective(JobDepend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_depend
     *
     * @mbggenerated Thu Oct 15 16:08:15 CST 2015
     */
    int updateByPrimaryKey(JobDepend record);
}