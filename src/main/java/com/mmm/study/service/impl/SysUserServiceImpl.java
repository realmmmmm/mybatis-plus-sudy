package com.mmm.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mmm.study.entity.SysUser;
import com.mmm.study.mapper.SysUserMapper;
import com.mmm.study.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author mmm
 * @since 2023-10-25
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public void selectUser() {
        LambdaQueryWrapper<SysUser> wrapper = new LambdaQueryWrapper<>();
        LambdaQueryWrapper<SysUser> eq = wrapper.eq(SysUser::getNickName, "masentao");
        getBaseMapper().selectList(eq).forEach(System.out::println);

    }
}
