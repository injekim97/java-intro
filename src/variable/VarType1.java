/* package를 만들었다면 해당 패키지에 들어가는 자바 파일 첫줄에 아래와 같이 선언해줘야 함 */
package variable;

public class VarType1 {

    public static void main(String[] args) {

        int     a = 77;           // 정수
        double  b = 13.5;         // 실수
        boolean c = true;         // true, false 값 할당 간으
        char    d = 'A';          // 문자 하나
        String  e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입

        /* ▲▲▲ 윈도우 + D : 해당 라인 한줄 복사 하여 붙여 넣는 단축키 ▲▲▲ */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}