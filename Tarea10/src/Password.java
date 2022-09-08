import java.security.SecureRandom;
/*
 * EJERCICIO 5 TAREA 10
 * AUTOR ---> Alvaro Benitez Carmona
 * 
 * */
public class Password {

	private int longitud = 8;
	private String contraseña;
	
	public Password() {
		contraseña=null;
	}
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña=generarContraseña(longitud);
	}
	
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
	
	
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
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
