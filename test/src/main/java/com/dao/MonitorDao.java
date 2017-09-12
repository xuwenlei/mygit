package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.entities.Monitor;
import com.utils.MybatisConfig;
import com.utils.MybatisConfig.ServerEnum;

public class MonitorDao {

	private SqlSessionFactory sqlSessionFactory = null;

	public MonitorDao() {
		// TODO Auto-generated constructor stub
	}

	public MonitorDao(ServerEnum serverEnum) {
		sqlSessionFactory = MybatisConfig.getSqlSessionFactory(serverEnum);
	}

	public List<Monitor> getAll() {
		try (SqlSession openSession = sqlSessionFactory.openSession();) {
			MonitorMapper mapper = openSession.getMapper(MonitorMapper.class);
			List<Monitor> list = mapper.getAll();
			return list;
		}
	}

}