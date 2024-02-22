package operator;

public class Comp2 {

    public static void main(String[] args) {

        /* ◆◆◆ 문자열 비교할 때는 ==이 아니라 반드시 .equals() 메서드를 사용해야한다. ◆◆◆ */
        /* 컨트롤 + 쉬프트 + 엔터 : 자동으로 해당 라인 세미콜론(;) 추가                  */
        String str1  = "문자열1";
        String str2  = "문자열2";

        boolean res1 = "hello".equals("hello");        // true
        boolean res2 = str1.equals("문자열1");          // true
        boolean res3 = str1.equals(str2);              // false

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
}