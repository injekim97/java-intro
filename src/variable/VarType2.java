package variable;

public class VarType2 {

    public static void main(String[] args) {

        /* 해당 타입들은 실무에서 거의 사용하지 않는다.
             - byte(파일 전송, 파일 복사 등에 주로 사용), short, float, char
             - ▲▲▲ 메모리 용량을 약간 절약하는 것 보다 개발 속도나 효율에 초점을 맞추는 것이 더 효율적이다. ▲▲▲ */

        // 정수
        byte b     = 127;                     // -128                       ~ 127                           (1byte, 2⁸)
        short s    = 32767;                   // -32,768                    ~ 32,767                        (2byte, 2¹⁶)
        int i      = 2147483647;              // -2,147,483,648             ~ 2,147,483,647                 (4byte, 2³², 약 20억)
        long l     = 9223372036854775807L;    /* -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807     (8byte, 2⁶⁴)
                                                 long은 뒤에 L 꼭 붙여줘야 함 */

        // 실수
        float  f   = 10.0f;                   // -3.4E38  ~ 3.4E38          , 7자리 정밀도                   (4byte, 2³²)
        double d   = 10.0;                    // -1.7E308 ~ 1.7E308         , 15자리 정밀도                  (8byte, 2⁶⁴)

        // 기타
        boolean bl = true;                    //                                                            (1byte)
        char c     = 'K';                     //                                                            (1byte)
        String str = "Java-intro";            // 메모리 사용량은 문자 길이에 따라 동적으로 정해짐(특별한 타입)

    }
}