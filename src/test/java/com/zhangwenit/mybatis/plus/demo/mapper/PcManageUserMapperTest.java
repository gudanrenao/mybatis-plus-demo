package com.zhangwenit.mybatis.plus.demo.mapper;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhangwenit.mybatis.plus.demo.entity.PcManageUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PcManageUserMapperTest {

    @Autowired
    private PcManageUserMapper pcManageUserMapper;

    @Test
    public void customTest() {
        List<Object> list = pcManageUserMapper.selectObjs(null);
        System.out.println(list);
    }

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<PcManageUser> userList = pcManageUserMapper.selectList(null);
        Assert.assertEquals(3, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testUpdate() {
        PcManageUser pcManageUser = pcManageUserMapper.selectById(3L);
        pcManageUser.setName("ceshi33333");
        int update = pcManageUserMapper.updateById(pcManageUser);
        System.out.println(update + "---" + pcManageUser);
    }

    @Test
    public void testQuery() {
        PcManageUser pcManageUser = new PcManageUser();
        pcManageUser.setName("ceshi");
//        QueryWrapper<PcManageUser> queryWrapper = Wrappers.query(new PcManageUser())
//                .like("name", "ceshi")
//                .eq("is_delete",0);
        QueryWrapper<PcManageUser> queryWrapper = new QueryWrapper<PcManageUser>()
                .like("name", "ceshi")
                .eq("is_delete", 0);
        List<PcManageUser> list = pcManageUserMapper.selectList(queryWrapper);
        System.out.println(list);
    }

    /**
     * lambda查询条件
     */
    @Test
    public void testLambdaQuery() {
        LambdaQueryWrapper<PcManageUser> queryWrapper = Wrappers.<PcManageUser>lambdaQuery()
                .like(PcManageUser::getName, "ceshi")
                .eq(PcManageUser::getIsDelete, 0)
                .or(q -> q.eq(PcManageUser::getId, 1).or().eq(PcManageUser::getId, 2))
                .orderByDesc(PcManageUser::getId);
        List<PcManageUser> list = pcManageUserMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    /**
     * 测试分页查询 需要配置分页Bean
     */
    @Test
    public void testPage() {
        Page<PcManageUser> page = new Page<>(1, 3);
        page.setDesc("id");
        IPage<PcManageUser> page1 = pcManageUserMapper.selectPage(page, null);
        System.out.println(page1);
        IPage<PcManageUser> page2 = pcManageUserMapper.selectPage(new Page<>(1, 3), null);
        System.out.println(page2);
    }

    /**
     * 测试逻辑删除,不会删除数据库的数据，只会将加了{@link TableLogic}注解的字段设置为
     */
    @Test
    public void testLogicDel() {
        int delete = pcManageUserMapper.deleteById(3L);
        System.out.println(delete);
    }

}