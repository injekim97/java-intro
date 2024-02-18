package cond;

public class Switch3 {

    public static void main(String[] args) {

        /* switch 문에 break 문이 없을 경우 case 2 실행 후 case 3 조건까지 실행됨 */

        // 1: 1000, 2: 3000(변경), 3: 3000, -: 500
        int grade  = 2;

        int coupon;
        switch (grade) {

            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급 받은 쿠폰: " +  coupon);

    }
}