package com.zwh.plan.demo.highio.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;

/**
 * @ClassName BaseMapper
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/4/27 18:21
 * @Version 1.0
 */
public class BaseMapper extends SqlSessionDaoSupport {

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
