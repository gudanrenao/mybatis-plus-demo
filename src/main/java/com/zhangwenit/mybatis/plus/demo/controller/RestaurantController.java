package com.zhangwenit.mybatis.plus.demo.controller;


import com.zhangwenit.mybatis.plus.demo.dto.ResponseVO;
import com.zhangwenit.mybatis.plus.demo.entity.Restaurant;
import com.zhangwenit.mybatis.plus.demo.service.IRestaurantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 张磊-饭店表 前端控制器
 * </p>
 *
 * @author zw
 * @since 2019-05-15
 */
@Api(tags = "饭店相关接口")
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final IRestaurantService restaurantService;

    public RestaurantController(IRestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @ApiOperation(value = "获取所有饭店列表")
    @GetMapping
    public List<Restaurant> findAll() {
        return restaurantService.list();
    }

    @ApiOperation(value = "id查询test")
    @GetMapping("{id}")
    public ResponseVO<Restaurant> findByIdTest(@PathVariable Long id) {
        return ResponseVO.buildSuccess(restaurantService.findOneTest(id));
    }
}

