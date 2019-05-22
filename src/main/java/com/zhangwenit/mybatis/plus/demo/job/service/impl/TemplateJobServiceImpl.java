package com.zhangwenit.mybatis.plus.demo.job.service.impl;

import com.zhangwenit.mybatis.plus.demo.job.entity.TemplateJobEntity;
import com.zhangwenit.mybatis.plus.demo.job.mapper.TemplateJobMapper;
import com.zhangwenit.mybatis.plus.demo.job.service.ITemplateJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 随访-任务-模板任务 服务实现类
 * </p>
 *
 * @author zw
 * @since 2019-05-17
 */
@Service
public class TemplateJobServiceImpl extends ServiceImpl<TemplateJobMapper, TemplateJobEntity> implements ITemplateJobService {

}
