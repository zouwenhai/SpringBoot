package com.designpattern.structure.adapter;

/**
 * @ClassName AdapterPlayMovie
 * @Description 适配器模式
 * @Author zouwenhai
 * @Date 2019/5/13 23:50
 * @Version 1.0
 */
public class AdapterPlayMovie extends PlayMp4 implements PlayMovie {

    @Override
    public void playMovie() {
        super.playMp4();
    }
}
