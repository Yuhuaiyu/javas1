package cn.yuhuaiyu.type;

public class Type {
    public static void main(String[] args) {
        //目标：理解自动类型转换
        byte a = 20;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        int age = 23;
        double code = age;
        System.out.println(code);

        char ch = 'a';
        int codes = ch;
        System.out.println(ch);
        System.out.println(code);
    }
}
