package com.mogujie.jarvis.dao;

import com.mogujie.jarvis.dto.Plan;
import com.mogujie.jarvis.dto.PlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    int countByExample(PlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    int deleteByExample(PlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    int deleteByPrimaryKey(Integer planId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    int insert(Plan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    int insertSelective(Plan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    List<Plan> selectByExample(PlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    Plan selectByPrimaryKey(Integer planId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    int updateByExampleSelective(@Param("record") Plan record, @Param("example") PlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    int updateByExample(@Param("record") Plan record, @Param("example") PlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    int updateByPrimaryKeySelective(Plan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan
     *
     * @mbggenerated Tue Oct 20 18:32:14 CST 2015
     */
    int updateByPrimaryKey(Plan record);
}