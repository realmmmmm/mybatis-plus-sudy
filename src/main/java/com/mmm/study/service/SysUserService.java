package com.mmm.study.service;

import com.mmm.study.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author mmm
 * @since 2023-10-25
 */
public interface SysUserService extends IService<SysUser> {

    public void selectUser();

}
