package loop;

public class DoWhile1 {

    public static void main(String[] args) {

        int i = 10 ;

        while (i < 3) {
            System.out.println("현재 숫자는: " + i);          // 조건이 false이므로 출력되지 않음
            i++;
        }

    }
}