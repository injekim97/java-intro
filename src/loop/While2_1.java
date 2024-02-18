package loop;

public class While2_1 {

    public static void main(String[] args) {

        int sum = 0;                                      /* sum을 더해주는 값과 출력문의 있는 값 두개다 수정 필요(유지보수 힘듬) */

        sum = sum + 1;
        System.out.println("i=" + 1 + " sum=" + sum);     // 1

        sum = sum + 2;
        System.out.println("i=" + 2 + " sum=" + sum);     // 3 (1 + 2)

        sum = sum + 3;
        System.out.println("i=" + 3 + " sum=" + sum);     // 6 (1 + 2 + 3)

    }
}