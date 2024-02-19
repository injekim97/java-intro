package loop;

public class Break2 {

    public static void main(String[] args) {

        int sum = 0;
        int i   = 1;

        /* break, continue : 반복문에서 사용할 수 있는 키워드 */
        // for loop의 무한루프
        for (;;) {

            sum = sum + i;

            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }

            i++;

        }

    }
}