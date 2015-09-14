package com.mogujie.jarvis.dao;

import com.mogujie.jarvis.dto.Worker;
import com.mogujie.jarvis.dto.WorkerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    int countByExample(WorkerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    int deleteByExample(WorkerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    int deleteByPrimaryKey(Integer workerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    int insert(Worker record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    int insertSelective(Worker record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    List<Worker> selectByExample(WorkerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    Worker selectByPrimaryKey(Integer workerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    int updateByExampleSelective(@Param("record") Worker record, @Param("example") WorkerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    int updateByExample(@Param("record") Worker record, @Param("example") WorkerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    int updateByPrimaryKeySelective(Worker record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table worker
     *
     * @mbggenerated Mon Sep 14 10:22:57 CST 2015
     */
    int updateByPrimaryKey(Worker record);
}