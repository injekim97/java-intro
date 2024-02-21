package scope;

public class Scope3_1 {

    public static void main(String[] args) {

        int m    = 10;                                    // m 생존시작
        int temp = 0;                                     /* temp는 if 코드블록에서만 필요
                                                             main()코드 블록에서 선언 시
                                                             1. 비효율적인 메모리 사용(main 코드 블록이 종료될 때 까지 메모리 유지)
                                                             2. 코드 복잡성 증가(좋은 코드는 군더더기 없는 단순한 코드이다.)         */
        if (m > 0) {

            temp = m * 2;
            System.out.println("temp = " + temp);

        }

        System.out.println("m = " + m);

    }                                                     // m 생존종료

}