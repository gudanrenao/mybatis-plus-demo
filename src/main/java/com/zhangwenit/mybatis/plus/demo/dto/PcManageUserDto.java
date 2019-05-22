package com.zhangwenit.mybatis.plus.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/5/16 12:10 PM
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
public class PcManageUserDto {

    private Long id;

    private String name;

    private Integer type;

    public PcManageUserDto(Map<String,Object> map) {
        this.id = (Long) map.get("id");
        this.name = (String) map.get("name");
        this.type = (Integer) map.get("type");
    }
}