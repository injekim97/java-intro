package cond;

public class CondOp2 {

    public static void main(String[] args) {

        /* 삼항 연산자 : 조건, 참-표현식, 거짓-표현석 */

        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";

        System.out.println("age = " + age + " status = " + status);

    }
}