package com.zhangwenit.mybatis.plus.demo.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 张磊-账号表
 * </p>
 *
 * @author zw
 * @since 2019-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("zl_pc_manage_user")
@ApiModel(value="PcManageUser对象", description="张磊-账号表")
public class PcManageUser implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String password;

    @ApiModelProperty(value = "账户类型 1=超级管理员  2=普通用户")
    private Integer type;

    @ApiModelProperty(value = "账户状态 1=正常  2=已冻结")
    private Integer state;

    /**
     * 逻辑删除@TableLogic，效果: 使用mp自带方法删除和查找都会附带逻辑删除功能 (自己写的xml不会)
     */
    @ApiModelProperty(value = "是否已删除 0=未删除  1=已删除")
    @TableLogic
    private Integer isDelete;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


}
