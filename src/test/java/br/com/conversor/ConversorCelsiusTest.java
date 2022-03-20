package br.com.conversor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorCelsiusTest {

    @Test
    public void testeConvertendoDeCelsiusParaFahrenheit() {
        assertEquals(Conversor.converter(10, 'c', 'f'), 40.00);
    }
}
