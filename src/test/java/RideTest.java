import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideTest {

    Ride ride;

    @Before
    public void before(){
        ride = new Ride("Nemasis", "Rollercoaster", 8, 135);
    }

    @Test
    public void hasName(){
        assertEquals("Nemasis", ride.getName());
    }

    @Test
    public void hasModel(){
        assertEquals("Rollercoaster", ride.getModel());
    }

    @Test
    public void hasMinAge(){
        assertEquals(8, ride.getMinAge());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(135, ride.getMinHeight());
    }
}
