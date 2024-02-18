package loop;

public class DoWhile2 {

    public static void main(String[] args) {

        int i = 10 ;

        /* do while : 조건에 상관없이 do 부분 최초 한번은 항상 실행 후
                      while 조건에 따라 do 부분을 실행할지 결정         */
        do {

            System.out.println("현재 숫자는: " + i);
            i++;

        } while (i < 3);

    }
}