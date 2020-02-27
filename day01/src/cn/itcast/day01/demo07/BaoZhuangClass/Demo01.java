package cn.itcast.day01.demo07.BaoZhuangClass;
/*
* 基本数据类型:
*   四类八种:
*       byte    short   int     long    float   double  boolean     char
*   包装类:java.lang中
 *      Byte    Short   Integer Long    Float   Double  Boolean     Character
 *
*
* */
public class Demo01 {
    public static void main(String[] args) {
        /*
        * 装箱:把基本类型数据,转化为包装类
        *   1.包装类的构造方法
        *       Integer​(int value)
                Integer​(String s)
            2.包装类的静态方法
                static Integer valueOf​(int i) 返回表示指定的 int值的 Integer实例。
                static Integer valueOf​(String s) 返回一个 Integer物体保持在指定的值 String 。
            注意:
                参数:String s 传递字符串的基本类型,传递其他类型会抛出异常"1"正确 "a"异常
        * 拆箱:在包装类中,取出基本类型数据
        *       int intValue() 返回此值 Integer为 int 。
        * */
//        装箱:把基本类型数据,转化为包装类
        Integer integer1 = new Integer(1);
        System.out.println(integer1);//重写了toString方法
        Integer integer2 = new Integer("1");
        //Integer integer3 = new Integer("a");//异常
        //System.out.println(integer3);
        System.out.println(integer2);

        Integer integer3 = Integer.valueOf(1);
        System.out.println(integer3);
        Integer integer4 = Integer.valueOf("1");
        System.out.println(integer4);
//      拆箱:在包装类中,取出基本类型数据
        int i = integer1.intValue();
        System.out.println(i);
    }
}
