package cesting;

public class Cesting1 {

    public static void main(String[] args) {

        int intValue = 10;
        long longValue;
        double doubleValue;

        /* 작은 범위에서 큰 범위 대입은 자바 언어에서 허용함. 즉, 큰 그릇은 작은 그릇에 담긴 내용물을 담을 수 있음 */
        // 자동 형변환(묵시적 형변환)
        longValue   = intValue;                                  // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);      // int -> double

        doubleValue = 20000000000L;                              // long -> double
        System.out.println("doubleValue2 = " + doubleValue);

    }
}