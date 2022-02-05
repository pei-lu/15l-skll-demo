import static org.junit.Assert.*;
import org.junit.*;

public class PairTest {
    @Test
    public void testLess(){
        assertTrue("1 should less than 2", Pair.less(1,2));
    }
}
