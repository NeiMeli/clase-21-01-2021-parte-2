import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUtil {
    // case 1
    public static final int[] INT_UNSORTED_UNFILLED_1 = {4, 28, 132, 3, 61, 5};
    public static final String[] STRING_SORTED_BY_LENGTH_UNFILLED_1 = {"132", "28", "3", "4", "5", "61"};
    public static final String[] STRING_SORTED_BY_LENGTH_FILLED_1 = {"132", "028", "003", "004", "005", "061"};
    public static final String[] STRING_SORTED_BY_DIGIT_FILLED_1 = {"003", "004", "005", "028", "061", "132"};

    // case 2
    public static final int[] INT_UNSORTED_UNFILLED_2 = {3, 673, 106, 45, 2, 23};
    public static final String[] STRING_SORTED_BY_DIGIT_FILLED_2 = {"002", "003", "023", "045", "106", "673"};

    public static void assertContainSameElements(String[] expected, String[] actual) {
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i ++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
