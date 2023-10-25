package com.mmm.study;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mmm.study.entity.SysUser;
import com.mmm.study.mapper.SysUserMapper;
import com.mmm.study.service.SysUserService;
import com.mmm.study.service.impl.SysUserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudyApplicationTests {

    @Autowired
    private SysUserServiceImpl userService;

    @Autowired
    private SysUserMapper userMapper;

    @Test
    void contextLoads() {
//        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
//        wrapper.eq("nick_name", "若依").eq("user_name","admin");
//        System.out.println(userMapper.selectOne(wrapper).toString());
//        List<SysUser> users = userMapper.selectall();
//        users.stream().forEach(System.out::println);

    }

}
