package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.entities.AllNetworkTask;
import com.utils.MyUtils;
import com.utils.MyUtils.ServerEnum;

public class AllNetworkTaskDao {

	private SqlSessionFactory sqlSessionFactory = null;

	public AllNetworkTaskDao() {
	}

	public AllNetworkTaskDao(ServerEnum serverEnum) {
		sqlSessionFactory = MyUtils.getSqlSessionFactory(serverEnum);
	}

	public void save(AllNetworkTask allNetworkTask) {
		try (SqlSession openSession = sqlSessionFactory.openSession();) {
			AllNetworkTaskMapper mapper = openSession.getMapper(AllNetworkTaskMapper.class);
			mapper.save(allNetworkTask);
			openSession.commit();
		}
	}

	public List<AllNetworkTask> getAll() {
		try (SqlSession openSession = sqlSessionFactory.openSession();) {
			AllNetworkTaskMapper mapper = openSession.getMapper(AllNetworkTaskMapper.class);
			return mapper.getAll();
		}
	}
}
