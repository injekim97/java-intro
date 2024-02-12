package operator;

public class Operator4 {

    public static void main(String[] args) {

        int sum3 =  2 * 2  +  3 * 3  ;    // 4 + 9 = 13
        int sum4 = (2 * 2) + (3 * 3) ;    /* 괄호를 명시적으로 넣는 것이 명확하고 단순하기 때문에 유지보수 하기 더 좋다
                                             또한, 연산자 우선순위가 애매하거나 조금이라도 복잡하다면 괄호를 쓰자!!! */

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

    }
}
