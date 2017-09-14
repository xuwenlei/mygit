package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.entities.SpecialDomain;
import com.utils.MyUtils;

public class SpecialDao {
    private final SqlSessionFactory sqlSessionFactory;

    public SpecialDao(MyUtils.ServerEnum server) {
        try {
            sqlSessionFactory = MyUtils.getSqlSessionFactory(server);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
    public List<SpecialDomain> getSpecial() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession();) {
            SpecialMapper specialMapper = sqlSession.getMapper(SpecialMapper.class);
            return specialMapper.getSpecial();
        }
    }
}