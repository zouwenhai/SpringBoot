package com.zwh.plan.demo.highio.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TrainMapper {

    Integer queryCountByNum(String trainNum);
}
