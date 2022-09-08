import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * EJERCICIO 1 TAREA 10
 * AUTOR ---> Alvaro Benitez Carmona
 * 
 * */
public class AdivinaElNumero {

	public static void main(String[] args) {
		
		int numRandom = (int) Math.floor(Math.random()*(1-500+1)+500);
		System.out.println(numRandom);
		Scanner teclado=new Scanner(System.in);
		System.out.println("Bienvenido al juego de adivinar el numero.");
		Boolean numCorrecto=false;
		int numeroIntentos=0;
		int num = 0;
		
		while(!numCorrecto) {
			boolean repetir;
			
			do {
				repetir=false;
				try{
					System.out.println( "Indica un numero entre el 1 y el 500:");
					num=teclado.nextInt();
					
				}catch(InputMismatchException e) {
					System.out.println("ERROR. Introduce un nuevo valor corrector para poder jugar;\n");
					teclado.nextLine();
					numeroIntentos++;
					repetir=true;
			  }
				
			}while(repetir);
				
			
				if(num==numRandom) {
					System.out.println("Numero correcto has ganado el juego!!! :D.\nNumero de intentos:"+numeroIntentos );
					numCorrecto=true;
				}
				else if(num>numRandom) {
						System.out.println("El numero indicado es mayor.");
						numeroIntentos++;
					} else {
						System.out.println("El numero indicado es menor.");	
						numeroIntentos++;
					}
		}	
		

   
}
}