import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ReadTest {

    @Test
    public void testMain_OneZeroInput() {
        // Chuỗi dữ liệu đầu vào để test
        String inputData = "0";
        // Giả định chuỗi đầu vào được nhập từ System.in
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        // Gọi phương thức main của class Read
        Read.main(null);

        // Khôi phục System.in
        System.setIn(stdin);
    }

    @Test
    public void testMain_MultipleZeroInput() {
        // Chuỗi dữ liệu đầu vào để test
        String inputData = "1 2 0 3 0 0 4 5 6 0";
        // Giả định chuỗi đầu vào được nhập từ System.in
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        // Gọi phương thức main của class Read
        Read.main(null);

        // Khôi phục System.in
        System.setIn(stdin);
    }

    @Test
    public void testMain_NoZeroInput() {
        // Chuỗi dữ liệu đầu vào để test
        String inputData = "1 2 3 4 5";
        // Giả định chuỗi đầu vào được nhập từ System.in
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        // Gọi phương thức main của class Read
        Read.main(null);

        // Khôi phục System.in
        System.setIn(stdin);
    }

    @Test
    public void testMain_AllZeroInput() {
        // Chuỗi dữ liệu đầu vào để test
        String inputData = "0 0 0 0 0";
        // Giả định chuỗi đầu vào được nhập từ System.in
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        // Gọi phương thức main của class Read
        Read.main(null);

        // Khôi phục System.in
        System.setIn(stdin);
    }
}
