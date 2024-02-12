package operator;

public class Operator2 {

    public static void main(String[] args) {

        // 문자열 + 문자열 1
        String res1 = "hello " + "world";

        // 문자열 + 문자열 2
        String s1   = "apple" ;
        String s2   = "banana";
        String res2 = s1 + s2 ;

        // 문자열 + 숫자 1
        String res3 = "a + b = " + 10;    // Java에서 문자 + 숫자 일 경우 숫자를 문자로 바꿈 : "a + b = " + "10"

        // 문자열 + 숫자 2
        int num     = 20;
        String str  = "a + b = ";
        String res4 = str + num;          // Java에서 문자 + 숫자 일 경우 숫자를 문자로 바꿈 : "a + b = " + "20"
                                          // 즉, 자바에서 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

    }
}