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
        testList.add("hello");
        testList.add("hallo");
        testList.add("hi");

        List<String> filteredList = ListExamples.filter(testList, sc);
        assertArrayEquals(new String[]{"hello",  "hi"}, filteredList.toArray());
    }

    @Test
    public void mergeTest() {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("a");
        list2.add("b");
        list1.add("c");
        list2.add("d");
        list1.add("e");
        list2.add("f");
        list2.add("g");

        List<String> mergedList = ListExamples.merge(list1, list2);
        assertArrayEquals(new String[]{"a", "b", "c", "d", "e", "f", "g"}, mergedList.toArray());
    }
}
