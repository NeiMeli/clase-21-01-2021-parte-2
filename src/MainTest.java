import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void applyRadixSortCase1() {
        final String[] result = Main.applyRadixSort(TestUtil.INT_UNSORTED_UNFILLED_1);
        TestUtil.assertContainSameElements(TestUtil.STRING_SORTED_BY_DIGIT_FILLED_1, result);
    }

    @Test
    void applyRadixSortCase2() {
        final String[] result = Main.applyRadixSort(TestUtil.INT_UNSORTED_UNFILLED_2);
        TestUtil.assertContainSameElements(TestUtil.STRING_SORTED_BY_DIGIT_FILLED_2, result);
    }
}