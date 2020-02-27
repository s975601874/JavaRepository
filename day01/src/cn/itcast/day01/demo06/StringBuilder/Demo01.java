package cn.itcast.day01.demo06.StringBuilder;
/*
* StringBuilder类
* java.lang.StringBuilder
* 多线程缓冲区,StringBuffer为单线程缓冲区
* 字符串缓冲区支持可变的字符串
* 底层源码:
*   byte[] value = new byte[capacity];  capacity:初始容量为默认16
*   没有被final修饰,值可以被改变
* StringBuilder在内存中操作的始终是一个数组
* 占用内存少,效率高
*
* 构造方法:
*   StringBuilder() 构造一个字符串构建器，其中不包含任何字符，初始容量为16个字符。
*   StringBuilder​(String str) 构造一个初始化为指定字符串内容的字符串构建器。
*
 * */
public class Demo01 {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);//底层数组中没有内容
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);//存储了abc

        /*
        * 成员方法:int length() 返回长度（字符数）。
         * */
        System.out.println(bu1.length());
        System.out.println(bu2.length());
        /*
        * 成员方法:int capacity() 返回当前容量。
         * */
        System.out.println(bu1.capacity());
        System.out.println(bu2.capacity());
    }
}
