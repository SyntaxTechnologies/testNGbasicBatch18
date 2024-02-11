package class01;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login(){
        System.out.println(0/0);
    }
    @Test(dependsOnMethods = {"login"})
    public void DashBoard(){
        System.out.println("i am a Dashboard test");
    }

}
