package cn.itcast.day01.demo06.StringBuilder;
/*
* 成员方法:
*   public StringBuilder append(任意类型):添加任意类型数据的字符串形式,并返回当前对象自身
*   底层源码:
*       public StringBuilder append(String str) {
            super.append(str);
            return this;
        }
        返回的是this,返回对象本身!
* */
public class Demo02 {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        //使用append方法
//        StringBuilder bu2 = bu1.append("aaa");
//        System.out.println(bu1);//aaa
//        System.out.println(bu2);//aaa
//        System.out.println(bu1 == bu2);//true  比较的是地址值
        bu1.append("abc");
        bu1.append(1);
        bu1.append(true);
        bu1.append('&');
        bu1.append(3.3);
        System.out.println(bu1);

        /*链式编程:
        *       根据方法的返回值,继续调用方法
        *       System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        * */
        bu1.append("abc").append(100).append(true).append(2.2).append('^');
        System.out.println(bu1);
        /*
        * 字符串拼接"a"+"b"+"c"
        * */
        bu1.append("a").append("b").append("c");

    }
}
