package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Student student = new Student("PITTER", "TUCKER", "A-102", "111111");

        //Unit test for getFirst name
        try{
            Assert.assertEquals(student.getFirstName(),"PITTER");
            System.out.println("Unit Test Passed getFirstName");
        }catch ( AssertionError as){
            System.out.println("Unit Test Failed getFirstName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getLast name
        try{
            Assert.assertEquals(student.getLastName(),"TUCKER");
            System.out.println("Unit Test passed lastName");
        }catch (AssertionError as){
            System.out.println("Unit Test Failed lastName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getScore name
        try{
            Assert.assertEquals(student.getScore(),"A-102");
            System.out.println("Test passed getScore");
        }catch (AssertionError as){
            System.out.println("Test Failed getScore");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getID name
        //unit test failed by catch block,because id changed
        try{
            Assert.assertEquals(student.getId(),"222222");
            System.out.println("Unit Test passed getId");
        }catch (AssertionError as){
            System.out.println("Unit Test Failed getId");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

    }

    }

