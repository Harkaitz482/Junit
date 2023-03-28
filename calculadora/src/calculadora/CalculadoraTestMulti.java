package calculadora;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class CalculadoraTestMulti {

    private int nume1;
    private int nume2;
    private int result;
    
    public CalculadoraTestMulti(int nume1, int nume2, int result) {
        this.nume1 = nume1;
        this.nume2 = nume2;
        this.result = result;
    }

    @Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][] { 
            { 10, 10, 100 }, 
            { 30, 2, 60 }, 
            { 50, 10, 500 },
            { 12, 6, 72 }
        });
    }

    @Test
    public void testMulti() {
        Calculadora calc = new Calculadora(nume1, nume2);
        int resultado = calc.multiplicacion();
        assertEquals(result, resultado);
    }
}