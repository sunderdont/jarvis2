package com.mogujie.jarvis.dao;

import com.mogujie.jarvis.dto.WorkerGroup;
import com.mogujie.jarvis.dto.WorkerGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkerGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    int countByExample(WorkerGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    int deleteByExample(WorkerGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    int deleteByPrimaryKey(Integer wgroupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    int insert(WorkerGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    int insertSelective(WorkerGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    List<WorkerGroup> selectByExample(WorkerGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    WorkerGroup selectByPrimaryKey(Integer wgroupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    int updateByExampleSelective(@Param("record") WorkerGroup record, @Param("example") WorkerGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    int updateByExample(@Param("record") WorkerGroup record, @Param("example") WorkerGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    int updateByPrimaryKeySelective(WorkerGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker_group
     *
     * @mbggenerated Wed Sep 23 10:50:29 CST 2015
     */
    int updateByPrimaryKey(WorkerGroup record);
}