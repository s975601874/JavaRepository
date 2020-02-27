package cn.itcast.day01.demo04.Calendar;

import java.util.Calendar;

/*
*
*   java.util.Calendar:日历类
*   作用:
*       1.可以通过类中的方法获取对应的日历字段(年,月,日...)
*       2.可以通过类中的方法修改对应的日历字段
*       3.可以通过类中的方法对日历字段进行计算
*   抽象类,无法直接创建对象
*   提供了一个静态方法getInstance,返回的就是Calendar类的子类对象
*   注意:西方:0-11月 周日-周六
*        东方:1-12月 周一-周日
*
* */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
