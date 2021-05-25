package com.easyexcel;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.metadata.WriteSheet;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zouwenhai
 * @version v1.0.0
 * @Package : com.easyexcel
 * @Description EasyExcel工具类
 * @Create on : 2021/1/12 18:00
 **/
public class EasyExcelUtil {


    @Test
    public void test1() {
// 写法1
        String fileName = "D:\\".concat(System.currentTimeMillis() + ".xlsx");
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, DemoData.class).sheet("模板").doWrite(data());

    }


    private List<DemoData> data() {
        List<DemoData> list = new ArrayList<DemoData>();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setId(Long.valueOf(String.valueOf(i)));
            data.setName("sfdf");
            data.setPassword("sfd");
            list.add(data);
        }
        return list;
    }


}
