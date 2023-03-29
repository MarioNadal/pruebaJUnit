package Test1;

import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.Suite;

import static org.junit.jupiter.api.Assertions.*;

@Suite
@IncludeTags("Hola")
public class SuiteTest {
    @Test
    void sumaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.suma(6,2);
        assertNotNull(resultado, "Ha fallado el test aquí");
        assertTrue(resultado>0, "El resultado no puede ser negativo");
        assertEquals(8,resultado,"El resultado no es el esperado");
    }
}
