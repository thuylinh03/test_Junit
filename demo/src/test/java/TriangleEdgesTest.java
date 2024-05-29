import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleEdgesTest {
    
    @Test
    public void testTriangleEdgesVuong() {
        assertTrue("Day la tam giac vuong", TriangleEdges.isRightTriangle(3, 4, 5));
    }
    
    @Test
    public void testTriangleEdgesDeu() {
        assertTrue("Day la tam giac deu", TriangleEdges.isEquilateral(5, 5, 5));
    }
    
    @Test
    public void testTriangleEdgesCan() {
        assertTrue("Day la tam giac can", TriangleEdges.isIsosceles(5, 7, 5));
    }
    
    // @Test
    // public void testTriangleEdgesThuong() {
    //     assertEquals("Day la tam giac thuong", TriangleEdges.isValidTriangle(6, 8, 10));
    // }
    
    // @Test
    // public void testTriangleEdgesNhon() {
    //     assertEquals("Day la tam giac nhon", TriangleEdges.classifyTriangle(4, 5, 6));
    // }
    
    @Test
    public void testTriangleEdgesNotTriangle() {
        assertTrue("Day khong la tam giac", TriangleEdges.isNotValidTriangle(1, 2, 3));
    }
}
