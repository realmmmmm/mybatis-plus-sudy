package com.mmm.study.service.impl;

import com.mmm.study.entity.SysJobLog;
import com.mmm.study.mapper.SysJobLogMapper;
import com.mmm.study.service.SysJobLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度日志表 服务实现类
 * </p>
 *
 * @author mmm
 * @since 2023-10-25
 */
@Service
public class SysJobLogServiceImpl extends ServiceImpl<SysJobLogMapper, SysJobLog> implements SysJobLogService {

}
