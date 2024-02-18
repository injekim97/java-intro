package loop;

public class While2_2 {

    public static void main(String[] args) {

        int sum = 0;
        int i   = 1;                                      /* i의 값만 변경하면 나머지 코드를 변경하지 않아도 됨(아까 보다 유지보수가 용이함) */

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);     // 1
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);     // 3 (1 + 2)
        i++;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);     // 6 (3 + 3)

    }
}