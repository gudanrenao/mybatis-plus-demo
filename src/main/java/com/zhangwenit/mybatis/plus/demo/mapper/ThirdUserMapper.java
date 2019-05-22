package com.zhangwenit.mybatis.plus.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhangwenit.mybatis.plus.demo.entity.ThirdUser;

/**
 * <p>
 * 小程序用户信息表 Mapper 接口
 * </p>
 *
 * @author zw
 * @since 2019-05-15
 */
public interface ThirdUserMapper extends BaseMapper<ThirdUser> {

    /**
     * 查询总数
     *
     * @return
     */
    int countUser();
}
