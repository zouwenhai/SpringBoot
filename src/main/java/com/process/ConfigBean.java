package com.process;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/9/26 11:21
 * @work //TODO
 */
@Configuration
public class ConfigBean {

    @Bean
    public ExecutorService getExecutorTools() {
        return Executors.newFixedThreadPool(8);
    }
}
