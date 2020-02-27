package cn.itcast.day01.deme02.date;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        show01();
        show02();
    }
    /*
    * Date(long date):把毫秒转换成日期
    * 参数:
    *   long date:毫秒值
    * 注意:
    *   1.涉及时间与日期相关的类中使用的long参数都是毫秒
    *   2.时间原点:
    *       英国:1970年1月1日 00:00:00(0毫秒)
    *       中国:1970年1月1日 08:00:00(0毫秒)
    *
    *
    * */
    private static void show02() {
        Date date = new Date(0L);
        System.out.println(date);
    }

    /*
    * CST:中国标准时间
    * 获取当前时间Date();
    * */
    private static void show01() {
        Date date = new Date();
        System.out.println(date);
    }
}
