package scope;

public class Scope3_2 {

    public static void main(String[] args) {

        /* 변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다.
           좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절한 제약이 있는 프로그램이다. */

        int m = 10;                                    // m 생존시작

        if (m > 0) {

            int temp = m * 2;                          /* temp를 if 코드 블록 안에 선언함으로써 효율적인 메모리 사용 및 코드 복잡성 감소(군더더기 없는 단순한 코드가 됨) */
            System.out.println("temp = " + temp);

        }

        System.out.println("m = " + m);

    }                                                  // m 생존종료

}