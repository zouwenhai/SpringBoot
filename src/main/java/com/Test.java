package com;


import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Xpp3DomDriver;
import com.utils.XmlJsonUtil;
import com.zwh.Ab;
import lombok.Data;
import lombok.SneakyThrows;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/7/31 19:19
 * @Version 1.0
 */
public class Test {


    @org.junit.Test
    public void test() {
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 8, 6, 7);
        int size = list.size();
        if (size % 2 == 0) {
            List<Integer> subList = list.subList(0, size / 2);
        }


    }


    @org.junit.Test
    public void testXml() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<corpsms>\n" +
                "\t<transaction id=\"178057859\">\n" +
                "\t\t<status num=\"923101567888\" date=\"06-05-2021 09:01:44\">Successful</status>\n" +
                "\t</transaction>\n" +
                "</corpsms>";

        String xml2 = XmlJsonUtil.xml2JSON(xml);

        System.out.println(xml2);

    }


    @org.junit.Test
    public void test2Xml() throws IOException, JDOMException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<corpsms>\n" +
                "\t<transaction id=\"178057859\">\n" +
                "\t\t<status num=\"923101567888\" date=\"06-05-2021 09:01:44\">Successful</status>\n" +
                "\t</transaction>\n" +
                "\t<transaction id=\"178069674\">\n" +
                "\t\t<status num=\"923101567888\" date=\"06-05-2021 11:06:37\">Successful</status>\n" +
                "\t</transaction>\n" +
                "</corpsms>";
        InputStream is = new ByteArrayInputStream(xml.getBytes("utf-8"));
        SAXBuilder sb = new SAXBuilder();
        Document doc = sb.build(is);
        Element root = doc.getRootElement();
        List<Element> list = root.getChildren("transaction");
        for (int i = 0; i < list.size(); i++) {
            Element element = list.get(i);
            String id = element.getAttributeValue("id");
            System.out.println(id);
            Element status = element.getChild("status");
            String num = status.getAttributeValue("num");
            System.out.println(num);
            String date = status.getAttributeValue("date");
            System.out.println(date);
        }

    }


    @org.junit.Test
    public void test3() {

    /*    //相同的
        List<String> sameList = new ArrayList<>(16);

        //异常的
        List<String> exceptionList = new ArrayList<>();

        //excel
        List<String> excelList = new ArrayList<>();

        excelList.add("1");
        excelList.add("2");
        excelList.add("3");
//系统的
        List<String> systemList = Arrays.asList("1", "3", "4", "6", "7");


        excelList.forEach(e -> {
            if (!systemList.contains(e)) {
                systemList.add(e);
            } else {
                sameList.add(e);
            }

        });*/

        //相同的去比较其他参数
        List<Ab> excelList = new ArrayList<>();
        excelList.add(new Ab("1", 2, 0));
        excelList.add(new Ab("2", 3, 0));
        excelList.add(new Ab("3", 4, 0));
        List<Ab> systemList = new ArrayList<>();
        systemList.add(new Ab("4", 5, 1));
        systemList.add(new Ab("5", 6, 1));
        systemList.add(new Ab("6", 7, 1));
        systemList.add(new Ab("1", 3, 1));
        systemList.add(new Ab("2", 3, 1));
        Set<Ab> abSet = new TreeSet<>((o1, o2) -> o1.getId().compareTo(o2.getId()));
        abSet.addAll(systemList);
        abSet.addAll(excelList);
        List<Ab> result = new ArrayList<>();
        Iterator<Ab> iterator = abSet.iterator();
        while (iterator.hasNext()) {
            Ab e = iterator.next();
            for (Ab a : excelList) {
                if (e.getId().equals(a.getId()) && e.getType().equals(a.getType())) {
                    //说明是上传的excel数据
                    e.setErrorType(0);
                    result.add(e);
                    break;
                } else if (e.getId().equals(a.getId()) && !e.getType().equals(a.getType())) {
                    //相同id，进行属性比价拿到errorType
                    e.setErrorType(1);
                    result.add(e);
                    break;
                } else {
                    //是excel数据，系统没有
                    if (e.getType() == 0) {
                        e.setErrorType(2);
                        result.add(e);
                        break;
                    }
                    ///是系统数据，excel没有
                    else if (e.getType() == 1) {
                        e.setErrorType(3);
                        result.add(e);
                        break;
                    }

                }
            }
        }

        System.out.println("结束");

    }

    @org.junit.Test
    @SneakyThrows
    public void test4() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<response_to_browser>\n" +
                "    <response_id>    <response_text>Invalid API Password</response_text>\n" +
                "</response_id>\n" +
                "    <response_text1>Invalid API Password</response_text1>\n" +
                "</response_to_browser>";
        InputStream is = new ByteArrayInputStream(xml.getBytes("utf-8"));
        SAXBuilder sb = new SAXBuilder();
        Document doc = sb.build(is);
        Element root = doc.getRootElement();
        System.out.println(iterateElement(root));

    }

    private static JSONObject iterateElement(Element element) {
        List node = element.getChildren();
        Element et = null;
        JSONObject obj = new JSONObject();
        List list = null;
        for (int i = 0; i < node.size(); i++) {
            et = (Element) node.get(i);
            if (et.getTextTrim().equals("")) {
                obj.put(et.getName(), "");
                if (et.getChildren().size() == 0) {
                    continue;
                }
                obj.put(et.getName(), iterateElement(et));
            } else {
                obj.put(et.getName(), et.getTextTrim());
            }
        }
        return obj;
    }


    private static JSONObject iterateElement2(Element element) {
        List node = element.getChildren();
        Element et = null;
        JSONObject obj = new JSONObject();
        List list = null;
        for (int i = 0; i < node.size(); i++) {
            list = new LinkedList();
            et = (Element) node.get(i);
            if (et.getTextTrim().equals("")) {
                if (et.getChildren().size() == 0)
                    continue;
                if (obj.containsKey(et.getName())) {
                    list = (List) obj.get(et.getName());
                }
                list.add(iterateElement(et));
                obj.put(et.getName(), list);
            } else {
                if (obj.containsKey(et.getName())) {
                    list = (List) obj.get(et.getName());
                }
                list.add(et.getTextTrim());
                obj.put(et.getName(), list);
            }
        }
        return obj;
    }
}
