package Test1;

import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//
public class BAssertThrow {
    @Test
    void dividirTest() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class,()->calc.division(2,0));
    }
}
