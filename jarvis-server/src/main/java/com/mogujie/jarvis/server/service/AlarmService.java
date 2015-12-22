/*
 * 蘑菇街 Inc.
 * Copyright (c) 2010-2015 All Rights Reserved.
 *
 * Author: wuya
 * Create Date: 2015年12月16日 下午5:59:26
 */

package com.mogujie.jarvis.server.service;

import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mogujie.jarvis.dao.generate.AlarmMapper;
import com.mogujie.jarvis.dto.generate.Alarm;
import com.mogujie.jarvis.dto.generate.AlarmExample;

@Singleton
public class AlarmService {

    @Inject
    private AlarmMapper alarmMapper;

    public Alarm getAlarmByJobId(long jobId) {
        AlarmExample alarmExample = new AlarmExample();
        alarmExample.createCriteria().andJobIdEqualTo(jobId);
        List<Alarm> alarms = alarmMapper.selectByExample(alarmExample);
        if (alarms != null && alarms.size() == 1) {
            return alarms.get(0);
        }

        return null;
    }
}