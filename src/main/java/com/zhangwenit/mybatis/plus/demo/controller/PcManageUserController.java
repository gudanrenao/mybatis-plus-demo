package com.zhangwenit.mybatis.plus.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhangwenit.mybatis.plus.demo.entity.PcManageUser;
import com.zhangwenit.mybatis.plus.demo.service.IPcManageUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 张磊-账号表 前端控制器
 * </p>
 *
 * @author zw
 * @since 2019-05-15
 */
@Api(tags = "后台账户")
@RestController
@RequestMapping("/pc-manage-user")
public class PcManageUserController {

    private final IPcManageUserService pcManageUserService;

    public PcManageUserController(IPcManageUserService pcManageUserService) {
        this.pcManageUserService = pcManageUserService;
    }

    @ApiOperation("分页查询")
    @GetMapping("/page")
    public IPage<PcManageUser> findAllByPage(@RequestParam(defaultValue = "1") int currPage,@RequestParam(defaultValue = "3") int pageSize){
        return pcManageUserService.page(new Page<>(currPage,pageSize));
    }
}

