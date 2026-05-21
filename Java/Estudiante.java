public class Estudiante {
    // Atributos privados
    private String cedula;
    private String name; // 'name' para evitar colisión con 'nombre' si fuera necesario, usaremos los estándar
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private String estado;

    // Constructor vacío
    public Estudiante() {
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
        this.promedio = 0.0;
        this.estado = "Reprobado";
    }

    // Constructor parametrizado
    public Estudiante(String cedula, String nombre, String apellido, double nota1, double nota2, double nota3) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        calcularPromedio();
        determinarEstado();
    }

    // Métodos Get y Set
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = nota1; calcularPromedio(); determinarEstado(); }

    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { this.nota2 = nota2; calcularPromedio(); determinarEstado(); }

    public double getNota3() { return nota3; }
    public void setNota3(double nota3) { this.nota3 = nota3; calcularPromedio(); determinarEstado(); }

    public double getPromedio() { return promedio; }
    public String getEstado() { return estado; }

    // Método para calcular el promedio
    public void calcularPromedio() {
        this.promedio = (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }

    // Método para determinar si aprueba o reprueba
    public void determinarEstado() {
        if (this.promedio >= 7.00) {
            this.estado = "Aprobado";
        } else {
            this.estado = "Reprobado";
        }
    }

    // Método para mostrar la información del estudiante usando System.out.printf
    public void mostrarInformacion() {
        System.out.printf("%-12s %-15s %-15s %-8.2f %-8.2f %-8.2f %-10.2f %-12s%n", 
                cedula, nombre, apellido, nota1, nota2, nota3, promedio, estado);
    }
}
