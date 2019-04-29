package com.zwh.plan.demo.highio.entity;

import com.zwh.plan.entity.Entity;

import java.util.Date;

/**
 * @ClassName Train
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/4/27 17:00
 * @Version 1.0
 */
public class Train extends Entity {


    private String trainNum;


    private Integer count;


    private Date date;





    public String getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
