import static org.junit.Assert.assertTrue;

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleDateTest {
    @Test
    public void testWithDependency(){
        SimpleDate simpleDate = new SimpleDate(1, 1, 2000);

        assertTrue(simpleDate.rangesOK(2, 29, 2000));

        // assertTrue(simpleDate.rangesOK(2, 29, 2001));
        assertTrue(simpleDate.rangesOK(2, 28, 2001));
    }

    @Test
    public void testWithoutDependencyManual(){
        SimpleDate simpleDate = new SimpleDate(1, 1, 2000){
            @Override
            protected boolean isLeap(int year){
                if(2000==year){
                    return true;
                }else if(2001==year){
                    return false;
                }else{
                    throw new IllegalArgumentException("No Mock for year " + year);
                }
            }
        };

        assertTrue(simpleDate.rangesOK(2, 29, 2000));
        assertTrue(simpleDate.rangesOK(2, 28, 2001));
    }
}
