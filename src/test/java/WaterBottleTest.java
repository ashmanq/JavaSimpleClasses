import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void checkWaterBottleHasFullVolumeAtStart(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void testDrinkFromWaterBottle(){
        assertEquals(90, waterBottle.drinkFromWaterBottle());
    }

    @Test
    public void testEmptyWaterBottle(){
        waterBottle.emptyWaterBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void testFillWaterBottle(){
        waterBottle.drinkFromWaterBottle();
        waterBottle.drinkFromWaterBottle();
        waterBottle.drinkFromWaterBottle();
        waterBottle.fillWaterBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
