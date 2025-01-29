import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Stack<Integer> stack = new StackVector1<>();
        boolean menu = true;

        System.out.println("*****Calculadora Postfix -version 1.3*****");

        while (menu) {
            System.out.println("\n--- Menú de Calculadora---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Remover elemento");
            System.out.println("3. Ver último elemento");
            System.out.println("4. Verificar si está vacía");
            System.out.println("5. Ver tamaño de la ecuacion");
            System.out.println("6. Mostrar ecuacion completa");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número a agregar: ");
                    int num = scanner.nextInt();
                    stack.push(num);
                    System.out.println("Elemento agregado.");
                    break;
                case 2:
                    if (!stack.empty()) {
                        int removed = stack.pop();
                        System.out.println("Elemento removido: " + removed);
                    } else {
                        System.out.println("La pila está vacía. No se puede hacer pop.");
                    }
                    break;
                case 3:
                    if (!stack.empty()) {
                        System.out.println("Último elemento: " + stack.peek());
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 4:
                    System.out.println("¿La pila está vacía? " + stack.empty());
                    break;
                case 5:
                    System.out.println("Tamaño de la pila: " + stack.size());
                    break;
                case 6:
                    System.out.println("Contenido actual de la pila: " + stack.toString());
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Gracias por usar la pila en Java!");
                    menu = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}
