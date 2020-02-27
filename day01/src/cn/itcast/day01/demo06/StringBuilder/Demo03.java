package cn.itcast.day01.demo06.StringBuilder;
/*
*   String和StringBuilder相互转换
*       String--->StringBuilder:
*           使用带参构造:StringBuilder​(String str) 构造一个初始化为指定字符串内容的字符串构建器。
*       StringBuilder--->String:
*           使用成员方法:toString();
*
* */
public class Demo03 {
    public static void main(String[] args) {
        String s = "helloWorld";
        //String--->StringBuilder:
        StringBuilder bu = new StringBuilder(s);
        bu.reverse();//把bu中内容反转
        System.out.println(bu);
        //StringBuilder--->String:
        s = bu.toString();
        System.out.println(s);
    }
}
