package cond;

public class Switch1 {

    public static void main(String[] args) {

        /* switch 구조

           switch (조건식) {
               case value1:
                   // 조건식의 결과 값이 value1일 때 실행되는 코드
                   break;
               case value2:
                   // 조건식의 결과 값이 value2일 때 실행되는 코드
                   break;
               default:
                   // 조건식의 결과 값이 위의 어떤 값에도 해당하지 않을 때 실행되는 코드

         */

        /* 아래 if-else if 문은 switch 문으로 바꾸기 위한 예시코드 */

        // 1: 1000, 2: 2000, 3: 3000, -: 500
        int grade  = 1;
        int coupon = 0;

        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }

        System.out.println("발급 받은 쿠폰: " +  coupon);

    }
}