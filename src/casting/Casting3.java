package casting;

public class Casting3 {

    public static void main(String[] args) {

        long maxIntValue = 2147483647;                                // int의 Max 값
        long maxIntOver  = 2147483648L;                               // int의 Max 값 + 1(초과)
        int intValue     = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);      // 정상 범위 : 2147483647

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting  = " + intValue);      // 초과 범위 : -2147483648
                                                                      /* 오버플로우 발생 시 고민하지말고 상위 타입으로 변경(int -> long) */

    }
}