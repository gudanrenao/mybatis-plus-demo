package com.zhangwenit.mybatis.plus.demo.service.impl;

import com.zhangwenit.mybatis.plus.demo.entity.Restaurant;
import com.zhangwenit.mybatis.plus.demo.mapper.RestaurantMapper;
import com.zhangwenit.mybatis.plus.demo.service.IRestaurantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 张磊-饭店表 服务实现类
 * </p>
 *
 * @author zw
 * @since 2019-05-15
 */
@Service
public class RestaurantServiceImpl extends ServiceImpl<RestaurantMapper, Restaurant> implements IRestaurantService {

    private final RestaurantMapper restaurantMapper;

    public RestaurantServiceImpl(RestaurantMapper restaurantMapper) {
        this.restaurantMapper = restaurantMapper;
    }

    @Override
    public Restaurant findOneTest(Long id) {
        return  restaurantMapper.selectOneTest(id);
    }
}
