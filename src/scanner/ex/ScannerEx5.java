package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = input.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = input.nextInt();

        // num1이 num2 보다 큰 경우, 두 숫자를 교환합니다.
        if (num1 > num2) {

            int temp = num1;  // temp 에 num1 값 삽입
            num1 = num2;      // num1 에 num2 값 삽입
            num2 = temp;      // num2 에 temp 값 삽입

        }

        System.out.print("두 숫자 사이의 모든 정수: ");

        for(int i = num1; i <= num2; i++) {
            System.out.print(i);

            // i 가 마지막 값이 아닐 경우에만 콤마를 붙여서 출력
            if (i != num2) {
                System.out.print(", ");
            }

        }

    }

}