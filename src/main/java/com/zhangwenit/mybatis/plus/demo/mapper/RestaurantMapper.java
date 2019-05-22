package com.zhangwenit.mybatis.plus.demo.mapper;

import com.zhangwenit.mybatis.plus.demo.entity.Restaurant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 张磊-饭店表 Mapper 接口
 * </p>
 *
 * @author zw
 * @since 2019-05-15
 */
public interface RestaurantMapper extends BaseMapper<Restaurant> {

    Restaurant selectOneTest(Long id);
}
