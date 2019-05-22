package com.zhangwenit.mybatis.plus.demo.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 小程序用户信息表
 * </p>
 *
 * @author zw
 * @since 2019-05-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("zl_third_user")
@ApiModel(value = "ThirdUser对象", description = "小程序用户信息表")
public class ThirdUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "小程序openId")
    private String miniOpenId;

    @ApiModelProperty(value = "公众号openId")
    private String publicOpenId;

    @ApiModelProperty(value = "开放平台unionId")
    private String unionId;

    @ApiModelProperty(value = "状态：1=正常；2=注销")
    private Integer state;

    @ApiModelProperty(value = "所在省")
    private String provinceName;

    @ApiModelProperty(value = "所在市")
    private String cityName;

    @ApiModelProperty(value = "用户手机号")
    private String mobile;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "用户头像")
    private String headImg;

    @ApiModelProperty(value = "最后一次登录时间")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty(value = "注册时间")
    private LocalDateTime createTime;

    /**
     * 自动填充
     */
    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "是否以被删除，1=已删除，0=未删除")
    private Integer isDelete;

    @Version
    @ApiModelProperty(value = "乐观锁")
    @JsonIgnore
    private Integer version;

}
