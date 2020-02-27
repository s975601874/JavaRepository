package cn.itcast.day01.demo07.BaoZhuangClass;

import java.util.ArrayList;

/*
*   在JDK1.5以后,装箱和拆箱可自动进行
*   基本数据类型与包装类之间自动转换
*
*
* */
public class Demo02 {
    public static void main(String[] args) {
        /*
        *   自动装箱
        *   相当于Integer in = new Integer(1);
        * */
        Integer in = 1;
        /*
         *   自动拆箱
         *      in是包装类,无法直接参与计算,必须先把包装类转化为基本类型再和1相加
         *      in.intValue()+1=2
         *   自动装箱
         *      in = 2
         * */
        in = in + 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱  list.add(new Integer(1));
        int i = list.get(0);//自动拆箱  int i = list.get(0).intValue();
    }
}
