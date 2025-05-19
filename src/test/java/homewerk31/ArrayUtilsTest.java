package homewerk31;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.otus.java.basic.homeworks.homework31.ArrayUtils;

public class ArrayUtilsTest {

    @Test
    void testElementsAfterLastOne_NormalCase() {
        int[] input = {1, 2, 1, 2, 2};
        int[] expected = {2, 2};
        assertArrayEquals(expected, ArrayUtils.elementsAfterLastOne(input));
    }

    @Test
    void testElementsAfterLastOne_NoOne() {
        int[] input = {2, 2, 2, 2};
        assertThrows(RuntimeException.class, () -> ArrayUtils.elementsAfterLastOne(input));
    }

    @Test
    void testElementsAfterLastOne_OneAtEnd() {
        int[] input = {2, 2, 1};
        int[] expected = {};
        assertArrayEquals(expected, ArrayUtils.elementsAfterLastOne(input));
    }

    @Test
    void testCheckArray_Valid1() {
        int[] input = {1, 2};
        assertTrue(ArrayUtils.checkArray(input));
    }

    @Test
    void testCheckArray_Valid2() {
        int[] input = {1, 2, 2, 1};
        assertTrue(ArrayUtils.checkArray(input));
    }

    @Test
    void testCheckArray_OnlyOnes() {
        int[] input = {1, 1};
        assertFalse(ArrayUtils.checkArray(input));
    }

    @Test
    void testCheckArray_InvalidElement() {
        int[] input = {1, 3};
        assertFalse(ArrayUtils.checkArray(input));
    }

    @Test
    void testCheckArray_NoTwos() {
        int[] input = {1};
        assertFalse(ArrayUtils.checkArray(input));
    }

    @Test
    void testCheckArray_NoOnes() {
        int[] input = {2};
        assertFalse(ArrayUtils.checkArray(input));
    }
}
