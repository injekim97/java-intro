package loop;

public class Break3 {

    public static void main(String[] args) {

        int sum = 0;

        // for loop의 무한루프 2
        for (int i = 1; ; i++) {

            sum = sum + i;

            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; // break : 즉시 해당 반복문 종료로 이동(반복문에서 사용할 수 있는 키워드)
            }

        }

    }
}