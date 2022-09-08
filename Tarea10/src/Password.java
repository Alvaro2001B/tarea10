import java.security.SecureRandom;
/*
 * EJERCICIO 5 TAREA 10
 * AUTOR ---> Alvaro Benitez Carmona
 * 
 * */
public class Password {

	private int longitud = 8;
	private String contrase�a;
	
	public Password() {
		contrase�a=null;
	}
	public Password(int longitud) {
		this.longitud=longitud;
		this.contrase�a=generarContrase�a(longitud);
	}
	
	public Boolean esFuerte()	 {
		//Cogemos el string y lo guardamos en una array de char.
		char[] passList=contrase�a.toCharArray();
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	private String generarContrase�a(int longitud) {
		//Este es el rango para crear la contrase�a
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
