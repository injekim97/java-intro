package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {

        String message;

        int won    = 0;
        int dollor = 10;
        if (dollor < 1) {
            message = "잘못된 금액입니다.";
        } else if (dollor == 0) {
            message = "환전할 금액이 없습니다.";
        } else {
            won = dollor * 1300;
            message = "환전할 금액은" + won + "원입니다.";
        }

        System.out.println("dollor: " + dollor);
        System.out.println("출력: " + message);

    }
}