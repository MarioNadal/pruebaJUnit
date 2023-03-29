package Test1;

import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//SIRVE PARA QUE TE DIGA SI HAY MÁS DE UN ASSERT QUE DA ERROR
public class CAsserrtAll {
    @Test
    void sumaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.suma(6,2);
        assertAll("Agrupamiento de Assert",
                ()->assertNotNull(resultado, "Ha fallado el test aquí"),
                ()->assertTrue(resultado>0, "El resultado no puede ser negativo"),
                ()->assertEquals(8,resultado,"El resultado no es el esperado")
        );
    }
}
