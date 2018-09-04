
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
	
	// constructor  ( inicializa los valores de las propiedades que tiene cada instancia de la clase)
	
	public CaesarCypher( int key)
	{
		
		this.key = key;
		String leftSubstring = alphabet.substring(0 ,key); // imprime desde el inicio hasta la posicion del key
		String rightSubstring = alphabet.substring(key);   // imprime desde la posicion del key
		shiftedAlphabet = leftSubstring + rightSubstring ; // nuevo orden del abecedario
		
		// ejemplo
		
		//string = "hello"
		//“hamburger”.substring (4, 8); devuelve “urge”. imprime desde la posicion 4 hasta la posicion 8-1 = 7
	}
	
	// crear metodo
	
	public String encode( String  clearText)
	{
		
		String text = "";
		
		for ( int i = 0 ;  i< clearText.length() ; i++ )
		{
			
			text += shiftedAlphabet.charAt(alphabet.indexOf(clearText.charAt(i)));
			
			/*
			 * Ejemplo
			 * 
			 *  clearText xyz , 
			 *  
			 *  x es la posicion 0 de clearText
			 *  y es la posicion 1 de clearText
			 *  z es la posicion 2 de clearText
			 *  
			 *  clearText.ChartAt(1) --> devuelve la letra en la posicion 1 , es decir y
			 *  
			 *  sea alphabet es abecedario ABCDEFGHIJKLMNOPQRSTUVWXYZ
			 *  
			 *  alphabet.indexOf(clearText.chartAt(1) --> alphabet.indexOf(y) , lo que hace es buscar la posicion de y en el alphabet , es decir 24
			 *  
			 *  sea shiftedAlphabet el nuevo abecedario con el key , entonces:
			 *  
			 *  shiftedAlphabet.chartAt(alphabet.indexOf(clearText.chartAt(1))) --> shiftedAlphabet.chartAt(24)
			 *  
			 *  si el key = 1 , el shiftedAlphabet es BCDEFGHIJKLMNOPQRSTUVWXYZA
			 *  
			 *  donde la letra que se encuentra en la posicion 24 de este  nuevo alphabeto es 23
			 *  
			 *  
			 */
		}
		
		
           return text;
	
	}
	
	
	
	
	
	
	

}
