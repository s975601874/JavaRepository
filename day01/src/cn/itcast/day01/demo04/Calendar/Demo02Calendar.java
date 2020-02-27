package cn.itcast.day01.demo04.Calendar;

import java.util.Calendar;
import java.util.Date;

/*
*
*
* */
public class Demo02Calendar {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
        show05();
    }
    /*
    * void setTime(Date date) 把日期转换为日历
    * */
    private static void show05() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date(0L));
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    /*
    * public Date getTime() 把日历转换为Date日期
    * */
    private static void show04() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }

    /*
    * abstract void add​(int field, int amount) 根据日历的规则，将指定的时间量添加或减去给定的日历字段。
     * */
    private static void show03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,10);
        c.add(Calendar.MONTH,-3);
        c.add(Calendar.DAY_OF_MONTH,10);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
    /*
    * void set​(int field, int value) 将给定的日历字段设置为给定值。
      void set​(int year, int month, int date) 设置日历字段的值 YEAR ， MONTH和 DAY_OF_MONTH 。
    * */
    private static void show02() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,8888);
        c.set(Calendar.MONTH,8);
        c.set(Calendar.DAY_OF_MONTH,8);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"."+month+"."+day);
        //同时设置
        c.set(9999,9,9);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH);
        int day1 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year1+"."+month1+"."+day1);

    }
    /*
    * int get​(int field) 返回给定日历字段的值。
     * */
    private static void show01() {
        Calendar c = Calendar.getInstance();
        //1为YEAR字段对应的值
        //int year = c.get(1);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);

        int day = c.get(Calendar.DATE);
        System.out.println(day);
    }
}
