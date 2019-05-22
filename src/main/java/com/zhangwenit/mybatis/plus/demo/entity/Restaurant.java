package com.zhangwenit.mybatis.plus.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 张磊-饭店表
 * </p>
 *
 * @author zw
 * @since 2019-05-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("zl_restaurant")
@ApiModel(value="Restaurant对象", description="张磊-饭店表")
public class Restaurant implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "饭店名称")
    private String name;

    @ApiModelProperty(value = "账户状态 1=正常  2=已删除")
    private Integer state;

    @ApiModelProperty(value = "图片")
    private String picture;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


}
