package com.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author zouwenhai
 * @version v1.0.0
 * @Package : com.easyexcel
 * @Description
 * @Create on : 2021/1/12 18:18
 **/
@Data
public class DemoData {


    @ExcelProperty(index = 0, value = "id")
    private Long id;

    @ExcelProperty(index = 1, value = "用户名")
    private String name;

    @ExcelProperty(index = 2, value = "密码")
    private String password;
}
