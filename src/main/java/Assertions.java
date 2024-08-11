import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
    @Test
    void HardAssertion1()
    {
        Assert.assertEquals("123", "123");
        //Assert.assertNotEquals("123", "123");
    }
    @Test
    void HardAssertion2()
    {
        System.out.println("Testing");
       Assert.assertTrue(1==2);
       //Assert.assertFalse(1==1);
        System.out.println("This should not be printed in hard assertion after failing given condition");
    }
    @Test
    void SoftAssertion1()
    {
        System.out.println("testing");
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(1, 2);
        System.out.println("Print this");
        sa.assertAll();

    }
    @Test
    void SoftAssertion2()
    {

    }
}
