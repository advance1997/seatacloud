package com.advance.cloud.utils;

import xyz.downgoon.snowflake.Snowflake;

/**
 * id生成器
 */
public class IdGenerator {

    public static long getId(){
        Snowflake snowflake = new Snowflake(2, 0);
        return snowflake.nextId();
    }

}
