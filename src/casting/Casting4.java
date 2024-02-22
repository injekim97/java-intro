package casting;

public class Casting4 {

    public static void main(String[] args) {

        /* 1. 같은 타입끼리의 계산은 같은 타입의 결과가 나온다. (int + int = int)
           2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 발생한다. (int + long = long, int + double = double)  */

        int div1    = 3 / 2;
        System.out.println("div1 = " + div1);               // 1

        double div2 = 3 / 2;                                /* 3(int) / 2(int) = 1(int) -> 자동 형변환 발생 -> (double) 1 -> 1.0 */
        System.out.println("div2 = " + div2);               // 1.0

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);               // 1.5
        
        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);               // 1.5
        
        int a       = 3;
        int b       = 2;
        double res  = (double) a / b;
        System.out.println("res = " + res);                 // 1.5

    }
}