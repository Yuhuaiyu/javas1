package cn.yuhuaiyu.type;

public class TyoeDemo1 {
    public static void main(String[] args) {
        // 目标： 掌握表达式的自动类型转换的规则
        byte a = 10;
        int b = 20;
        double c = 2.0;
        double rs = a + b + c;
        System.out.println(rs);

        double cs = rs - 1.2;
        System.out.println(cs);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }
}
