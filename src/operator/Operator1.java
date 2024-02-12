package operator;

public class Operator1 {

    public static void main(String[] args) {

        int a = 5 , b = 2;

        int sum   = a + b;
        int diff  = a - b;
        int multi = a * b;
        int div   = a / b;
        int mod   = a % b;

        System.out.println("a + b = " + sum  );
        System.out.println("a - b = " + diff );
        System.out.println("a * b = " + multi);
        System.out.println("a / b = " + div  );  // int 형이기 때문에 소수점 생략 = 2.5 > 2가 출력됨
        System.out.println("a % b = " + mod  );

        /* 숫자는 0으로 나눌 수 없음
           int tc = 10 / 0; [error] : by zero at operator.Operator1.main(Operator1.java:22) */

    }
}