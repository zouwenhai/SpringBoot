package com.designmodel.template;

/**
 * @ClassName Football
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/6/4 17:58
 * @Version 1.0
 */
public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("football game is Initialized");

    }

    @Override
    void startPlay() {
        System.out.println("football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("football Game Finished!");
    }
}
