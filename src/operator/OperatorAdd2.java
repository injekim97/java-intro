package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        // 전위 증감 연산자(++a) 사용 예
        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println("a = " + a);     // 2
        System.out.println("b = " + b);     // 2

        // 후위 증감 연산자(a++) 사용 예
        a = 1;
        b = 0;

        b = a++;     // b = 1 a = 2
        System.out.println("a = " + a);     // 2
        System.out.println("b = " + b);     // 2

    }
}
