
public class CaesarCypher {
	
	private int key; // el key de la palabra, la posicion que me voy a mover
	
	private  final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // es final  por que nunca cambia esta variable , static significa que todos los objetos lo comparten
	
	
	// empezar el alfabeto pero contando desde la posicion del key 
	
	/* Ejemplo
	 * 
	 * Key = 4
	 * 
	 * EFGHIJKLMNOPQRSTUVWXYZABCD
	 */
	
	private static String shiftedAlphabet;
	
	// constructor
	
	public CaesarCypher( int key)
	{
		
		this.key = key;
		String leftSubstring = alphabet.substring(0 ,key); // desde el inicio hasta la posicion del key
		String rightSubstring = alphabet.substring(key);
		shiftedAlphabet = leftSubstring + rightSubstring ; // nuevo orden del abecedario
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
