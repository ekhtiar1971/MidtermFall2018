package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Factorial fa=new Factorial();
        Fibonacci fib=new Fibonacci();
        FindLowestDifference fld=new FindLowestDifference();
        FindMissingNumber fmn=new FindMissingNumber();
        LowestNumber ln=new LowestNumber();
        MakePyramid mp=new MakePyramid();
        Pattern pa=new Pattern();
        PrimeNumber prim=new PrimeNumber();

        boolean s1=fa.equals(true);
        boolean s2 =fib.equals(true);

        Assert.assertEquals(true,s1);
        Assert.assertEquals(true,s2);

    }
}
