package com.swager;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




@ApiModel("请求参数")
public class UserDto {

    @ApiModelProperty("名字")  //参数Model对应属性的接口文档描述
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append("}");
        return sb.toString();
    }
}
