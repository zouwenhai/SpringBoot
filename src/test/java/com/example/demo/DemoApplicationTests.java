package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {



	public static void main(String[] args){

		String tel_reg="^((13[0-9])|(15[^4])|(18[0-9])|(17[0-8])|(147,145))\\d{8}$";

		System.out.println(Pattern.matches(tel_reg,"17600000000"));

	}

}
