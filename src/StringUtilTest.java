import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilTest {

    @Test
    void testFill() {
        final String[] sortedByLengthUnfilledStrings = StringUtil.toSortedByLengthStringArray(TestUtil.INT_UNSORTED_UNFILLED_1);
        final String[] sortedByLengthFilledStrings = StringUtil.fill(sortedByLengthUnfilledStrings, 3);
        TestUtil.assertContainSameElements(TestUtil.STRING_SORTED_BY_LENGTH_FILLED_1, sortedByLengthFilledStrings);
    }

    @Test
    void testToSortedByLengthStringArray() {
        final String[] sortedByLengthUnfilledStrings = StringUtil.toSortedByLengthStringArray(TestUtil.INT_UNSORTED_UNFILLED_1);
        TestUtil.assertContainSameElements(TestUtil.STRING_SORTED_BY_LENGTH_UNFILLED_1, sortedByLengthUnfilledStrings);
    }

    @Test
    void testToStringArrayByDigitMap() {
        String[] sortedByLengthStringArray = StringUtil.toSortedByLengthStringArray(TestUtil.INT_UNSORTED_UNFILLED_2);
        String[] filledArray = StringUtil.fill(sortedByLengthStringArray, 3);
        Map<Integer, List<String>> stringArrayByDigitMap = StringUtil.toStringArrayByDigitMap(filledArray, 2);
        assertEquals(stringArrayByDigitMap.size(), 4);
        assertTrue(stringArrayByDigitMap.containsKey(3));
        assertTrue(stringArrayByDigitMap.containsKey(2));
        assertEquals(stringArrayByDigitMap.get(3).size(), 3);
        assertTrue(stringArrayByDigitMap.get(3).containsAll(Arrays.asList("003", "023", "673")));
    }
}
