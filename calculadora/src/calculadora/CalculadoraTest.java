package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void createCalc() {
		calc = new Calculadora(20,10);
	}
    @AfterEach
    public void deleteCalc() {
        calc = null;
    }

	@Test
	public void TestSuma() {
		int resultado = calc.suma();
		assertEquals(30,resultado,"Error en la suma");
	}
	@Test
	public void TestResta() {
	        int resultado = calc.resta();
	        assertEquals(10, resultado, "Error en la resta");
	    }

	 @Test
	    public void testResta2() {
	        boolean resultado = calc.resta2();
	        assertTrue(resultado, "Error en resta2()");
	    }
	 
	 @Test
	 public void TestMultiplicacion() {
	        int resultado = calc.multiplicacion();
	        assertEquals(200, resultado, "Error en la multiplicación");
	    }

	  @Test
	  public void TestDivision() {
	        int resultado = calc.division();
	        assertEquals(2, resultado, "Error en la división");
	    }
	  @Test
	    public void testDivision2() {
	        Integer resultado = calc.divide2();
	        assertNotNull(resultado, "Error en divide2(): resultado es null");
	        assertEquals(2, resultado.intValue(), "Error en la división");
	    }
	  

}
