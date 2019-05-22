package com.zhangwenit.mybatis.plus.demo;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @Description
 * @Author ZWen
 * @Date 2019/5/16 10:48 AM
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args)
    {
        Random random = new Random();
        System.out.println(UUID.randomUUID().toString());

        for (int i = 0;i<10;i++){
            System.out.println(random.nextInt(2));
        }
    }
}