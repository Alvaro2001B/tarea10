/**
 * TAREA 10 EJERCICIO 3
 * @author Alvaro Benitez Carmona
 *
 */
public class ExcepcionParImpar extends Exception {
	
	private int num;
	/**
	 * Contructor pasando un numero por parametro.
	 * @param num
	 */
	public ExcepcionParImpar(int num) {
		super();
		this.num=num;
		
	}
	/**
	 * Metodo que devuelve si el numero es par o impar.
	 */
	@Override
	public String getMessage() {
		if(num%2==0) {
			return "El numero es par";
		}else{
			return "El numero es impar";
		}
	}
	
}

