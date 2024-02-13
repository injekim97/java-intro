package operator;

public class Comp1 {

    public static void main(String[] args) {

        /* 숫자 비교는 비교연산자(==, !=, >, <, >=, <=)를 사용하면 된다. */
        int a       = 2;
        int b       = 3;
        boolean res = a == b;

        System.out.println(a == b);             // false
        System.out.println(a != b);             // true
        System.out.println(a > b);              // false
        System.out.println(a < b);              // true
        System.out.println(a >= b);             // false
        System.out.println(a <= b);             // true
        System.out.println("res = " + res);     // false

    }
}