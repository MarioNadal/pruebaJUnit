package Test1;

import org.example.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class HParametrizacion {
    @DisplayName("Prueba del método suma")
    @CsvFileSource(resources = "bateria.csv",delimiter = ';', numLinesToSkip = 1)
    @ParameterizedTest
    void sumaTest(int valorA, int valorB, int Salida) {
        Calculadora calc = new Calculadora();
        double resultado = calc.suma(valorA,valorB);
        assertTrue(resultado>0, "El resultado no puede ser negativo");
        assertEquals(Salida,resultado,"El resultado no es el esperado");
    }
}
