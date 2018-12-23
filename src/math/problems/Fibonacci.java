package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

        int first=0;
        int second=1;

        System.out.println(first);
        System.out.println(second);


        for( int i=3; i<40; i++ ){

            int fibo=first+second;
            System.out.println(fibo);

            first=second;
            second=fibo;
        }


        }
}
