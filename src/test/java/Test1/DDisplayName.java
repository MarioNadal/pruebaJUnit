package Test1;

import org.example.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DDisplayName {
    @Test
    //Para pomer nombre a los tests
    @DisplayName("Prueba del método suma")
    void sumaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.suma(6,2);
        assertNotNull(resultado, "Ha fallado el test aquí");
        assertTrue(resultado>0, "El resultado no puede ser negativo");
        assertEquals(8,resultado,"El resultado no es el esperado");
    }
    @Test
    @DisplayName("Prueba del metodo resta")
    void restaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.resta(6,2);
        assertNotNull(resultado);
        assertTrue(resultado>0);
        assertEquals(4,resultado);
    }
    @Test
    @DisplayName("Prueba del metodo multiplicacion")
    void multiplicacionTest(){
        Calculadora calc = new Calculadora();
        double resultado = calc.mulitplicacion(6,2);
        assertNotNull(resultado);
        assertTrue(resultado>0);
        assertEquals(12,resultado);
    }
    @Test
    @DisplayName("Prueba del metodo division")
    void divisionTest(){
        Calculadora calc = new Calculadora();
        double resultado = calc.division(6,2);
        assertNotNull(resultado);
        assertEquals(3,resultado);
    }
}
