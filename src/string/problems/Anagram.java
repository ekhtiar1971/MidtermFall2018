package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        String a="CAT";
        String b="ACT";

        String c="ARMY";
        String d="MARY";

        System.out.println(anagram(a,b));

        System.out.println(anagram2(c,d));

    }
    public static  boolean anagram(String st1,String st2){
        if(st1.length()!=st2.length()){
            return false;
        }
        st1=st1.toUpperCase();
        st2=st2.toUpperCase();

        char[] st1c=st1.toCharArray();
        Arrays.sort(st1c);
        char[] st2c=st2.toCharArray();
        Arrays.sort(st2c);
        return Arrays.equals(st1c,st2c);
    }



    public static  boolean anagram2(String st1,String st2){
        if(st1.length()!=st2.length()){
            return false;
        }
        st1=st1.toUpperCase();
        st2=st2.toUpperCase();

        char[] st1c=st1.toCharArray();
        Arrays.sort(st1c);
        char[] st2c=st2.toCharArray();
        Arrays.sort(st2c);
        return Arrays.equals(st1c,st2c);
    }

}
