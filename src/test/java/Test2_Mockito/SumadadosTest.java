package Test2_Mockito;

import org.example.Calculadora;
import org.example.Dado;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
//Clase que genera los tests del mockito con la extension
@ExtendWith(MockitoExtension.class)
public class SumadadosTest {

    //Dependecias
    @Mock
    private Dado D1;
    @Mock
    private Dado D2;
    //System under Test (SUT)
    @InjectMocks
    private Calculadora calc;


    @Test
    void sumadados(){
        //Generamos escenario de test
        calc = new Calculadora();
        //Controlamos la respuesta de los métodos
        //ARGUMENT MATCHER eq() solo funciona con ese valor, any() funciona con cualquier valor, anyInt() cualquier valor entero, anyString() cualquier valor String, ...
        when(D1.get_value(8,3)).thenThrow(IllegalArgumentException.class);
        when(D2.get_value(8,3)).thenThrow(IllegalArgumentException.class);
        //Generamos el test
        double resultado = calc.dobledado(D1, D2, 6,3);
        assertThrows(IllegalArgumentException.class, ()->calc.dobledado(D1,D2,6,3));
    }

}
