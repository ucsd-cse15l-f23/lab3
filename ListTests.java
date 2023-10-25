import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListTests {

    @Test
    public void filterTest() {
        StringChecker sc = s -> { return Objects.equals(s, "hello") || Objects.equals(s, "hi"); };

        ArrayList<String> testList = new ArrayList<>();
        testList.add("what");
        testList.add("hello");
        testList.add("oh");
        testList.add("hi");
        testList.add("how");
        testList.add("are");
        testList.add("you");

        List<String> filteredList = ListExamples.filter(testList, sc);
        assertArrayEquals(new String[]{"hello",  "hi"}, filteredList.toArray());
    }
}
