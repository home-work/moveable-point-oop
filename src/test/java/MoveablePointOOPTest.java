import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoveablePointOOPTest {
    @Test
    public void testClassPoint() {
        Point point = new Point(3, 5);
        String expect = "(3.0,5.0)";
        String actual = point.toString();
        assertEquals(expect, actual);
    }
}
