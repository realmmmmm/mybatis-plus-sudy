package com.mmm.study.mapper;

import com.mmm.study.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author mmm
 * @since 2023-10-25
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> selectall();
}
