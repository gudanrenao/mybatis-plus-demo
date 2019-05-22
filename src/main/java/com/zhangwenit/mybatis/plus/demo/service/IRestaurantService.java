package com.zhangwenit.mybatis.plus.demo.service;

import com.zhangwenit.mybatis.plus.demo.entity.Restaurant;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 张磊-饭店表 服务类
 * </p>
 *
 * @author zw
 * @since 2019-05-15
 */
public interface IRestaurantService extends IService<Restaurant> {

    Restaurant findOneTest(Long id);
}
