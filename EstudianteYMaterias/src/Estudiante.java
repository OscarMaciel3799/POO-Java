import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private int edad;
    public List<Materia> listaDeMaterias;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaDeMaterias = new ArrayList<>();
    }

    public void agregarMateria(Materia materia) {
        listaDeMaterias.add(materia);
    }

    public void mostrarMaterias() {
        System.out.println("Estudiante: " + nombre + " (Edad: " + edad + ")");
        System.out.println("Materias inscritas:");
        if (listaDeMaterias.isEmpty()) {
            System.out.println("El estudiante no está inscrito en ninguna materia.");
        } else {
            for (Materia materia : listaDeMaterias) {
                materia.mostrarInformacion();
                System.out.println();
            }
        }
    }

    public boolean estaInscritoEn(String codigoMateria) {
        for (Materia materia : listaDeMaterias) {
            if (materia.getCodigoMateria().equals(codigoMateria)) {
                return true;
            }
        }
        return false;
    }

    public void inscribirEnMateria(Materia materia) {
        if (!estaInscritoEn(materia.getCodigoMateria())) {
            agregarMateria(materia);
            System.out.println("Materia " + materia.getNombreMateria() + " agregada con éxito.");
        } else {
            System.out.println("El estudiante ya está inscrito en la materia " + materia.getNombreMateria());
        }
    }
}
