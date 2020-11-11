package com.wlp.java;

import com.wlp.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wlp
 * @create 2020-11-11 16:16
 *
 * idea中代码模板所处的位置：settings - Editor - live Templates / Postfix Completion
 */
public class TeamplatesTest {
    public static final Customer cusr = new Customer();
    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello");
        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TeamplatesTest.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        
        //模板三：fori
        String[] arr = new String[]{"Tom", "Jerry" , "HanMeiMei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(124);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        if (list == null) {

        }

        if (list != null) {

        }





    }


}
