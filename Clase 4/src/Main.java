// las variables privadas no se ven en el main , no se pueden accesar
public class Main {

	public static void main(String[] args) {
		
		// Haciendo una prueba para saber si funciona ( es como si fuera un Junit )
		
		// crear objeto
		
		CaesarCypher c = new CaesarCypher(3); // el 4 es el key
		
		String clear = "HELLO"; // H -->  K , E --> H --> L --> O , O --> R
		
		String cyphered = c.encode(clear);
		
		// String correct = "KHOOR"; // esto es lo que se supone que imprima
		
		System.out.println(cyphered);
		

	}

}
