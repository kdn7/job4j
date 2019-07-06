package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Калугин Дмитрий (kdn7777777@gmail.com)
 * @version 1
 * @since 06.07.2019
 */
public class ConverterTest {
    /**
     * Test
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test
     */
    @Test
    public void whet1DollarToDoRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollarTuRuble(1);
        assertThat(result, is(60));
    }

    /**
     * Test
     */
    @Test
    public void whet1EuroToDoRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroTuRuble(1);
        assertThat(result, is(70));
    }
}
