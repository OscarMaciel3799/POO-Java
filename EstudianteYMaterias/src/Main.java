import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear algunas materias disponibles
        List<Materia> listaMateriasDisponibles = new ArrayList<>();
        listaMateriasDisponibles.add(new Materia("Matemáticas", "MAT101"));
        listaMateriasDisponibles.add(new Materia("Física", "FIS101"));
        listaMateriasDisponibles.add(new Materia("Historia", "HIS101"));
        listaMateriasDisponibles.add(new Materia("Química", "QUI101"));
        listaMateriasDisponibles.add(new Materia("Inglés", "ING101"));

        // Crear un estudiante
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 20);

        // Mostrar las materias disponibles para inscribirse
        System.out.println("Materias disponibles para inscribirse:");
        for (int i = 0; i < listaMateriasDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + listaMateriasDisponibles.get(i).getNombreMateria() + " (Código: " +
                    listaMateriasDisponibles.get(i).getCodigoMateria() + ")");
        }

        // Inscribir al estudiante en materias
        while (true) {
            System.out.println("Ingrese el número de la materia en la que desea inscribirse (0 para terminar):");
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                break;
            } else if (opcion > 0 && opcion <= listaMateriasDisponibles.size()) {
                Materia materiaElegida = listaMateriasDisponibles.get(opcion - 1);
                estudiante1.inscribirEnMateria(materiaElegida);
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        // Asignar calificaciones a las materias
        System.out.println("Asignar calificaciones a las materias inscritas:");
        for (Materia materia : estudiante1.listaDeMaterias) {
            System.out.println("Ingrese la calificación para la materia: " + materia.getNombreMateria());
            double calificacion = scanner.nextDouble();
            materia.setCalificacion(calificacion);
        }

        // Mostrar las materias del estudiante
        estudiante1.mostrarMaterias();
    }
}