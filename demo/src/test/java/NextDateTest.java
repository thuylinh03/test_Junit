import static org.junit.Assert.*;
import org.junit.Test;

public class NextDateTest {

    @Test
    public void testNextDateNormalDay() {
        assertArrayEquals(new int[]{2, 4, 2023}, NextDate.nextDate(1, 4, 2023));
    }

    @Test
    public void testNextDateLastDayOfMonthNotFebruary() {
        assertArrayEquals(new int[]{1, 5, 2023}, NextDate.nextDate(30, 4, 2023));
    }

    @Test
    public void testNextDateLastDayOfMonthFebruaryNotLeapYear() {
        assertArrayEquals(new int[]{1, 3, 2022}, NextDate.nextDate(28, 2, 2022));
    }

    @Test
    public void testNextDateLastDayOfMonthFebruaryLeapYear() {
        assertArrayEquals(new int[]{29, 2, 2024}, NextDate.nextDate(28, 2, 2023));
    }

    @Test
    public void testNextDateBoundaryValues() {
        // Edge case: 1st day of 1812
        assertArrayEquals(new int[]{2, 1, 1812}, NextDate.nextDate(1, 1, 1812));
        // Edge case: last day of 2012
        assertArrayEquals(new int[]{1, 1, 2024}, NextDate.nextDate(31, 12, 2023));
    }

    @Test
    public void testNextDateNegativeDay() {
        assertNull(NextDate.nextDate(-1, 1, 2023));
    }

    @Test
    public void testNextDateInvalidMonth() {
        assertNull(NextDate.nextDate(31, 13, 2023));
    }

    @Test
    public void testNextDateInvalidYear() {
        assertNull(NextDate.nextDate(31, 12, 1811));
    }

    @Test
    public void testNextDateInvalidDay() {
        assertNull(NextDate.nextDate(32, 1, 2023));
    }
}

