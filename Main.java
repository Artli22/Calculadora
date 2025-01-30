/** Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos
 * Hoja de Trabajo no.2: Programa de Evaluacion Postfix
 * Grupo no: 12
 * Arturo Lima - 24683
 * Ronald Catun - 19789
 * Luis Hernandez - 
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraPostfix calculadora = new CalculadoraPostfix(); 
        boolean menu = true;

        System.out.println("***** Calculadora Postfix - versión 1.3 *****");

        while (menu) {
            System.out.println("1. Ingresar expresión matematica (a b +)");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la expresión en notación postfix: ");
                    String expresion = scanner.nextLine();

                    try {
                        int resultado = calculadora.evaluate(expresion);
                        System.out.println("Resultado: " + resultado);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa.");
                    menu = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        scanner.close();
    }
}


