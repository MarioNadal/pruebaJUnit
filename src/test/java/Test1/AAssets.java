package Test1;

import org.example.Calculadora;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//TIPOS DE ASSERTS (NOT NULL, TRUE, EQUALS)
@Tag("Hola")
class AAssets {
    @Test
    void sumaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.suma(6,2);
        assertNotNull(resultado, "Ha fallado el test aquí");
        assertTrue(resultado>0, "El resultado no puede ser negativo");
        assertEquals(8,resultado,"El resultado no es el esperado");
    }
    @Test
    void restaTest() {
        Calculadora calc = new Calculadora();
        double resultado = calc.resta(6,2);
        assertNotNull(resultado);
        assertTrue(resultado>0);
        assertEquals(4,resultado);
    }
    @Test
    void multiplicacionTest(){
        Calculadora calc = new Calculadora();
        double resultado = calc.mulitplicacion(6,2);
        assertNotNull(resultado);
        assertTrue(resultado>0);
        assertEquals(12,resultado);
    }
    @Test
    void divisionTest(){
        Calculadora calc = new Calculadora();
        double resultado = calc.division(6,2);
        assertNotNull(resultado);
        assertEquals(3,resultado);
    }
}