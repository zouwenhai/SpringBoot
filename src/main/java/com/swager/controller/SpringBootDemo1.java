package com.swager.controller;

import com.swager.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@Api(value = "测试Controller", tags = "测试类")
public class SpringBootDemo1 {

    @ApiOperation(value = "测试方法")
    @PostMapping("/helloSpringBoot")

    public String HelloSpring(@RequestBody @Valid UserDto userDto) {
        System.out.println("hello spring boot");
        return "hello spring boot";
    }

    @ApiOperation(value = "测试方法2")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "str2", value = "参数2", required = true),
            @ApiImplicitParam(name = "str1", value = "参数1", required = true)
    })
    @GetMapping("/helloSpringBoot2")
    @Valid
    public String HelloSpring(@NotNull(message = "str1不能为空") String str1, @NotNull(message = "str2不能为空") String str2) {
        System.out.println(str1);
        return "s";
    }

}
