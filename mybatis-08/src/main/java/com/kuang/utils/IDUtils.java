package com.kuang.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class IDUtils {
    //测试生成随机的id
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDUtils.getId());
    }
}
