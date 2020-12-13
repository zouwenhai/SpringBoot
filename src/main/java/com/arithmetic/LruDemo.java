package com.arithmetic;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName LruDemo
 * @Description //TODO
 * @Author zouwenhai
 * @Date 2019/8/13 9:07
 * @Version 1.0
 */
public class LruDemo {


    @Test
    public void test() {

        Map<String, Integer> map = new LinkedHashMap();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
            System.out.println("master");
            System.out.println("master1");
        }


    }


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                if((nums[i]+nums[j])==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }


    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
