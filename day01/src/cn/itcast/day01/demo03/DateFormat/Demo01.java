package cn.itcast.day01.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* DateFormat类
*   作用:1.格式化
*       2.解析
*       抽象类,没有构造方法,需用子类SimpleDateFormat
*   成员方法:
*       String format(Date date);
*       Date parse(String source);
* SimpleDateFormat类:
*   SimpleDateFormat​(String pattern) 构造一个 SimpleDateFormat使用给定的模式和默认的
*   默认日期格式符号 FORMAT区域设置。
*       参数:
*           yyyy-MM-dd HH:mm:ss
*           yyyy年MM月dd日 HH时mm分ss秒
*       注意:表示模式的符号不能改变,是一个固定值
*            连接模式的连接符可随意使用
 * */
public class Demo01 {
    public static void main(String[] args) throws ParseException {
        show01();
        show02();
    }
    /*
    * Date parse(String source);
    * */
    private static void show02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2020-01-29 13:35:13");
        System.out.println(date);

    }

    /*
    * 日期-->字符串
    * */
    private static void show01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        System.out.println(format);

    }
}
