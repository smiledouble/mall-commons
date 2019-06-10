package com.cxs.utils;

import java.util.Random;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/4/7 16:07
 */
public class AuthCodeUtil {

    private static Random random = new Random();

    public static String createCode(Integer num) {
        StringBuffer sb = new StringBuffer();
        while (num > 0) {
            int i = random.nextInt(10);
            sb.append(i);
            num--;
        }
        return sb.toString();

    }

    public static String getIncreStr(String num, int length) {
        int zeroNum = length - num.length();
        StringBuffer sb = new StringBuffer();
        while (zeroNum > 0) {
            sb.append("0");
            zeroNum--;
        }
        return sb + num;
    }


    public static void main(String[] args) {
//        String increStr = getIncreStr(2+"", 5);
//        System.out.println(increStr);
        System.out.println((Integer.valueOf(DateUtil.getWantedStr("yyMMddHHmm"))));

    }

}
