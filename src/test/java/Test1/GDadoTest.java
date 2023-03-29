package Test1;

import org.example.Dado;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GDadoTest {
    @Test
    @RepeatedTest(10)
    void get_value(){
        Dado D = new Dado();
        int resultado = D.get_value(6,3);
        assertNotEquals(3,resultado);
    }
}
