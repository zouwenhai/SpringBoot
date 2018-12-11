
package com.zwh.web.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootDemo1 {

    @RequestMapping(path = { "/helloSpringBoot" })
    public String HelloSpring() {

        System.out.println("hello spring boot");
        return "hello spring boot";
    }

}
