package com.swager.controller;

import com.swager.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "测试Controller" , tags = "测试类")
public class SpringBootDemo1 {


    @ApiOperation(value = "测试方法")
    @PostMapping("/helloSpringBoot")
    public String HelloSpring(@RequestBody UserDto userDto) {
        System.out.println("hello spring boot");
        return "hello spring boot";
    }

}
