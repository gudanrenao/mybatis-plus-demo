package com.zhangwenit.mybatis.plus.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zhangwenit.mybatis.plus.demo.dto.PcManageUserDto;
import com.zhangwenit.mybatis.plus.demo.entity.PcManageUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/5/16 12:05 PM
 * @Version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisPlusSelectTest {

    @Autowired
    private PcManageUserMapper pcManageUserMapper;

    /**
     * 测试自定义返回字段,todo:除了查询后转换，如何将查询结果直接用dto接收？
     */
    @Test
    public void testSetSqlSelect() {
        LambdaQueryWrapper<PcManageUser> qw = Wrappers.<PcManageUser>lambdaQuery()
                .select(PcManageUser::getId, PcManageUser::getName, PcManageUser::getType)
                .orderByDesc(PcManageUser::getId);
        List<PcManageUser> list = pcManageUserMapper.selectList(qw);
        list.forEach(System.out::println);
    }

    /**
     * 测试自定义select字段 use selectMaps 转dto
     */
    @Test
    public void testSelectMapsToDto() {
        LambdaQueryWrapper<PcManageUser> qw = Wrappers.<PcManageUser>lambdaQuery()
                .select(PcManageUser::getId, PcManageUser::getName, PcManageUser::getType)
                .orderByDesc(PcManageUser::getId);
        List<PcManageUserDto> list = pcManageUserMapper.selectMaps(qw).stream().map(PcManageUserDto::new).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}