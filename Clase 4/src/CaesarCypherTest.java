import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCypherTest {

	@Test
	void testEncode1() {
	
		// crear objeto
		
		// pueba 
		
		CaesarCypher c = new CaesarCypher(3);
		
		
		
		// assertEquals le pasa dos objetos que diga que sea correcto o falso
		// compara si esa dos objetos  son iguales
		
		assertEquals("KHOOR" , c.encode("HELLO"));
	}
	

	// hacer una prueba que diga que la palabra correcta sea KHOOR
	
	
}
