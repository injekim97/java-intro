package scope;

public class Scope2 {

    public static void main(String[] args) {

        int m = 10;                                       // m 생존시작

        for (int i = 0; i < 2; i++) {                     // i 생존시작

            System.out.println("for m = " + m);
            System.out.println("for i = " + i);

        }                                                 // i 생존종료

        System.out.println("main m = " + m);

    }                                                     // m 생존종료

}