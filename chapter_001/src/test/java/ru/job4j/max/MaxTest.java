package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {

    /**
     * Compare two.
     */
    @Test
    public void whenThreeCompareFourThenFourMax() {
        final int three = 3;
        final int four = 4;
        Max max = new Max(new int[] {});
        int result  = max.max(three, four);
        assertThat(result, is(four));
    }

    /**
     * Values.
     */
    @Test
    public void whenOneTwoThreeValuesThenThreeMax() {
        final int three = 3;
        final int[] values = {1, 2, three};
        Max max = new Max(values);
        int result = max.max();
        assertThat(result, is(three));
    }
}