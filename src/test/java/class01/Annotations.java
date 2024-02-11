package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

    @BeforeMethod
    public  void BeforeMethod(){
        System.out.println("i am before method");
    }
    @Test
    public void ATestCase(){
        System.out.println("this is the test case no 1");
    }

    @Test
     public  void BTestCase(){
        System.out.println("this is test case no 2");
    }
    @AfterMethod
    public  void AfterMethod(){
        System.out.println("i am after Method");
    }

}
