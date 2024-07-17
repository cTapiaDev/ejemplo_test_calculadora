package cl.bootcamp.clase23calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Clase23CalculadoraTest {
    
    private static Clase23Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Clase23Calculadora();
    }
    
    @Test
    public void testSuma() {
        assertEquals(5, calculadora.suma(2, 3));
    }
    
    @Test
    public void testResta() {
        assertEquals(1, calculadora.resta(3, 2));
    }
    
    @Test
    public void testMultiplicacion() {
        assertEquals(6, calculadora.multiplicacion(2, 3));
    }
    
    @Test
    public void testDivision() {
        ArithmeticException actualExcepcion = assertThrows(ArithmeticException.class, () -> {
            calculadora.division(1, 0);
        }, "No se puede dividir por cero");
        
        assertEquals(
                "No se puede dividir por cero", 
                actualExcepcion.getMessage(), 
                "Mensaje inesperado"
        );
    }
 
}
