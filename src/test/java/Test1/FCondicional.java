package Test1;

import org.example.Calculadora;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;

public class FCondicional {

    Calculadora calc;
    private boolean hola = false;
    @AfterAll
    static void afterAll() {
        System.getenv().forEach(
                (key, value) -> System.out.println(key+" = "+value)
        );
        System.getProperties().forEach(
                (key,value) -> System.out.println(key+" = "+value)
        );
    }
    @BeforeAll
    static void beforeAll() {
        System.out.println("Se ejecuta BeforeAll");
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
    @RepeatedTest(5)
        //Para pomer nombre a los tests
        @DisplayName("Prueba del método suma")
        void sumaTest() {
            double resultado = calc.suma(6,2);
            assertNotNull(resultado, "Ha fallado el test aquí");
            assertTrue(resultado>0, "El resultado no puede ser negativo");
            assertEquals(8,resultado,"El resultado no es el esperado");
        }

    @Test
    @EnabledOnOs({OS.LINUX,OS.WINDOWS})
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
    @Nested
    @EnabledOnOs(OS.WINDOWS)
    private class windosTest{
        @Test
        @DisplayName("Prueba del método multiplicar")
        void multiplicaTest() {System.out.println("Se ejecuta multiplicaTest");}
    }
    @Nested
    @EnabledOnOs(OS.LINUX)
    private class linuxTest{
    }
    @Nested
    @EnabledOnOs(OS.MAC)
    private class macTest{
    }


}

