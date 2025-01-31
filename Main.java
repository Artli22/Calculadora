/** Universidad del Valle de Guatemala 
 * Algoritmos y Estructura de Datos
 * Hoja de Trabajo no.2: Programa de Evaluacion Postfix
 * Grupo no: 12
 * Arturo Lima - 24683
 * Ronald Catun - 19789
 * Luis Hernandez - 24337
*/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Interfaz calculadora = new CalculadoraPostfix(); 
        boolean menu = true;

        System.out.println("***** Calculadora Postfix - versión 1.3 *****");

        while (menu) {
            System.out.println("1. Leer archivo con expresión");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            int resultado = calculadora.evaluar(linea);
                            System.out.println("Resultado: " + resultado);
                        }
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


