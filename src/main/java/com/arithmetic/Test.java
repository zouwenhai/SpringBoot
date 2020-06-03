package com.arithmetic;

import java.util.*;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/3/22 15:53
 * @Version 1.0
 */
public class Test {


    public void test() {

        Node<Integer> a = new Node<>(1, null);
        a.setVal(1);
        Node<Integer> b = new Node<>(2, null);
        b.setVal(2);
        Node<Integer> c = new Node<>(3, null);
        a.setNext(b);
        b.setNext(c);

    }


    @org.junit.Test
    public void test2() {
        String s = "safasfsaf";
        s.length();
        System.out.println(s.substring(0, 1));
        System.out.println(s);
        System.out.println(s.substring(3));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {

        int size = s.length();
        int result = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (s.substring(i, i + 1).equals(s.substring(j, j + 1))) {
                    result = j;
                    return result;
                }
            }
        }
        return result;
    }


    /**
     * 找出一个字符串中最长的子字符串长度
     */

    @org.junit.Test
    public void test5() {

        String s = "yrlxqqainrpsictjfyomklhtgnvhcxwaqkxhazrpthjdlcmraadnnmiuaebedzeujedlfudadmdprpgrrlgfypbaveey";
        int size = s.length();
        int num = (size + 1) * size / 2;
        List<String> result = new ArrayList();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j <= size; j++) {
                String str = s.substring(i, j);
                result.add(str);
            }
        }



        //去重公共方法
        Map<String, List<String>> map = new HashMap<>();
        result.forEach(e -> {
            List<String> simple = new ArrayList<>();
            for (int v = 0; v < e.length(); v++) {
                simple.add(e.substring(v, v + 1));
            }
            map.put(e, simple);
        });
        //去掉重复

        Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            boolean flag = false;
            Map.Entry<String, List<String>> entry = iterator.next();
            String k = entry.getKey();
            List<String> v = entry.getValue();
            if (v.size() > 1) {
                for (int m = 0; m < v.size() - 1; m++) {
                    for (int n = m + 1; n < v.size(); n++) {
                        if (v.get(m).equals(v.get(n))) {
                            iterator.remove();
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            }
        }
        List<Integer> shuzi = new ArrayList<>();
        //找出长度最大的
        map.forEach((k, v) -> {
            shuzi.add(v.size());
        });
        Integer[] maxShuzi = shuzi.toArray(new Integer[shuzi.size()]);
        for (int i = 0; i < maxShuzi.length; i++) {
            for (int j = i + 1; j < maxShuzi.length; j++) {
                if (maxShuzi[i] < maxShuzi[j]) {
                    int temp = maxShuzi[i];
                    maxShuzi[i] = maxShuzi[j];
                    maxShuzi[j] = maxShuzi[i];
                }
            }
        }

        System.out.println(maxShuzi[0]);

    }



    public int lengthOfLongestSubstring2(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }




    public int findRepeatNumber(int[] nums) {

        int l = nums.length;
        int index=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(nums[i]==nums[j]){
                    index=j;
                    break;
                }
            }
        }
        return nums[index];
    }



    @org.junit.Test
    public void test6(){
        String s="asffsfd";
        System.out.println(lengthOfLongestSubstring2(s));
        int[] nums={0, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
       System.out.println( findRepeatNumber(nums));
    }

}

