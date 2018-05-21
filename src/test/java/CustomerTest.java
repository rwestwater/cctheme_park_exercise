import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Rachel", "Adult", 25, 167, 50.00);
    }

    @Test
    public void hasName(){
        assertEquals("Rachel", customer.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Adult", customer.getType());
    }

    @Test
    public void hasAge(){
        assertEquals(25, customer.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(167, customer.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(50.00, customer.getMoney(), 0.01);
    }
}