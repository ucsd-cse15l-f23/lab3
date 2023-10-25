import static org.junit.Assert.*;

import org.junit.*;

import java.util.Arrays;

public class ArrayTests {
    @Test
    public void testReverseInPlace() {
        int[] input1 = {3};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{3}, input1);
    }


    @Test
    public void testReversed() {
        int[] input1 = {};
        assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
    }

    @Test
    public void testReverseInPlaceTwo() {
        int[] input1 = {3, 4, 5, 6, 7};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{7, 6, 5, 4, 3}, input1);
        // Fails, output is [7, 6, 5, 6, 7] instead
    }

    @Test
    public void testReversedTwo() {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] output1 = ArrayExamples.reversed(input1);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, output1);
        // Fails, output is [0, 0, 0, 0, 0] instead
    }
}
