/**
 * TAREA 10 EJERCICIO 2
 * @author Alvaro Benitez Carmona
 *
 */
public class MainExcepcionIncorrecta {

	public static void main(String[] args) {
		
		String mensaje = "2342";
		try {
			int num=500;
			System.out.println("Introduce un numero del 1 al 10:");
			if(num>10 || num < 1) {
				throw new ExcepcionIncorrecta();
			}
		}catch(ExcepcionIncorrecta ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Programa terminado");
		}

	}

}
