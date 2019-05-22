package com.zhangwenit.mybatis.plus.demo.mapper;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zhangwenit.mybatis.plus.demo.entity.PcManageUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/5/16 2:10 PM
 * @Version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisPlusUpdateTest {

    @Autowired
    private PcManageUserMapper pcManageUserMapper;

    /**
     * 更新某一条数据
     */
    @Test
    public void testUpdateOneUseLambda(){
        int update = pcManageUserMapper.update(null, Wrappers.<PcManageUser>lambdaUpdate().set(PcManageUser::getName, "zhangwen666").eq(PcManageUser::getId, 1));
        System.out.println(update);
    }
}