package com.zwh.plan.demo.highio.mapper;

import com.zwh.plan.demo.highio.entity.TrainTicketEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface TrainTicketMapper {


    @Results({@Result(column = "f_id",property = "uniqueKey" ,jdbcType= JdbcType.INTEGER, id=true),
              @Result(column = "f_train_num",property = "number",jdbcType=JdbcType.VARCHAR),
              @Result(column = "f_ticket_count",property = "count" ,jdbcType= JdbcType.INTEGER)})
    @Select("select * from t_zwh_train_ticket where f_train_num=#{trainNumber}")
    TrainTicketEntity quertTicketCount(String trainNumber);



}
