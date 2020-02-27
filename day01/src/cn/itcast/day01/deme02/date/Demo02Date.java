package cn.itcast.day01.deme02.date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        show01();
        show02();
    }
    /*
    * setTime(long time)
    * 毫秒转换成日期,此方法相当于Date类的带参构造
    * */
    private static void show02() {
        Date date = new Date();
        date.setTime(0L);
        System.out.println(date);
    }
    /*
    * getTime();
    * */
    private static void show01() {
        Date date = new Date();
//        从时间原点到当前时间的毫秒值
        long time = date.getTime();
        System.out.println(time);
    }
}
