package cn.itcast.day01.demo05.System;

import java.util.Arrays;

/*
*static void arraycopy​(Object src, int srcPos, Object dest, int destPos, int length)
* 将指定源数组中的数组从指定位置开始复制到目标数组的指定位置。
    参数
    src - 源数组。
    srcPos - 源数组中的起始位置。(源数组的起始索引
    dest - 目标数组。
    destPos - 目标数据中的起始位置。
    length - 要复制的数组元素的数量。

* */
public class Demo02System {
    public static void main(String[] args) {
        int[] src = {1,2,3,4,5};
        int[] dest = new int[src.length];
        System.out.println(Arrays.toString(dest));
        //使用arraycopy方法,复制src前三个元素到dest中
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}
