import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * TAREA 10 EJERCICIO 10
 * @author Alvaro Benitez Carmona
 *
 */
public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {

			int opcion = 0;
			boolean repetir;

			do {
				repetir = false;
				try {
					menu();
					opcion = teclado.nextInt();
					if (opcion < 1 || opcion > 8) {
						throw new ExcepcionIncorrecta();
					}
				} catch (ExcepcionIncorrecta ex) {
					System.out.println(ex.getMessage());
					teclado.nextLine();
					repetir = true;
				} catch (NumberFormatException ex) {
					System.out.println(ex.getMessage());
					teclado.nextLine();
					repetir = true;
				} catch (InputMismatchException ex) {
					System.out.println("No puedes introducir un caracter");
					teclado.nextLine();
					repetir = true;
				}

			} while (repetir);

			switch (opcion) {
			case 1:
				suma(teclado);
				break;
			case 2:
				resta(teclado);
				break;
			case 3:
				multi(teclado);
				break;
			case 4:
				potencia(teclado);
				break;
			case 5:
				raizCuadrada(teclado);
				break;
			case 6:
				raizCubica(teclado);
				break;
			case 7:
				division(teclado);
				break;
			case 8:
				exit = true;
				System.out.println("CERRANDO CALCULADORA...");
				System.out.println("CALCULADORA APAGADA :D");
				break;
			}
		}

	}
	/**
	 * Metodo para calcular la raiz cubica.
	 * @param teclado
	 */
	private static void raizCubica(Scanner teclado) {
		Boolean ok = true;
		try {
			System.out.println("Has elegido la opcion raiz cubica:");
			System.out.println("Indica un numero para hacer su raiz cubica:");
			int num1 = teclado.nextInt();
			try {
				if (num1 < 0) {
					throw new ExcepcionNumeroNegativo("No se pueden utilizar numeros negativos");
				}
			} catch (ExcepcionNumeroNegativo ex) {
				System.out.println(ex.getMessage());
				ok = false;
			}
			if (ok) {
				System.out.println("La raiz cubica de " + num1 + " es " + Math.pow(num1, 1.0 / 3.0));
			}

		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}
	/**
	 * Metodo para hacer divisiones.
	 * @param teclado
	 */
	private static void division(Scanner teclado) {
		try {
			System.out.println("Has elegido la opcion division:");
			System.out.println("Indica dos numeros para hacer la division:");
			System.out.println("Dividiendo:");
			int num1 = teclado.nextInt();
			System.out.println("Divisor:");
			int num2 = teclado.nextInt();
			System.out.println("Resultado de " + num1 + " entre " + num2 + " = " + (num1 / num2));
			System.out.println("El resto es: " + (num1 % num2));
		} catch (ArithmeticException ex) {
			System.out.println("No se puede poner 0 en el divisor.");
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}
	/**
	 * Metodo para calcular la raiz cuadrada.
	 * @param teclado
	 */
	private static void raizCuadrada(Scanner teclado) {
		boolean ok = true;
		try {
			System.out.println("Has elegido la opcion raiz cuadrada:");
			System.out.println("Indica un numero para hacer su raiz cuadrada:");
			int num1 = teclado.nextInt();
			try {
				if (num1 < 0) {
					throw new ExcepcionNumeroNegativo("No se pueden utilizar numeros negativos");
				}
			} catch (ExcepcionNumeroNegativo ex) {
				System.out.println(ex.getMessage());
				ok = false;
			}
			if (ok) {
				System.out.println("La raiz cuadrada de " + num1 + " es " + Math.pow(num1, 1.0 / 3.0));
			}
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}
	/**
	 * Metodo para hacer la potencia. 
	 * @param teclado
	 */
	private static void potencia(Scanner teclado) {
		try {
			System.out.println("Has elegido la opcion potencia:");
			System.out.println("Indica dos numeros para hacer la potencia:");
			System.out.println("BASE:");
			int num1 = teclado.nextInt();
			System.out.println("Exponete:");
			int num2 = teclado.nextInt();
			System.out.println("Resultado de " + num1 + " ^ " + num2 + " = " + (Math.pow(num1, num2)));
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}
	/**
	 * Metodo apra jacer una multiplicacion.
	 * @param teclado
	 */
	private static void multi(Scanner teclado) {
		try {
			System.out.println("Has elegido la opcion multiplicacion:");
			System.out.println("Indica dos numeros para hacer la multiplicacion:");
			System.out.println("Numero 1:");
			int num1 = teclado.nextInt();
			System.out.println("Numero 2:");
			int num2 = teclado.nextInt();
			System.out.println("Resultado de " + num1 + " x " + num2 + " = " + (num1 * num2));
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}
	/**
	 * Metodo para hacer una resta.
	 * @param teclado
	 */
	private static void resta(Scanner teclado) {
		try {
			System.out.println("Has elegido la opcion resta:");
			System.out.println("Indica dos numeros para hacer la resta:");
			System.out.println("Numero 1:");
			int num1 = teclado.nextInt();
			System.out.println("Numero 2:");
			int num2 = teclado.nextInt();
			System.out.println("Resultado de " + num1 + " - " + num2 + " = " + (num1 - num2));
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}
	/**
	 * Metodo para hacer una suma.
	 * @param teclado
	 */
	private static void suma(Scanner teclado) {
		try {
			System.out.println("Has elegido la opcion suma:");
			System.out.println("Indica dos numeros para hacer la suma:");
			System.out.println("Numero 1:");
			int num1 = teclado.nextInt();
			System.out.println("Numero 2:");
			int num2 = teclado.nextInt();
			System.out.println("Resultado de " + num1 + " + " + num2 + " = " + (num1 + num2));
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}
	/**
	 * Metodo que muestra el menu de la calculadora.
	 */
	private static void menu() {
		System.out.println("CALCULADORA:");
		System.out.println(
				"	1. SUMA\n	2. RESTA\n	3. MULTIPLICACION\n	4. POTENCIA\n	5. RAIZ CUADRADA\n	6. RAIZ CUBICA\n	7. DIVISION\n	8. SALIR\nIndica una opcion:"
						+ "	");
	}

}
