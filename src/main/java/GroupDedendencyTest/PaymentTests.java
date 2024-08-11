
package GroupDedendencyTest;

import org.testng.annotations.Test;

public class PaymentTests {
    @Test(priority = 1, groups = {"regression", "sanity"})
    void paymentinRupees()
    {
        System.out.println("Payment in rupees");
    }
    @Test(priority = 2, groups = {"regression", "sanity"})
    void paymentinDollars()
    {
        System.out.println("Payment in dollars");
    }
}
