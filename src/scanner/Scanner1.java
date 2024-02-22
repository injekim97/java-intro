package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);              /* Console 창에서 사용자 입력을 하기 위한 Scanner 클래스 사용 */

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();                       // 입력을 String으로 가져온다.(엔터(\n)를 입력할 때 까지 문자를 가져옴)
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : " + intValue);        // 입력을 int 타입으로 가져온다.

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " + doubleValue);     // 입력을 double 타입으로 가져온다.

    }
}