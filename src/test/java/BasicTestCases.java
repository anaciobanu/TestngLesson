import org.testng.annotations.*;

public class BasicTestCases {

@BeforeMethod
    public void Login(){
        System.out.println("Login");
    }

    @AfterMethod
    public void Logout(){
        System.out.println("Logout");
    }
    @Test(priority = 1)
    public void TestOne(){
        System.out.println("Test 1");
    }
@Test(priority = 2)
    public void TestTwo(){
        System.out.println("Test 2");
    }
@Test(priority = 3)
    public void TestThree(){
        System.out.println("Test 3");
    }

}
