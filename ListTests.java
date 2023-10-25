import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListTests {

    @Test
    public void filterTest() {
        StringChecker sc = s -> { return Objects.equals(s, "hello"); };

        ArrayList<String> testList = new ArrayList<>();
        testList.add("hello");
        testList.add("hi");

        List<String> filteredList = ListExamples.filter(testList, sc);
        assertArrayEquals(new String[]{"hello"}, filteredList.toArray());
    }
}