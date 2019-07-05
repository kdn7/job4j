package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void whet1DollarToDoRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollarTuRuble(1);
        assertThat(result, is(60));
    }

    @Test
    public void whet1EuroToDoRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroTuRuble(1);
        assertThat(result, is(70));
    }
}
