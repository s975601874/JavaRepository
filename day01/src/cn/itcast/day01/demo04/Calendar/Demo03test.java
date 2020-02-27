package cn.itcast.day01.demo04.Calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 计算一个人出生了多少天
 * */
public class Demo03test {
    public static void main(String[] args) {
        /*
         * 获取出生年月日
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生的年月日");
        int birthYear = sc.nextInt();
        int birthMonth = sc.nextInt();
        int birthDay = sc.nextInt();
//        获取当前时间的毫秒值
        long nowSecond = System.currentTimeMillis();
//        设置日历为出生时间
        Calendar c = Calendar.getInstance();
        c.set(birthYear, birthMonth, birthDay);
//        把出生日历转化为出生日期
        Date birthTime = c.getTime();
//        获取出生日期的毫秒值
        long birthSecond = birthTime.getTime();
//        把当前日期的毫秒值与出生日期的毫秒值相减
        long distance = nowSecond - birthSecond;
//        把毫秒值转化为天数
        double day= distance /1000/3600/24;
        System.out.println(day);
    }
}
