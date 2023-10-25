package com.mmm.study.service.impl;

import com.mmm.study.entity.SysJob;
import com.mmm.study.mapper.SysJobMapper;
import com.mmm.study.service.SysJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度表 服务实现类
 * </p>
 *
 * @author mmm
 * @since 2023-10-25
 */
@Service
public class SysJobServiceImpl extends ServiceImpl<SysJobMapper, SysJob> implements SysJobService {

}
