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
 * 随访-任务-模板任务
 * </p>
 *
 * @author zw
 * @since 2019-05-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fup_template_job")
@ApiModel(value="TemplateJobEntity对象", description="随访-任务-模板任务")
public class TemplateJobEntity implements Serializable {

private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "ID;")
    private String id;

    @ApiModelProperty(value = "租户ID;")
    private String tenantId;

    @ApiModelProperty(value = "机构ID;用户的org_id")
    private String orgId;

    @ApiModelProperty(value = "模版ID;fup_template的id")
    private String templateId;

    @ApiModelProperty(value = "名称;")
    private String name;

    @ApiModelProperty(value = "病人编号;")
    private String patientId;

    @ApiModelProperty(value = "病人名字;")
    private String patientName;

    @ApiModelProperty(value = "性别;代码，0不限1男2女")
    private Integer patientSexId;

    @ApiModelProperty(value = "年龄;年龄的毫秒数")
    private Long patientAge;

    @ApiModelProperty(value = "科室;代码，可多选，逗号分隔")
    private String patientDeptIds;

    @ApiModelProperty(value = "疾病;代码，可多选，逗号分隔")
    private String patientSicknessIds;

    @ApiModelProperty(value = "诊断时间;")
    private Date diagnosisTime;

    @ApiModelProperty(value = "责任人;")
    private String doctorId;

    @ApiModelProperty(value = "责任科室;代码，可多选，逗号分隔")
    private String deptId;

    @ApiModelProperty(value = "状态;代码，1待确认2待执行（已确认）3执行中4已完成5已过期6暂停7取消2，3，4，5，6，7都是已确认的分类")
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
