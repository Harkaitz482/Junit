package calculadora;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class CalculadoraTestResta {

    private int nume1;
    private int nume2;
    private int result;
    
    public CalculadoraTestResta(int nume1, int nume2, int result) {
        this.nume1 = nume1;
        this.nume2 = nume2;
        this.result = result;
    }

    @Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][] { 
            { 10, 10, 0 }, 
            { 30, 2, 28 }, 
            { 50, 10, 40 },
            { 12, 6, 6 }
        });
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora(nume1, nume2);
        int resultado = calc.resta();
        assertEquals(result, resultado);
    }
}