package casting;

public class Casting2 {

    public static void main(String[] args) {

        int intValue = 0;
        double doubleValue = 1.5;

        // intValue = doubleValue;                          /* [error] incompatible types: possible lossy conversion from double to int */

        intValue = (int) doubleValue;                       // 명시적 형변환
        System.out.println("intValue = " + intValue);

    }
}