package cn.itcast.day01.demo01.Object;
/*
* java.lang.Object类
*  特点:是所有类的父类,任何类都直接或者间接继承了Object
*       任何一个类都可以使用Object类中的方法
* toString方法
*   public String toString() {
        return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
    }
    hashCode():获取一个系统随机给出的十进制整数
    Integer.toHexString():把十进制的整数转换为十六进制
* */
public class Demo {
    public static void main(String[] args) {
        Person p = new Person("AAA", 18);
        String s = p.toString();
        System.out.println(s);
        //直接打印对象的名字,就是调用toString方法
        System.out.println(p);
    }

}
