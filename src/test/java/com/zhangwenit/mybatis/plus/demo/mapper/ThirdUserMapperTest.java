package com.zhangwenit.mybatis.plus.demo.mapper;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zhangwenit.mybatis.plus.demo.entity.ThirdUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ThirdUserMapperTest {

    @Autowired
    private ThirdUserMapper thirdUserMapper;

    @Test
    public void customTest() {
//        thirdUserMapper.selectByMap()
    }

    /**
     * 如果没有配置逻辑删除，将会执行delete sql操作， 将数据从数据库中移除
     */
    @Test
    public void testDel() {
        int i = thirdUserMapper.deleteById(3L);
        System.out.println(i);
    }

    /**
     * 测试自动填充
     */
    @Test
    public void testFieldFull() {
        ThirdUser thirdUser = thirdUserMapper.selectById(1L);
        thirdUserMapper.updateById(thirdUser);
    }

    /**
     * 测试阻止恶意的全表更新删除
     */
    @Test
    public void testBlockAttackSqlParser() {
        ThirdUser thirdUser = new ThirdUser();
        thirdUser.setLastLoginTime(LocalDateTime.now());
        thirdUserMapper.update(thirdUser, Wrappers.emptyWrapper());
    }

    /**
     * 测试乐观锁
     */
    @Test
    public void testVersionLock() {
        ThirdUser thirdUser = thirdUserMapper.selectById(1L);
        thirdUser.setLastLoginTime(LocalDateTime.now());
        System.out.println(thirdUser);
        thirdUserMapper.updateById(thirdUser);
    }

    /**
     * 测试返回List<Map>,map中的key为字段名，值为value,并且会过滤掉为空的字段
     */
    @Test
    public void testSelectMaps() {
        List<Map<String, Object>> list = thirdUserMapper.selectMaps(null);
        list.forEach(System.out::println);
    }

    /**
     * 测试查询（根据 columnMap 条件）,默认比较为 =
     */
    @Test
    public void testSelectByMap() {
        Map<String, Object> columnMap = new HashMap<>(4);
        columnMap.put("union_id", "unionId111");
        columnMap.put("nick_name", "demo3");
        List<ThirdUser> list = thirdUserMapper.selectByMap(columnMap);
        list.forEach(System.out::println);
    }

    /**
     * 根据 Wrapper 条件，查询全部记录
     * <p>注意： 只返回第一个字段的值</p>
     */
    @Test
    public void testListObjs() {
        List<Object> list = thirdUserMapper.selectObjs(Wrappers.emptyWrapper());
        list.forEach(System.out::println);
    }

}