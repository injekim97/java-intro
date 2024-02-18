package cond;

public class Switch4 {

    public static void main(String[] args) {

        /* Java 14 이상 새로운 switch 문 */

        // 1: 1000, 2: 3000(변경), 3: 3000, -: 500
        int grade  = 1;

        int coupon = switch (grade) {
            case 1  -> 10000;
            case 2  -> 2000;
            case 3  -> 3000;
            default -> 500;
        };

        System.out.println("발급 받은 쿠폰: " +  coupon);

    }
}