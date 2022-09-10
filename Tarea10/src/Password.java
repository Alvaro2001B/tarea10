import java.security.SecureRandom;
/**
 * TAREA 10 EJERCICIO 5
 * @author Alvaro Benitez Carmona
 *
 */
public class Password {

	private int longitud = 8;
	private String contraseña;
	/**
	 * Constructor por defecto.
	 */
	public Password() {
		contraseña=null;
	}
	/**
	 * Constructor pasando por parametro la longitud de la constraseña.
	 * @param longitud
	 */
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña=generarContraseña(longitud);
	}
	/**
	 * Metodo para saber si la contrsela es fuerte o no.
	 * @return Devuelve true si es fuerte o false si es floja.
	 */
	public Boolean esFuerte()	 {
		//Cogemos el string y lo guardamos en una array de char.
		char[] passList=contraseña.toCharArray();
		int min=0, mayus = 0, num=0;
		//En cada iteracion comparamos si es mayuscula, miniscula o un numero
		for(int i =0;i<passList.length;i++) {
			if(String.valueOf(passList[i]).matches("[A-Z]*")){
				mayus++;
			}else if(String.valueOf(passList[i]).matches("[a-z]*")) {
				min++;
			}else if(String.valueOf(passList[i]).matches("[0-9]*")) {
				num++;
			}
		}
		if(mayus >= 2 && min >= 1 && num >= 5 ) {
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * Metodo getLongitud 
	 * @return Devuelve la longitud de la constraseña.
	 */
	public int getLongitud() {
		return longitud;
	}
	/**
	 * Metodo para modificar la longitud. 
	 * @param longitud
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	/**
	 * Metodo getConstraseña
	 * @return Devuelve la contraseña.
	 */
	public String getContraseña() {
		return contraseña;
	}
	/**
	 * Metodo para modificar la contraseña.
	 * @param contraseña
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	/**
	 * Metodo que genera una contraseña aleatoria en funcion de una longitud determinada. 
	 * @param longitud
	 * @return Devuelve una constraseña aleatoria.
	 */
	private String generarContraseña(int longitud) {
		//Este es el rango para crear la contraseña
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		 SecureRandom random = new SecureRandom();
	     StringBuilder sb = new StringBuilder();
	     
	     //Cada vez que hace una iteracion elegimos un nuevo elemento
	     for (int i = 0; i < longitud; i++)
	        {
	            int randomIndex = random.nextInt(chars.length());
	            sb.append(chars.charAt(randomIndex));
	        }
	 
	     return sb.toString();
		
	}
}
