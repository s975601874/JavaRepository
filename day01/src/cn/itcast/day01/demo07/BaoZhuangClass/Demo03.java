package cn.itcast.day01.demo07.BaoZhuangClass;
/*
* 基本数据类型与字符串类型之间转换
*       基本数据类型-->String类型
*           1.基本数据类型+"":工作中常用
*           2.包装类中toString方法:
*               static String toString​(int i) 返回表示指定整数的 String对象。
*           3.String类中的valueOf
*               static String valueOf​(int i) 返回int整数的字符串表示形式。
 *       String类型-->基本数据类型
 *          1.包装类构造方法(很少用)
 *          2.包装类的parseXXX
 *              Integer:int parseInt("字符串的整数");
 *              Double:double parseDouble("字符串的小数");
*
* */
public class Demo03 {
    public static void main(String[] args) {
//        基本数据类型-->String类型
        int a = 10;
        String s1 = a+"";
        System.out.println(s1+100);//10100

        String s2 = Integer.toString(10);
        System.out.println(s2+100);//10100

        String s3 = String.valueOf(a);
        System.out.println(s3+100);//10100

//        String类型-->基本数据类型
        int i = Integer.parseInt("10");
        System.out.println(i+100);//110
        boolean aTrue = Boolean.parseBoolean("true");
        System.out.println(aTrue);
    }
}
