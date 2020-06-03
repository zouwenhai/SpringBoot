package com.josn;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @ClassName JsonFile
 * @Description json数据解析
 * @Author zouwenhai
 * @Date 2019/9/8 20:55
 * @Version 1.0
 */
public class JsonFile {



    @Test
    public void test1(){

        String str="{\"biz_data\":\"{\\\"batchno\\\":\\\"190830007793\\\",\\\"callcontent\\\":[{\\\"atext\\\":\\\"喂！您好，我是微品分期的客服专员，请问您是高瞻吗？\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":1},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"那打多少岁啊\\\",\\\"sort\\\":2},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":3},{\\\"atext\\\":\\\"您好，高瞻您在我司办理的分期贷款已经到期了，本月应还金额为四百点零七一元元，为避免您的信用记录产生逾期，从而给生活带来诸多不便，还请您及时处理！\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":4},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"他们提前吗\\\",\\\"sort\\\":5},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":6},{\\\"atext\\\":\\\"实在不好意思，刚才没听清楚，您再说一下\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":7},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":8},{\\\"atext\\\":\\\"您好，您还在么？\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":9},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":10},{\\\"atext\\\":\\\"不好意思，我这里信号好像不好，请尽快处理您的逾期欠款，若有疑问请致电我司客服，感谢您的接听，再见\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":11}],\\\"callstatus\\\":\\\"answered\\\",\\\"callstatusdesc\\\":\\\"接通\\\",\\\"calltime\\\":\\\"2019-08-30 17:50:24\\\",\\\"extend\\\":\\\"[{\\\\\\\"key\\\\\\\":\\\\\\\"productname\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"有米分期\\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"lateramount\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"400.71\\\\\\\"}]\\\",\\\"groupcode\\\":\\\"connect\\\",\\\"groupdesc\\\":\\\"接通\\\",\\\"intent\\\":\\\"G\\\",\\\"orderNo\\\":\\\"\\\",\\\"phone\\\":\\\"17621580471\\\",\\\"talktime\\\":\\\"00:00:50\\\",\\\"uuid\\\":\\\"ed1c5c35-cffe-41ae-a7fc-150081977ba9\\\",\\\"wordstemplateid\\\":11174,\\\"wordstemplatename\\\":\\\"微品分期\\\"}\",\"notify_id\":\"1f68cf9ac3a748f9a93e5dc5accf272c\",\"notify_time\":\"2019-08-30 17:52:00\",\"sign\":\"bf0f2a10de97a80188c6ba31bc605b88\"}";

/*
        CallRecordBackVo callRecordBackVo  = JSONObject.parseObject(str,CallRecordBackVo.class);
*/
        JSONObject jsonstr = JSONObject.parseObject(str);
        String bizData = jsonstr.getString("biz_data");
        CallRecordVo callRecordVo = JSONObject.parseObject(bizData,CallRecordVo.class);
        CallRecordBackVo callRecordBackVo = new CallRecordBackVo();
        callRecordBackVo.setBiz_data(callRecordVo);
        callRecordBackVo.setNotify_id("1f68cf9ac3a748f9a93e5dc5accf272c");
        callRecordBackVo.setNotify_time("2019-08-30 17:52:00");
        callRecordBackVo.setSign("bf0f2a10de97a80188c6ba31bc605b88");
        System.out.println(JSONObject.toJSONString(callRecordBackVo));
        System.out.println(bizData);
        System.out.println(jsonstr);
    }


    /**
     * JSON对象和JSON字符串区别
     */
    @Test
    public void test2(){
        //该字符串的biz_data是一个json字符串，所以在构建对象时不能用新的JAVA对象来构建，只能用字符串(String)来接收。
        String jsonStr="{\"biz_data\":\"{\\\"batchno\\\":\\\"190830007793\\\",\\\"callcontent\\\":[{\\\"atext\\\":\\\"喂！您好，我是微品分期的客服专员，请问您是高瞻吗？\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":1},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"那打多少岁啊\\\",\\\"sort\\\":2},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":3},{\\\"atext\\\":\\\"您好，高瞻您在我司办理的分期贷款已经到期了，本月应还金额为四百点零七一元元，为避免您的信用记录产生逾期，从而给生活带来诸多不便，还请您及时处理！\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":4},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"他们提前吗\\\",\\\"sort\\\":5},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":6},{\\\"atext\\\":\\\"实在不好意思，刚才没听清楚，您再说一下\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":7},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":8},{\\\"atext\\\":\\\"您好，您还在么？\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":9},{\\\"atext\\\":\\\"\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":10},{\\\"atext\\\":\\\"不好意思，我这里信号好像不好，请尽快处理您的逾期欠款，若有疑问请致电我司客服，感谢您的接听，再见\\\",\\\"btext\\\":\\\"\\\",\\\"sort\\\":11}],\\\"callstatus\\\":\\\"answered\\\",\\\"callstatusdesc\\\":\\\"接通\\\",\\\"calltime\\\":\\\"2019-08-30 17:50:24\\\",\\\"extend\\\":\\\"[{\\\\\\\"key\\\\\\\":\\\\\\\"productname\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"有米分期\\\\\\\"},{\\\\\\\"key\\\\\\\":\\\\\\\"lateramount\\\\\\\",\\\\\\\"value\\\\\\\":\\\\\\\"400.71\\\\\\\"}]\\\",\\\"groupcode\\\":\\\"connect\\\",\\\"groupdesc\\\":\\\"接通\\\",\\\"intent\\\":\\\"G\\\",\\\"orderNo\\\":\\\"\\\",\\\"phone\\\":\\\"17621580471\\\",\\\"talktime\\\":\\\"00:00:50\\\",\\\"uuid\\\":\\\"ed1c5c35-cffe-41ae-a7fc-150081977ba9\\\",\\\"wordstemplateid\\\":11174,\\\"wordstemplatename\\\":\\\"微品分期\\\"}\",\"notify_id\":\"1f68cf9ac3a748f9a93e5dc5accf272c\",\"notify_time\":\"2019-08-30 17:52:00\",\"sign\":\"bf0f2a10de97a80188c6ba31bc605b88\"}";

        //这个字符串biz_data就是一个json对象，可以用对象来接收。
        String jsonStr2="{\"biz_data\":{\"batchNo\":\"190830007793\",\"callContent\":[{\"atext\":\"喂！您好，我是微品分期的客服专员，请问您是高瞻吗？\",\"btext\":\"\",\"sort\":1},{\"atext\":\"\",\"btext\":\"那打多少岁啊\",\"sort\":2},{\"atext\":\"\",\"btext\":\"\",\"sort\":3},{\"atext\":\"您好，高瞻您在我司办理的分期贷款已经到期了，本月应还金额为四百点零七一元元，为避免您的信用记录产生逾期，从而给生活带来诸多不便，还请您及时处理！\",\"btext\":\"\",\"sort\":4},{\"atext\":\"\",\"btext\":\"他们提前吗\",\"sort\":5},{\"atext\":\"\",\"btext\":\"\",\"sort\":6},{\"atext\":\"实在不好意思，刚才没听清楚，您再说一下\",\"btext\":\"\",\"sort\":7},{\"atext\":\"\",\"btext\":\"\",\"sort\":8},{\"atext\":\"您好，您还在么？\",\"btext\":\"\",\"sort\":9},{\"atext\":\"\",\"btext\":\"\",\"sort\":10},{\"atext\":\"不好意思，我这里信号好像不好，请尽快处理您的逾期欠款，若有疑问请致电我司客服，感谢您的接听，再见\",\"btext\":\"\",\"sort\":11}],\"callStatus\":\"answered\",\"callStatusDesc\":\"接通\",\"callTime\":\"2019-08-30 17:50:24\",\"extend\":\"[{\\\"key\\\":\\\"productname\\\",\\\"value\\\":\\\"有米分期\\\"},{\\\"key\\\":\\\"lateramount\\\",\\\"value\\\":\\\"400.71\\\"}]\",\"groupCode\":\"connect\",\"groupDesc\":\"接通\",\"intent\":\"G\",\"orderNo\":\"\",\"phone\":\"17621580471\",\"talkTime\":\"00:00:50\",\"uuId\":\"ed1c5c35-cffe-41ae-a7fc-150081977ba9\",\"wordsTemplateId\":11174,\"wordsTemplatename\":\"微品分期\"},\"notify_id\":\"1f68cf9ac3a748f9a93e5dc5accf272c\",\"notify_time\":\"2019-08-30 17:52:00\",\"sign\":\"bf0f2a10de97a80188c6ba31bc605b88\"}";

    }
}
