import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class FnumberTest {
    @Test
    public void testIsEven(){
        Fnumber number = new Fnumber();
        boolean rs = number.isEvent(4);
        assertTrue(rs);
    }
}
