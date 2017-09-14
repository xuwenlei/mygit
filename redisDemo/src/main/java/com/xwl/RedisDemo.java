package com.xwl;

import redis.clients.jedis.Jedis;

public class RedisDemo {

	private final Jedis client = new Jedis("localhost");

	public static void main(String[] args) {
		RedisDemo redisDemo = new RedisDemo();
		redisDemo.client.flushAll();
		//		redisDemo.stringDemo();
		//		redisDemo.listDemo();
		redisDemo.setDemo();
	}

	public void listDemo() {
		client.lpush("list-one", "A");
		client.lpush("list-one", "B");
		client.lpush("list-one", "C");
		client.lpush("list-one", "D");
		client.lpush("list-one", "E");
		System.out.println("获取所有list-one存放的值：" + client.lrange("list-one", 0, -1));
		//根据list的位置截取list
		client.ltrim("list-one", 0, 3);
		System.out.println("获取所有list-one存放的值：" + client.lrange("list-one", 0, -1));
		//修改list指定位置的值
		client.lset("list-one", 0, "G");
		System.out.println("获取所有list-one存放的值：" + client.lrange("list-one", 0, -1));
		System.out.println("获取list-one内最左端的数据，并将其从list-one中移除：" + client.rpop("list-one"));

		client.flushAll();
	}

	public void setDemo() {

		client.sadd("set-one", "01");
		client.sadd("set-one", "02");
		client.sadd("set-one", "03");
		client.sadd("set-one", "04");
		client.sadd("set-one", "05");
		System.out.println("获取set-one中的所有值：" + client.smembers("set-one"));
		System.out.println("获取set-one中值的个数：" + client.scard("set-one"));
		System.out.println("获取set-one中的一个值，并将该值从set-one中移除：" + client.spop("set-one"));
		System.out.println("获取set-one中的所有值：" + client.smembers("set-one"));
		System.out.println("删除set-one中的指定值：" + client.srem("set-one", "02"));
		System.out.println("获取set-one中的所有值：" + client.smembers("set-one"));
	}

	public void stringDemo() {
		//
		client.set("stringKey01", "stringValue01");
		client.set("stringKey02", "stringValue02");
		client.set("stringKey03", "stringValue03");
		client.set("stringKey04", "stringValue04");
		client.set("stringKey05", "stringValue05");
		System.out.println("stringKey01的值为：  " + client.get("stringKey01"));
		System.out.println("判断是否存在stringKey05： " + client.exists("stringKey05"));
		System.out.println(" 输出所有的key值 ：" + client.keys("*"));
		//
		client.set("stringIntKey", "2");
		System.out.println("stringIntKey的值为：  " + client.get("stringIntKey"));
		//
		client.incr("stringIntKey");
		System.out.println("stringIntKey的值为：  " + client.get("stringIntKey"));
		//
		client.incrBy("stringIntKey", 5);
		System.out.println("stringIntKey的值为：  " + client.get("stringIntKey"));
		//
		client.decrBy("stringIntKey", 5);
		System.out.println("stringIntKey的值为：  " + client.get("stringIntKey"));
		//
		client.decr("stringIntKey");
		System.out.println("stringIntKey的值为：  " + client.get("stringIntKey"));
		client.flushAll();
	}

}