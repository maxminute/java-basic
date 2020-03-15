package com.javaooandarrays.test;

public class TestArrays {
    public static void main(String[] args) {
        // testArrayCopy01();
        // testArrayCopy02(new String[1], 1);
        testArrayCopy02();
    }

    public static void testArrayCopy01() {
        String[] s = { "阿里", "腾讯", "京东", "搜狐", "网易" };
        String[] sBak = new String[6];
        System.arraycopy(s, 0, sBak, 0, s.length);
        for (int i = 0; i < sBak.length; i++) {
            System.out.println(sBak[i]);
        }
    }

    // 删除某个元素本质也是数组的拷贝
    public static void testArrayCopy02(String[] a, int index) {
        String[] s = { "阿里", "腾讯", "京东", "搜狐", "网易" };
        System.arraycopy(s, 3, s, 2, s.length - 3);
        s[s.length - 1] = null;
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    // 插入某个元素
    public static void testArrayCopy02() {
        String[] s = { "阿里", "腾讯", "京东", "搜狐", "网易" };
        String[] sBak = extendRange(s);
        String v = "FaceBook"; // 将Facebook插入到京东前面
        System.arraycopy(sBak, 2, sBak, 3, s.length - 3 + 1);
        sBak[2] = v;
        s = sBak;
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static String[] extendRange(String[] s) {
        int newLength = s.length + 10;
        String[] newS = new String[newLength];
        System.arraycopy(s, 0, newS, 0, s.length);
        return newS;
    }
}
