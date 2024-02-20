package scope;

public class Scope1 {

    public static void main(String[] args) {

        int m = 10;                                       // m 생존시작

        if (true) {                                       // x 생존시작

            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);

        }                                                 // x 생존종료

        System.out.println("main m = " + m);

    }                                                     // m 생존 종료
    
}