/*
 * EJERCICIO 3 TAREA 10
 * AUTOR ---> Alvaro Benitez Carmona
 * 
 * */
public class MainExceptionParImapr {

	public static void main(String[] args) {
		
		
		int numRandom = (int) Math.floor(Math.random()*(0-999+1)+999);
			
		System.out.println("Generando numero aleatorio....");
		System.out.println("Numero aleatorio generado. El numero es: "+numRandom);
		try {
			throw new ExcepcionParImpar(numRandom);
		}catch(ExcepcionParImpar ex) {
			System.out.println(ex.getMessage());
		}finally{
			System.out.println("Fin del pragrama.");
		}
	}

}
