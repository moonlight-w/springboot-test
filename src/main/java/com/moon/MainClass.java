package com.moon;

import sun.applet.Main;

import java.sql.SQLOutput;
import java.util.*;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author wei
 * @create 2020/5/13
 * @since 1.0.0
 */
public class MainClass {
    public static void main(String[] args) {
        int[]  arr = {3,5,3,2,2,2,5,5,5,9};
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int n : arr ){
            if(!map.containsKey(n))
                map.put(n,1);
            else
                map.put(n,map.get(n) + 1);
        }
        List< Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        Collections.sort(list,(o1,o2)->{
            return o2.getValue() - o1.getValue();
        });
        list.stream().forEach(System.out::println);
    }

}