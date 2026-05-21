import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.util.in);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        int cantidadMinima = 5;
        int aprobados = 0;
        int reprobados = 0;

        System.out.println("=== REGISTRO DE ESTUDIANTES - ALGORITMOS Y LOGICA (JAVA) ===");

        for (int i = 0; i < cantidadMinima; i++) {
            System.out.println("\n--- Estudiante " + (i + 1) + " ---");
            System.out.print("Ingrese Cedula: ");
            String cedula = entrada.next();
            System.out.print("Ingrese Nombre: ");
            String nombre = entrada.next();
            System.out.print("Ingrese Apellido: ");
            String apellido = entrada.next();

            // Validación de rango para las 3 notas
            double n1 = ingresarNotaValidada(entrada, "Nota 1");
            double n2 = ingresarNotaValidada(entrada, "Nota 2");
            double n3 = ingresarNotaValidada(entrada, "Nota 3");

            // Instancia de la clase Estudiante
            Estudiante est = new Estudiante(cedula, nombre, apellido, n1, n2, n3);
            listaEstudiantes.add(est);

            if (est.getEstado().equals("Aprobado")) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Mostrar listado completo en formato tabular
        System.out.println("\n========================================= LISTADO COMPLETO =========================================");
        System.out.printf("%-12s %-15s %-15s %-8s %-8s %-8s %-10s %-12s%n", 
                "Cedula", "Nombre", "Apellido", "N1", "N2", "N3", "Promedio", "Estado");
        System.out.println("----------------------------------------------------------------------------------------------------");
        
        for (Estudiante est : listaEstudiantes) {
            est.mostrarInformacion();
        }
        System.out.println("====================================================================================================");

        // Mostrar métricas solicitadas
        System.out.println("\n=== ESTADISTICAS DEL GRUPO ===");
        System.out.println("Estudiantes Aprobados: " + aprobados);
        System.out.println("Estudiantes Reprobados: " + reprobados);
        
        entrada.close();
    }

    // Método auxiliar estático para validar la entrada numérica de notas entre 0 y 10
    private static double ingresarNotaValidada(Scanner sc, String nombreNota) {
        double nota;
        while (true) {
            System.out.print("Ingrese la " + nombreNota + " (0 - 10): ");
            if (sc.hasNextDouble()) {
                nota = sc.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    return nota;
                }
            } else {
                sc.next(); // Limpiar entrada inválida si meten texto
            }
            System.out.println("[Error] La nota debe estar estrictamente entre 0 y 10. Intente de nuevo.");
        }
    }
}
