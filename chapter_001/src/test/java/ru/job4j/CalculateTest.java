package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Калугин Дмитрий (kdn7777777@gmail.com)
 * @version 1
 * @since 04.07.2019
 */
public class CalculateTest {
 /**
 * Test echo.
 */

@Test
 public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Дмитрий Калугин";
    String expect = "Echo, echo, echo : Дмитрий Калугин"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
 }

}