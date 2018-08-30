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

    @Test
    public void testMethodMove() {
        MoveablePoint moveablePoint = new MoveablePoint(1, 2, 3, 4);
        MoveablePoint expect = new MoveablePoint(4, 6);
        MoveablePoint actual = moveablePoint.move();
        assertEquals(expect.toString(), actual.toString());

    }
}
