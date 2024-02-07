package variable;

public class Var6 {

    public static void main(String[] args) {

        int a;
        //System.out.println(a); // [error] java: variable a might not have been initialized
                                 // ▲▲▲ git-commit\src\variable\Var6.java:9:28 > 9번째 라인의 28공백 ▲▲▲
                                 /* 컴퓨터에서의 메모리는 여러 시스템이 함께 사용하는 공간이므로 어떠한 값들이 계속 저장되는 상황임
                                  즉, 그 공간에 기존 어떠한 값이 있었는지 모르기 때문에 이상한 값이 출력될 수 있기 때문에
                                  변수 초기화를 함으로 써 이상한 값이 출력되는 현상을 예방할 수 있음. */
    }
}