package com.zhangwenit.mybatis.plus.demo.job.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 随访-任务-模板节点素材任务
 * </p>
 *
 * @author zw
 * @since 2019-05-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fup_template_node_material_job")
@ApiModel(value="TemplateNodeMaterialJobEntity对象", description="随访-任务-模板节点素材任务")
public class TemplateNodeMaterialJobEntity implements Serializable {

private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "ID;")
    private String id;

    @ApiModelProperty(value = "租户ID;")
    private String tenantId;

    @ApiModelProperty(value = "机构ID;用户的org_id")
    private String orgId;

    @ApiModelProperty(value = "模版任务ID;fup_template_job的id")
    private String templateJobId;

    @ApiModelProperty(value = "阶段任务ID;fup_template_node_job的id")
    private String templateNodeJobId;

    @ApiModelProperty(value = "模版ID;fup_template的id")
    private String templateId;

    @ApiModelProperty(value = "模板节点ID;fup_template_node的id")
    private String templateNodeId;

    @ApiModelProperty(value = "素材id;素材子表的ID")
    private String materialId;

    @ApiModelProperty(value = "素材分类;1问卷2微信3短信4图文5自定义")
    private Integer materialCategoryId;

    @ApiModelProperty(value = "任务类型;1提醒2执行 只有执行方式execute_type_id是医护人员的并且有提醒时间的阶段任务中的素材任务才会生成两个待执行的任务，一个用来提醒，一个用来执行")
    private Integer typeId;

    @ApiModelProperty(value = "执行方式;代码0空1医护人员2患者 问卷的时候选择1医护人员2患者，自定义1医护人员，其他空")
    private Integer executeTypeId;

    @ApiModelProperty(value = "名称;")
    private String name;

    @ApiModelProperty(value = "内容;根据不同的素材分类生成的内容")
    private String content;

    @ApiModelProperty(value = "执行时间;调用消息平台的时间或者开始执行的时间")
    private Date executeTime;

    @ApiModelProperty(value = "执行结果;代码，0失败1成功2执行中")
    private Integer executeResultId;

    @ApiModelProperty(value = "执行记录;JSON结构，执行人，执行时间，执行结果")
    private String executeRecord;

    @ApiModelProperty(value = "发送方式;调用消息平台后更新，或者主动设置")
    private String sendTypeId;

    @ApiModelProperty(value = "消息平台查询发送结果标示;调用第三方平台后更新，或者主动设置")
    private String sendResultMark;

    @ApiModelProperty(value = "发送时间;")
    private Date sendTime;

    @ApiModelProperty(value = "发送结果;调用第三方平台后更新，或者主动设置")
    private String sendResult;

    @ApiModelProperty(value = "状态;代码，0禁用1启用")
    private Integer status;

    @ApiModelProperty(value = "是否删除;代码，0初始状态1删除")
    private Integer isDelete;

    @ApiModelProperty(value = "创建人ID;")
    private String creatorId;

    @ApiModelProperty(value = "创建人名称;")
    private String creatorName;

    @ApiModelProperty(value = "创建时间;")
    private Date createTime;

    @ApiModelProperty(value = "修改人ID;")
    private String modifyUserId;

    @ApiModelProperty(value = "修改人名称;")
    private String modifyUserName;

    @ApiModelProperty(value = "更新时间;")
    private Date modifyTime;


}
