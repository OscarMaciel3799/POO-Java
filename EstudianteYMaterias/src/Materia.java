class Materia {
    private String nombreMateria;
    private String codigoMateria;
    private double calificacion;

    public Materia(String nombreMateria, String codigoMateria) {
        this.nombreMateria = nombreMateria;
        this.codigoMateria = codigoMateria;
        this.calificacion = -1;  // Inicialmente, la calificación es desconocida
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            this.calificacion = calificacion;
        } else {
            System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
        }
    }

    public boolean estaAprobada() {
        return calificacion >= 6;  // Por ejemplo, aprobar con una calificación de 6 o superior
    }

    public void mostrarInformacion() {
        System.out.println("Materia: " + nombreMateria + " (Código: " + codigoMateria + ")");
        if (calificacion >= 0) {
            System.out.println("Calificación: " + calificacion);
        } else {
            System.out.println("Aún no calificada.");
        }
        System.out.println("Aprobada: " + (estaAprobada() ? "Sí" : "No"));
    }
}
