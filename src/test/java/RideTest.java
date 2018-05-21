import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideTest {

    Ride ride1;
    Ride ride2;

    @Before
    public void before(){
        ride1 = new Ride("Nemasis", "Rollercoaster", 8, 135);
        ride2 = new Ride("Teacups", "Spinner", 2, 80);
    }

    @Test
    public void hasName(){
        assertEquals("Nemasis", ride1.getName());
    }

    @Test
    public void hasModel(){
        assertEquals("Rollercoaster", ride1.getModel());
    }

    @Test
    public void hasMinAge(){
        assertEquals(8, ride1.getMinAge());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(135, ride1.getMinHeight());
    }
}
