package com.zhangwenit.mybatis.plus.demo.service.impl;

import com.zhangwenit.mybatis.plus.demo.entity.ThirdUser;
import com.zhangwenit.mybatis.plus.demo.mapper.ThirdUserMapper;
import com.zhangwenit.mybatis.plus.demo.service.IThirdUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 小程序用户信息表 服务实现类
 * </p>
 *
 * @author zw
 * @since 2019-05-15
 */
@Service
public class ThirdUserServiceImpl extends ServiceImpl<ThirdUserMapper, ThirdUser> implements IThirdUserService {

}
