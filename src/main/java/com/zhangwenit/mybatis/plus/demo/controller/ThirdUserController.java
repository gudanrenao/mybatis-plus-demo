package com.zhangwenit.mybatis.plus.demo.controller;


import com.zhangwenit.mybatis.plus.demo.entity.ThirdUser;
import com.zhangwenit.mybatis.plus.demo.service.IThirdUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 小程序用户信息表 前端控制器
 * </p>
 *
 * @author zw
 * @since 2019-05-15
 */
@Api(tags = "小程序用户")
@RestController
@RequestMapping("/third-user")
public class ThirdUserController {

    private final IThirdUserService thirdUserService;

    public ThirdUserController(IThirdUserService thirdUserService) {
        this.thirdUserService = thirdUserService;
    }

    @ApiOperation(value = "获取所有用户")
    @GetMapping
    public List<ThirdUser> findAll() {
        return thirdUserService.list();
    }
}

