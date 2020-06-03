package com.designpattern.behavior.template;

/**
 * @ClassName Game
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/6/4 17:39
 * @Version 1.0
 */
public abstract class Game {


    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();


    /**
     * 模板方法
     */
    public final void play() {
        //游戏初始化
        initialize();
        //开始玩游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}
