package com.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.entities.Search;

public class MyUtils {
	
	private static Random random = new Random();
	private static Map<Integer, Search> searchs = new HashMap<>();
	private static Map<ServerEnum, SqlSessionFactory> sessionFactorys = new HashMap<>();
	
	public enum ServerEnum {
		development, development2
	}
	
	static {
		for (ServerEnum server : ServerEnum.values()) {
			try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");) {
				sessionFactorys.put(server, new SqlSessionFactoryBuilder().build(inputStream, server.name()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		searchs.put(0, new Search(500, 1824, "百度搜索"));
		searchs.put(1, new Search(501, 1825, "中国搜索"));
		searchs.put(2, new Search(502, 1826, "新浪新闻搜索"));
	}
	
	public static Search getSearch(){
		int nextInt = random.nextInt(3);
		Search search = searchs.get(nextInt);
		return search;
	}

	public static SqlSessionFactory getSqlSessionFactory(ServerEnum server) {
		return sessionFactorys.get(server);
	}
	
}
