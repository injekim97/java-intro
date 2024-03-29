package cond;

public class If5 {

    public static void main(String[] args) {
        
        /* 해당 코드는 각각 독립된 if문 이기 때문에 해당하는 각 조건들에 대해 모든 할인 적용
           즉, if문을 각각 사용할지 if-else if를 함께 묶어서 사용할지는 요구사항에 따라 달라진다 */

        int discount = 0;
        int price    = 10000;
        int age      = 10;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 10000원 할인");
        }

        System.out.println("총 할인 금액: " +  discount + "원");

    }
}