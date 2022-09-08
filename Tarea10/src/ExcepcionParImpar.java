/*
 * EJERCICIO 3 TAREA 10
 * AUTOR ---> Alvaro Benitez Carmona
 * 
 * */
public class ExcepcionParImpar extends Exception {
	
	private int num;
	
	public ExcepcionParImpar(int num) {
		super();
		this.num=num;
		
	}
	
	@Override
	public String getMessage() {
		if(num%2==0) {
			return "El numero es par";
		}else{
			return "El numero es impar";
		}
	}
	
}

