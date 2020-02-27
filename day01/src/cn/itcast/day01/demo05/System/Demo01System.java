package cn.itcast.day01.demo05.System;
/*
* 和Math一样,不能创建对象
* java.lang.System:系统类
*   System类包含一些和系统相关的方法,是一个工具类,里面的方法都是静态的,可通过类名直接调用.
* */
public class Demo01System {
    public static void main(String[] args) {
        /*
        * static long currentTimeMillis() 以毫秒为单位返回当前时间。
        * 此方法相当于Date类的getTime方法
         * */
        long s = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        //测试程序效率
        System.out.println(e-s);
    }
}
