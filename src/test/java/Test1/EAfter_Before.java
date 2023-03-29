package Test1;

import org.example.Calculadora;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class EAfter_Before {
Calculadora calc;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Se ejecuta BeforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Se ejecuta AfterAll");
    }
    @BeforeEach
    void setUp() {
        System.out.println("Se ejecuta SetUp");
        calc = new Calculadora();
    }
    @AfterEach
    void tearDown() {
        System.out.println("Se ejecuta TearDown");
    }

    @Test
    //Para pomer nombre a los tests
    @DisplayName("Prueba del método suma")
    void sumaTest() {
        double resultado = calc.suma(6,2);
        assertNotNull(resultado, "Ha fallado el test aquí");
        assertTrue(resultado>0, "El resultado no puede ser negativo");
        assertEquals(8,resultado,"El resultado no es el esperado");
    }
    @Test
    @DisplayName("Prueba del metodo resta")
    void restaTest() {
        double resultado = calc.resta(6,2);
        assertNotNull(resultado);
        assertTrue(resultado>0);
        assertEquals(4,resultado);
    }
    @Test
    @DisplayName("Prueba del metodo multiplicacion")
    void multiplicacionTest(){
        double resultado = calc.mulitplicacion(6,2);
        assertNotNull(resultado);
        assertTrue(resultado>0);
        assertEquals(12,resultado);
    }
    @Test
    @DisplayName("Prueba del metodo division")
    void divisionTest(){
        double resultado = calc.division(6,2);
        assertNotNull(resultado);
        assertEquals(3,resultado);
    }
}
