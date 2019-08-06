package com.designmodel.template;

/**
 * @ClassName Cricket
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/6/4 17:57
 * @Version 1.0
 */
public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
