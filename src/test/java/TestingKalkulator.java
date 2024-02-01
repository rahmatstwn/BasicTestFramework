import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingKalkulator extends Kalkulator {
    @Test
    public void testAdd() {
        int a = 10;
        int b = 20;
        int result = add(a, b);
        Assertions.assertEquals(30, result);
    }

    @Test
    public void testSubtract() {
        int a = 5;
        int b = 7;
        int result = add(a, b);
        Assertions.assertTrue(result < 12);
    }

    @Test
    public void testNotNull() {
        int a = 5;
        int b = 7;
        int result = add(a, b);
        Assertions.assertNotNull(result);
    }

}
