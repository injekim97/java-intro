package loop;

public class For1 {

    public static void main(String[] args) {

        /* for loop 구조

        for (1.초기식; 2.조건식; 4.증감식) {
            3.코드
        }

        1. 초기식 : 최초 실행
        2. 조건식 검증(참이면 3.코드 실행 후 4. 증감식 실행)
        3. 다시 2.조건식을 검증(반복)                        */

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

    }
}