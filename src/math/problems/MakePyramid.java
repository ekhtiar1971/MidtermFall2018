package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        for(int l=0; l<10; l++) {
            for (int m = 0; m < 10-l; m++) {
                System.out.print(" ");
            }
            for (int n =0; n<=l; n++) {
                System.out.print("* ");

            }
            System.out.println();
        }



        }
  }
