import java.util.ArrayList;
import java.util.Scanner;
/*
 * EJERCICIO 5 TAREA 10
 * AUTOR ---> Alvaro Benitez Carmona
 * 
 * */
public class MainPassword {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Bienvenido al generador de contrase�as, cuantas contrase�as quieres generar.");
		int numPassword=teclado.nextInt();
		System.out.println("Indica la longitud de las contrase�as:");
		int longPassword=teclado.nextInt();
		
		ArrayList<Password> ListPassword=new ArrayList<Password>();
		ArrayList<Boolean> ListEsFuerte=new ArrayList<Boolean>();
		for(int i=0;i<numPassword;i++) {
			Password pass=new Password(longPassword);
			ListPassword.add(pass);
		}
		
		for(int i=0;i<numPassword;i++) {
			ListEsFuerte.add(ListPassword.get(i).esFuerte());
		}
		ListaToString(ListPassword,ListEsFuerte);
	}
	private static void ListaToString(ArrayList<Password> ListPassword,ArrayList<Boolean> ListEsFuerte) {
		for(int i=0;i<ListPassword.size();i++) {
			System.out.print("Constrase�a "+(i+1)+"---->"+ListPassword.get(i).getContrase�a()+"         Nivel de seguridad ---->");
			//Si es TRUE el nivel de seguridad es alto si es FALSE el nivel de seguirdad es bajo
			if(ListEsFuerte.get(i)) {
				System.out.print(" ALTO\n");
			}else {
				System.out.print(" BAJO\n");
			}
		}
	}

}
