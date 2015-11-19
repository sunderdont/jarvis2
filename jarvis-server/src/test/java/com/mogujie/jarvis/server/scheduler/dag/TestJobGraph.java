/*
 * 蘑菇街 Inc.
 * Copyright (c) 2010-2015 All Rights Reserved.
 *
 * Author: guangming
 * Create Date: 2015年9月8日 下午8:03:32
 */
package com.mogujie.jarvis.server.scheduler.dag;

import org.apache.commons.configuration.Configuration;
import org.jgrapht.experimental.dag.DirectedAcyclicGraph.CycleFoundException;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.common.collect.Sets;
import com.mogujie.jarvis.core.domain.JobFlag;
import com.mogujie.jarvis.core.util.ConfigUtils;
import com.mogujie.jarvis.server.scheduler.SchedulerUtil;
import com.mogujie.jarvis.server.scheduler.dag.checker.TaskScheduleFactory;
import com.mogujie.jarvis.server.util.SpringContext;


/**
 * @author guangming
 *
 */
public class TestJobGraph {
    private long jobAId = 1;
    private long jobBId = 2;
    private long jobCId = 3;
    private DAGJob jobA;
    private DAGJob jobB;
    private DAGJob jobC;
    private static JobGraph jobGraph;
    private static Configuration conf = ConfigUtils.getServerConfig();

    @BeforeClass
    public static void setup() throws Exception {
        conf.clear();
        conf.setProperty(SchedulerUtil.ENABLE_TEST_MODE, true);
        conf.setProperty(TaskScheduleFactory.TASK_SCHEDULE_KEY, TaskScheduleFactory.DUMMY_TASK_SCHEDULE);
        DAGScheduler scheduler = SpringContext.getBean(DAGScheduler.class);
        jobGraph = scheduler.getJobGraph();
    }

    @After
    public void tearDown() throws Exception {
        jobGraph.clear();
    }

    /**
     *   A   B
     *    \ /
     *     C
     * @throws CycleFoundException
     */
    @Test
    public void testAddJob1() throws Exception {
        jobA = new DAGJob(jobAId, DAGJobType.TIME);
        jobB = new DAGJob(jobBId, DAGJobType.TIME);
        jobC = new DAGJob(jobCId, DAGJobType.DEPEND);
        jobGraph.addJob(jobA.getJobId(), jobA, null);
        jobGraph.addJob(jobB.getJobId(), jobB, null);
        jobGraph.addJob(jobC.getJobId(), jobC, Sets.newHashSet(jobA.getJobId(),jobB.getJobId()));
        Assert.assertEquals(1, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(3, (long)jobGraph.getChildren(jobA.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getChildren(jobB.getJobId()).size());
        Assert.assertEquals(3, (long)jobGraph.getChildren(jobB.getJobId()).get(0).getFirst());
        Assert.assertEquals(2, jobGraph.getParents(jobC.getJobId()).size());
    }

    /**
     *     A
     *    / \
     *   B   C
     * @throws CycleFoundException
     */
    @Test
    public void testAddJob2() throws Exception {
        jobA = new DAGJob(jobAId, DAGJobType.TIME);
        jobB = new DAGJob(jobBId, DAGJobType.DEPEND);
        jobC = new DAGJob(jobCId, DAGJobType.DEPEND);
        jobGraph.addJob(jobA.getJobId(), jobA, null);
        jobGraph.addJob(jobB.getJobId(), jobB, Sets.newHashSet(jobA.getJobId()));
        jobGraph.addJob(jobC.getJobId(), jobC, Sets.newHashSet(jobA.getJobId()));
        Assert.assertEquals(2, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(1, jobGraph.getParents(jobB.getJobId()).size());
        Assert.assertEquals(1, (long)jobGraph.getParents(jobB.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getParents(jobC.getJobId()).size());
        Assert.assertEquals(1, (long)jobGraph.getParents(jobC.getJobId()).get(0).getFirst());
    }

    /**
     *   A   B        A
     *    \ /   -->   |
     *     C          C
     * @throws CycleFoundException
     */
    @Test
    public void testRemoveJob1() throws Exception {
        jobA = new DAGJob(jobAId, DAGJobType.TIME);
        jobB = new DAGJob(jobBId, DAGJobType.TIME);
        jobC = new DAGJob(jobCId, DAGJobType.DEPEND);
        jobGraph.addJob(jobA.getJobId(), jobA, null);
        jobGraph.addJob(jobB.getJobId(), jobB, null);
        jobGraph.addJob(jobC.getJobId(), jobC, Sets.newHashSet(jobA.getJobId(),jobB.getJobId()));
        Assert.assertEquals(1, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(3, (long)jobGraph.getChildren(jobA.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getChildren(jobB.getJobId()).size());
        Assert.assertEquals(3, (long)jobGraph.getChildren(jobB.getJobId()).get(0).getFirst());
        Assert.assertEquals(2, jobGraph.getParents(jobC.getJobId()).size());

        jobGraph.removeJob(jobB);
        Assert.assertEquals(1, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(3, (long)jobGraph.getChildren(jobA.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getParents(jobC.getJobId()).size());
        Assert.assertEquals(1, (long)jobGraph.getParents(jobC.getJobId()).get(0).getFirst());
    }

    /**
     *   A   B
     *    \ /   -->  A  B
     *     C
     * @throws CycleFoundException
     */
    @Test
    public void testRemoveJob2() throws Exception {
        jobA = new DAGJob(jobAId, DAGJobType.TIME);
        jobB = new DAGJob(jobBId, DAGJobType.TIME);
        jobC = new DAGJob(jobCId, DAGJobType.DEPEND);
        jobGraph.addJob(jobA.getJobId(), jobA, null);
        jobGraph.addJob(jobB.getJobId(), jobB, null);
        jobGraph.addJob(jobC.getJobId(), jobC, Sets.newHashSet(jobA.getJobId(),jobB.getJobId()));
        Assert.assertEquals(1, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(3, (long)jobGraph.getChildren(jobA.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getChildren(jobB.getJobId()).size());
        Assert.assertEquals(3, (long)jobGraph.getChildren(jobB.getJobId()).get(0).getFirst());
        Assert.assertEquals(2, jobGraph.getParents(jobC.getJobId()).size());

        jobGraph.removeJob(jobC);
        Assert.assertEquals(0, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(0, jobGraph.getChildren(jobB.getJobId()).size());
        Assert.assertEquals(0, jobGraph.getParents(jobC.getJobId()).size());
    }

    /**
     *     A
     *    / \   -->  B  C
     *   B   C
     * @throws CycleFoundException
     */
    @Test
    public void testRemoveJob3() throws Exception {
        jobA = new DAGJob(jobAId, DAGJobType.TIME);
        jobB = new DAGJob(jobBId, DAGJobType.DEPEND);
        jobC = new DAGJob(jobCId, DAGJobType.DEPEND);
        jobGraph.addJob(jobA.getJobId(), jobA, null);
        jobGraph.addJob(jobB.getJobId(), jobB, Sets.newHashSet(jobA.getJobId()));
        jobGraph.addJob(jobC.getJobId(), jobC, Sets.newHashSet(jobA.getJobId()));
        Assert.assertEquals(2, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(1, jobGraph.getParents(jobB.getJobId()).size());
        Assert.assertEquals(1, (long)jobGraph.getParents(jobB.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getParents(jobC.getJobId()).size());
        Assert.assertEquals(1, (long)jobGraph.getParents(jobC.getJobId()).get(0).getFirst());

        jobGraph.removeJob(jobA);
        Assert.assertEquals(0, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(0, jobGraph.getChildren(jobB.getJobId()).size());
        Assert.assertEquals(0, jobGraph.getChildren(jobC.getJobId()).size());
    }

    /**
     *     A
     *     |           A
     *     B   -->    / \
     *     |         B   C
     *     C
     * @throws CycleFoundException
     */
    @Test
    public void testModifyDependency1() throws Exception {
        jobA = new DAGJob(jobAId, DAGJobType.TIME);
        jobB = new DAGJob(jobBId, DAGJobType.DEPEND);
        jobC = new DAGJob(jobCId, DAGJobType.DEPEND);
        jobGraph.addJob(jobA.getJobId(), jobA, null);
        jobGraph.addJob(jobB.getJobId(), jobB, null);
        jobGraph.addJob(jobC.getJobId(), jobC, null);

        jobGraph.addDependency(jobA.getJobId(), jobB.getJobId());
        jobGraph.addDependency(jobB.getJobId(), jobC.getJobId());
        Assert.assertEquals(1, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(jobB.getJobId(), (long)jobGraph.getChildren(jobA.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getParents(jobB.getJobId()).size());
        Assert.assertEquals(jobA.getJobId(), (long)jobGraph.getParents(jobB.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getChildren(jobB.getJobId()).size());
        Assert.assertEquals(jobC.getJobId(), (long)jobGraph.getChildren(jobB.getJobId()).get(0).getFirst());

        jobGraph.removeDependency(jobB.getJobId(), jobC.getJobId());
        jobGraph.addDependency(jobA.getJobId(), jobC.getJobId());
        Assert.assertEquals(2, jobGraph.getChildren(jobA.getJobId()).size());
    }

    /**
     *              A
     *     A        |
     *    / \  -->  B
     *   B   C      |
     *              C
     * @throws CycleFoundException
     */
    @Test
    public void testModifyDependency2() throws Exception {
        jobA = new DAGJob(jobAId, DAGJobType.TIME);
        jobB = new DAGJob(jobBId, DAGJobType.DEPEND);
        jobC = new DAGJob(jobCId, DAGJobType.DEPEND);
        jobGraph.addJob(jobA.getJobId(), jobA, null);
        jobGraph.addJob(jobB.getJobId(), jobB, Sets.newHashSet(jobAId));
        jobGraph.addJob(jobC.getJobId(), jobC, Sets.newHashSet(jobAId));
        Assert.assertEquals(2, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(1, jobGraph.getParents(jobB.getJobId()).size());
        Assert.assertEquals(jobA.getJobId(), (long)jobGraph.getParents(jobB.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getParents(jobC.getJobId()).size());
        Assert.assertEquals(jobA.getJobId(), (long)jobGraph.getParents(jobC.getJobId()).get(0).getFirst());

        jobGraph.removeDependency(jobA.getJobId(), jobC.getJobId());
        jobGraph.addDependency(jobB.getJobId(), jobC.getJobId());
        Assert.assertEquals(1, jobGraph.getChildren(jobA.getJobId()).size());
        Assert.assertEquals(jobB.getJobId(), (long)jobGraph.getChildren(jobA.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getParents(jobB.getJobId()).size());
        Assert.assertEquals(jobA.getJobId(), (long)jobGraph.getParents(jobB.getJobId()).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getChildren(jobB.getJobId()).size());
        Assert.assertEquals(jobC.getJobId(), (long)jobGraph.getChildren(jobB.getJobId()).get(0).getFirst());
    }

    /**
     *   A   B (ENABLE)      A   B (DISABLE)
     *    \ /           -->   \ /
     *     C                   C
     */
    @Test
    public void testModifyJobFlag1() throws Exception {
        jobA = new DAGJob(jobAId, DAGJobType.TIME);
        jobB = new DAGJob(jobBId, DAGJobType.TIME);
        jobC = new DAGJob(jobCId, DAGJobType.DEPEND);
        jobGraph.addJob(jobAId, jobA, null);
        jobGraph.addJob(jobBId, jobB, null);
        jobGraph.addJob(jobCId, jobC, Sets.newHashSet(jobAId, jobBId));
        Assert.assertEquals(1, jobGraph.getChildren(jobAId).size());
        Assert.assertEquals(jobCId, (long)jobGraph.getChildren(jobAId).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getChildren(jobBId).size());
        Assert.assertEquals(jobCId, (long)jobGraph.getChildren(jobBId).get(0).getFirst());
        Assert.assertEquals(2, jobGraph.getParents(jobCId).size());

        // jobB disable
        jobGraph.modifyJobFlag(jobBId, JobFlag.DISABLE);
        // jobC has two parents
        Assert.assertEquals(2, jobGraph.getParents(jobCId).size());
    }

    /**
     *   A   B (ENABLE)      A   B (DELETED)
     *    \ /           -->   \ /
     *     C                   C
     */
    @Test
    public void testModifyJobFlag2() throws Exception {
        jobA = new DAGJob(jobAId, DAGJobType.TIME);
        jobB = new DAGJob(jobBId, DAGJobType.TIME);
        jobC = new DAGJob(jobCId, DAGJobType.DEPEND);
        jobGraph.addJob(jobAId, jobA, null);
        jobGraph.addJob(jobBId, jobB, null);
        jobGraph.addJob(jobCId, jobC, Sets.newHashSet(jobAId, jobBId));
        Assert.assertEquals(1, jobGraph.getChildren(jobAId).size());
        Assert.assertEquals(jobCId, (long)jobGraph.getChildren(jobAId).get(0).getFirst());
        Assert.assertEquals(1, jobGraph.getChildren(jobBId).size());
        Assert.assertEquals(jobCId, (long)jobGraph.getChildren(jobBId).get(0).getFirst());
        Assert.assertEquals(2, jobGraph.getParents(jobCId).size());

        // jobB disable
        jobGraph.modifyJobFlag(jobBId, JobFlag.DELETED);
        // jobC has two parents
        Assert.assertEquals(1, jobGraph.getParents(jobCId).size());
    }

}
