package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        int num = 0;

/*
        // while 문 방식 1
        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while (true) {

            num = input.nextInt();

            if (num == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            sum += num;
            cnt++;

        }
*/

        // while 문 방식 2
        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while ((num = input.nextInt()) != -1) {

            sum += num;
            cnt++;

        }

        double avg = (double) sum / cnt;

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);

    }

}