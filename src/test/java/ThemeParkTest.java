import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Ride ride;
    Customer customer1;
    Customer customer2;

    @Before
    public void before() {
        themePark = new ThemePark("Thorpe Park");
        ride = new Ride("Nemasis", "Rollercoaster", 8, 135);
        customer1 = new Customer("Rachel", "Adult", 25, 167, 50.00);
        customer2 = new Customer("Hannah", "Child", 7, 134, 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Thorpe Park", themePark.getName());
    }

    @Test
    public void getRideCount() {
        themePark.addRide(ride);
        assertEquals(1, themePark.getRidesCount());
    }

    @Test
    public void CanGetCustomerCount() {
        themePark.addCustomer(customer1);
        themePark.addCustomer(customer2);
        assertEquals(2, themePark.getCustomerCount());
    }

}