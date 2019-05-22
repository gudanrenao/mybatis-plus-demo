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
 * 随访-任务-模板节点任务
 * </p>
 *
 * @author zw
 * @since 2019-05-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fup_template_node_job")
@ApiModel(value="TemplateNodeJobEntity对象", description="随访-任务-模板节点任务")
public class TemplateNodeJobEntity implements Serializable {

private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "ID;")
    private String id;

    @ApiModelProperty(value = "租户ID;")
    private String tenantId;

    @ApiModelProperty(value = "机构ID;用户的org_id")
    private String orgId;

    @ApiModelProperty(value = "模版任务ID;fup_template_job的id")
    private String templateJobId;

    @ApiModelProperty(value = "模版ID;fup_template的id")
    private String templateId;

    @ApiModelProperty(value = "模板节点ID;fup_template_node的id")
    private String templateNodeId;

    @ApiModelProperty(value = "名称;")
    private String name;

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
