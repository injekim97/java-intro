/* package를 만들었다면 해당 패키지에 들어가는 자바 파일 첫줄에 아래와 같이 선언해줘야 함 */
package variable;

public class VarType1 {

    public static void main(String[] args) {

        /* 낙타표기법     : 여러 단어로 이루어진 ◆변수◆ 일 경우
                           첫 번째 단어는 ◆소문자◆로 시작, 그 이후의 각 단어는 대문자로 시작
                           해당 표기법을 사용하면 이름에 공백을 넣지 않고도 여러 단어를 쉽게 구분 가능
                           orderDetail, myAccount                                            */

        /* 클래스(class) : 첫 번째 단어는 ◆대문자◆로 시작, 나머지 모두 첫글자는 소문자로 시작
                           즉 첫 번째 단어 대문자 + 나머지 소문자(추후에 단어가 와도 형식 같음)
                           Person, OrderDetail                                               */

        /* 상수          : 모두 대문자를 사용하고 언더바로 구분
                           USER_LIMIT                                                       */

        /* 패키지        : 모두 소문자를 사용
                           org.spring.boot                                                  */

        /* 변수 이름     : 의미있고 그 용도를 명확하게 설명해야 함
                          studentCount, maxScore, userAccount, orderCount                  */


        int     a = 77;                 // 정수
        double  b = 13.5;               // 실수
        boolean c = true;               // true, false 값 할당 간으
        char    d = 'A';                // 문자 하나
        String  e = "Hello Java";       // 문자열, 문자열을 다루기 위한 특별한 타입

        /* ▲▲▲ 윈도우 + D : 해당 라인 한줄 복사 하여 붙여 넣는 단축키 ▲▲▲ */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}