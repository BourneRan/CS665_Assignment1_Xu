import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestVending {
    public TestVending(){}

    @Test
    public void TestCoffee(){
        VendingCoffee TestCoffee = new VendingCoffee();
        TestCoffee.CoffeeChoice();
    }

    @Test
    public void TestTea(){
        VendingTea TestTea = new VendingTea();
        TestTea.TeaChoice();
    }
}
