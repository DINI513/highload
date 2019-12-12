package com.packet.WebServiceTest.controller;


import redis.clients.jedis.Jedis;

public class Counter {
    private static int localCount = 0;
    private static Jedis jedis = new Jedis("172.17.0.1", 6379);
    //private static Jedis jedis = new Jedis("127.0.0.1", 6379);
    private static String count_Key = "count"; // key для счетчика в redis

    public static String getTotalCount(){
        String count = jedis.get(count_Key);
        return count == null ? "0" : count;
    }

    public static String incrTotalCount(){
        return jedis.incr(count_Key).toString();
    }

    public static String getlocalCount(){
        return String.valueOf(localCount);
    }

    public static String incrlocalCount(){
        localCount++;
        return getlocalCount();
    }
}
