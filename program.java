import java.util.Scanner;
import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> entradas = new ArrayList<>();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar nueva entrada");
            System.out.println("2. Eliminar entrada");
            System.out.println("3. Ver entradas");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la nueva entrada: ");
                    scanner.nextLine(); // Consume la nueva línea pendiente
                    String nuevaEntrada = scanner.nextLine();
                    entradas.add(nuevaEntrada);
                    System.out.println("Entrada agregada correctamente.");
                    break;
                case 2:
                    if (entradas.isEmpty()) {
                        System.out.println("No hay entradas para eliminar.");
                    } else {
                        System.out.println("Entradas disponibles:");
                        for (int i = 0; i < entradas.size(); i++) {
                            System.out.println((i + 1) + ". " + entradas.get(i));
                        }
                        System.out.print("Ingrese el número de entrada a eliminar: ");
                        int indiceEliminar = scanner.nextInt();
                        if (indiceEliminar >= 1 && indiceEliminar <= entradas.size()) {
                            entradas.remove(indiceEliminar - 1);
                            System.out.println("Entrada eliminada correctamente.");
                        } else {
                            System.out.println("Número de entrada no válido.");
                        }
                    }
                    break;
                case 3:
                    if (entradas.isEmpty()) {
                        System.out.println("No hay entradas para mostrar.");
                    } else {
                        System.out.println("Entradas:");
                        for (String entrada : entradas) {
                            System.out.println("- " + entrada);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
