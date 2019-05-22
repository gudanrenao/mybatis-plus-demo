package com.zhangwenit.mybatis.plus.demo.service;

import com.zhangwenit.mybatis.plus.demo.entity.PcManageUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IPcManageUserServiceTest {

    @Autowired
    private IPcManageUserService pcManageUserService;

    /**
     * 根据 Wrapper 条件，查询全部记录
     * <p>注意： 只返回第一个字段的值</p>
     */
    @Test
    public void testListObjs() {
        //可选转换函数，对返回字段处理
        List<String> objects = pcManageUserService.listObjs(e -> "id=" + e);
        System.out.println(objects);
    }

}