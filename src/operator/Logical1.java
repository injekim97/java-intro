package operator;

public class Logical1 {

    public static void main(String[] args) {

        /* 논리 연산자 : boolean 형인 true, false 를 비교하는데 사용
                       &&(AND), ||(OR), !(NOT)                                 */
        System.out.println("&&: AND 연산(true 가 전부 나와야 true)");
        System.out.println(true  && true);                            // true
        System.out.println(true  && false);                           // false
        System.out.println(false && false);                           // false

        System.out.println("||: OR 연산(true 가 하나라도 있으면 true)");
        System.out.println(true  || true);                            // true
        System.out.println(true  || false);                           // true
        System.out.println(false || false);                           // false

        System.out.println("!: NOT 연산(나온 결과값의 반대)");
        System.out.println(!true);                                    // false
        System.out.println(!false);                                   // true

        boolean a = true;
        boolean b = false;

        System.out.println("변수 활용 방법");
        System.out.println(a && b);                                   // false
        System.out.println(a || b);                                   // true
        System.out.println(!a);                                       // false
        System.out.println(!b);                                       // true

    }
}