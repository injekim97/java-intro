package operator;

public class Logical2 {

    public static void main(String[] args) {

        int a = 15;

        // a 는 10보다 크고 20보다 작다
        boolean res1 = a > 10 && a < 20;                  // (a > 10) && (a < 20)
        boolean res2 = 10 < a && a < 20;                  // res1 보다 res2가 가독성이 좋다(값은 동일)
        System.out.println(res1);                         // true

    }
}