package homewerk31;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.otus.java.basic.homeworks.homework31.ArrayUtils;

import java.util.stream.Stream;

/**
 * Тесты для методов класса ArrayUtils.
 */
public class ArrayUtilsTest {

    /**
     * Проверяет корректную работу метода elementsAfterLastOne,
     * когда 1 встречается внутри массива.
     */
    @Test
    void testElementsAfterLastOne_NormalCase() {
        int[] input = {1, 2, 1, 2, 2};
        int[] expected = {2, 2};
        assertArrayEquals(expected, ArrayUtils.elementsAfterLastOne(input));
    }

    /**
     * Проверяет, что метод выбрасывает RuntimeException, если в массиве нет 1.
     */

    @Test
    void testElementsAfterLastOne_NoOne() {
        int[] input = {2, 2, 2, 2};
        assertThrows(RuntimeException.class, () -> ArrayUtils.elementsAfterLastOne(input));
    }

    /**
     * Проверяет, что метод возвращает пустой массив,
     * если последняя 1 стоит в конце массива.
     */
    @Test
    void testElementsAfterLastOne_OneAtEnd() {
        int[] input = {2, 2, 1};
        int[] expected = {};
        assertArrayEquals(expected, ArrayUtils.elementsAfterLastOne(input));
    }

    /**
     * Параметризованный тест: проверяет, что метод checkArray
     * возвращает true для корректных массивов, содержащих только 1 и 2.
     */
    @ParameterizedTest
    @MethodSource("provideArraysForCheckArrayTrue")
    void testCheckArray_ShouldReturnTrue(int[] input) {
        assertTrue(ArrayUtils.checkArray(input));
    }

    /**
     * Источник данных для теста testCheckArray_ShouldReturnTrue.
     */
    static Stream<int[]> provideArraysForCheckArrayTrue() {
        return Stream.of(
                new int[]{1, 2},
                new int[]{1, 2, 2, 1},
                new int[]{2, 1},
                new int[]{2, 1, 1, 2, 2}
        );
    }

    /**
     * Параметризованный тест: проверяет, что метод checkArray
     * возвращает false, если массив не содержит одновременно 1 и 2
     * или содержит другие числа.
     */
    @ParameterizedTest
    @MethodSource("provideArraysForCheckArrayFalse")
    void testCheckArray_ShouldReturnFalse(int[] input) {
        assertFalse(ArrayUtils.checkArray(input));
    }

    /**
     * Источник данных для теста testCheckArray_ShouldReturnFalse.
     */
    static Stream<int[]> provideArraysForCheckArrayFalse() {
        return Stream.of(
                new int[]{1, 1},
                new int[]{2, 2},
                new int[]{1},
                new int[]{2},
                new int[]{1, 3},
                new int[]{0, 1, 2},
                new int[]{}
        );
    }
}