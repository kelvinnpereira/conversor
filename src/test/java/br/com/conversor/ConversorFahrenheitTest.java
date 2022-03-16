package br.com.conversor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorFahrenheitTest {

    @Test
    public void testeConvertendoDeFahrenheitParaCelsius() {
        assertEquals(Conversor.converter(32, 'f', 'c'), 0.0);
    }
}
