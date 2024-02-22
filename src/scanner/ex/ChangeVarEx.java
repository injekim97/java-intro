package scanner.ex;

public class ChangeVarEx {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;

        temp = a;          // temp 에 a 값 삽입 10
        a    = b;          //    a 에 b 값 삽입 20
        b    = temp;       //    b 에 a 값 삽입 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}