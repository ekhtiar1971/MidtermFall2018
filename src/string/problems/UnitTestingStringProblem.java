package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) throws java.lang.AssertionError  {
        //Apply Unit Test into all the methods in this package.
        try {
            String str1 = "NATURE IS WONDERFUL";
            Assert.assertEquals(DetermineLargestWord.findTheLargestWord(str1),"WONDERFUL");
            System.out.println("Determine largest value unit test Passed.");
        }catch (AssertionError as){
            System.out.println("Determine largest value unit test Failed");
        }

        //Unit test for Anangram Problem
        try {
            Assert.assertEquals(Anagram.anagram("DAD","DAD"),true);
            System.out.println("Anagram unit test Passed.");
        }catch (AssertionError as){
            System.out.println("Anagram unit test is failed");
        }

        //unit testing for palindrome
        /*try {//Unit test for palindrome
            String str2 = "WOW";
            boolean expected = true;
            Assert.assertEquals(Palindrome.checkPalindrome(str2),expected:false);
            System.out.println("Palindrome unit test passed.");
        } catch (AssertionError as){
            System.out.println("Palindrome unit test failed.");
        }*/



    }
}
