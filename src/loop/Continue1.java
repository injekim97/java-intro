package loop;

public class Continue1 {

    public static void main(String[] args) {

        int i = 1;

        /* break, continue : 반복문에서 사용할 수 있는 키워드 */
        while(i <= 5) {

            // i가 3일 경우 출력 패스
            if (i == 3) {
                i++;
                continue;              // continue : 해당 반복문 조건식으로 이동하되 조건식이 참이면 while문을 실행
            }

            System.out.println(i);
            i++;

        }

    }
}