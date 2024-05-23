import org.junit.Test;
import static org.junit.Assert.*;

public class MaxSumTest {

    @Test
    public void testMaxSumWithinMaxInt() {
        assertEquals(6, getMaxSumResult(8, 6));
    }

    @Test
    public void testMaxSumExceedsMaxInt() {
        assertEquals(-1, getMaxSumResult(5, 2));
    }

    private int getMaxSumResult(int value, int maxint) {
        try {
            MaxSum.maxsum(value, maxint);
            return maxint; // Trả về maxint nếu kết quả <= maxint
        } catch (AssertionError e) {
            return -1; // Trả về -1 nếu kết quả > maxint
        }
    }
}