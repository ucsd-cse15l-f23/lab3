import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  /* @Test
  public void testReverse() {
    int[] input1 = {3, 5, 8};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {8, 5, 3}, input1);
  }
*/

@Test
public void testAverageNoLowest() {
  double[] input1 = {3, 5, 8};
 assertEquals(6.5, ArrayExamples.averageWithoutLowest(input1), 0.001);
}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
}
