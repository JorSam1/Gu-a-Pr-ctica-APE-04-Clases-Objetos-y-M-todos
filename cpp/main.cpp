#include <iostream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

// Clase Estudiante que aplica los principios de la POO
class Estudiante {
private:
    // Atributos privados para garantizar el encapsulamiento
    string cedula;
    string nombre;
    string apellido;
    double nota1;
    double nota2;
    double nota3;
    double promedio;
    string estado;

public:
    // Constructor vacío por defecto
    Estudiante() {
        nota1 = nota2 = nota3 = promedio = 0.0;
        estado = "Reprobado";
    }

    // Constructor parametrizado
    Estudiante(string _cedula, string _nombre, string _apellido, double _n1, double _n2, double _n3) {
        cedula = _cedula;
        nombre = _nombre;
        apellido = _apellido;
        nota1 = _n1;
        nota2 = _n2;
        nota3 = _n3;
        calcularPromedio();
        determinarEstado();
    }

    // Métodos de acceso (Getters y Setters)
    string getCedula() { return cedula; }
    void setCedula(string _cedula) { cedula = _cedula; }

    string getNombre() { return nombre; }
    void setNombre(string _nombre) { nombre = _nombre; }

    string getApellido() { return apellido; }
    void setApellido(string _apellido) { apellido = _apellido; }

    double getNota1() { return nota1; }
    void setNota1(double _n1) { nota1 = _n1; calcularPromedio(); determinarEstado(); }

    double getNota2() { return nota2; }
    void setNota2(double _n2) { nota2 = _n2; calcularPromedio(); determinarEstado(); }

    double getNota3() { return nota3; }
    void setNota3(double _n3) { nota3 = _n3; calcularPromedio(); determinarEstado(); }

    double getPromedio() { return promedio; }
    string getEstado() { return estado; }

    // Método para calcular automáticamente el promedio
    void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3.0;
    }

    // Método para determinar si aprueba o reprueba (Condición >= 7.00)
    void determinarEstado() {
        if (promedio >= 7.00) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    // Método para mostrar la información formateada del estudiante
    void mostrarInformacion() {
        cout << left << setw(12) << cedula 
             << setw(15) << nombre 
             << setw(15) << apellido 
             << setw(8) << fixed << setprecision(2) << nota1 
             << setw(8) << nota2 
             << setw(8) << nota3 
             << setw(10) << promedio 
             << setw(12) << estado << endl;
    }
};

// Función auxiliar para validar que las notas estén entre 0 y 10
double ingresarNotaValidada(string numeroNota) {
    double nota;
    while (true) {
        cout << "Ingrese la " << numeroNota << " (0 - 10): ";
        cin >> nota;
        if (nota >= 0 && nota <= 10) {
            return nota;
        }
        cout << "[Error] La nota debe estar estrictamente entre 0 y 10. Intente de nuevo.\n";
    }
}

int main() {
    vector<Estudiante> listaEstudiantes;
    int cantidadMinima = 5;
    int aprobados = 0, reprobados = 0;

    cout << "=== REGISTRO DE ESTUDIANTES - ALGORITMOS Y LOGICA (C++) ===" << endl;
    
    // Bucle para registrar los 5 estudiantes requeridos
    for (int i = 0; i < cantidadMinima; i++) {
        string cedula, nombre, apellido;
        double n1, n2, n3;

        cout << "\n--- Estudiante " << (i + 1) << " ---" << endl;
        cout << "Ingrese Cedula: ";
        cin >> cedula;
        cout << "Ingrese Nombre: ";
        cin >> nombre;
        cout << "Ingrese Apellido: ";
        cin >> apellido;
        
        // Uso de la función de validación
        n1 = ingresarNotaValidada("Nota 1");
        n2 = ingresarNotaValidada("Nota 2");
        n3 = ingresarNotaValidada("Nota 3");

        // Instanciación del objeto y adición a la lista
        Estudiante est(cedula, nombre, apellido, n1, n2, n3);
        listaEstudiantes.push_back(est);
        
        // Contabilizar estados
        if (est.getEstado() == "Aprobado") {
            aprobados++;
        } else {
            reprobados++;
        }
    }

    // Despliegue de resultados en formato de tabla
    cout << "\n========================================= LISTADO COMPLETO =========================================\n";
    cout << left << setw(12) << "Cedula" << setw(15) << "Nombre" << setw(15) << "Apellido" 
         << setw(8) << "N1" << setw(8) << "N2" << setw(8) << "N3" << setw(10) << "Promedio" << setw(12) << "Estado" << endl;
    cout << "----------------------------------------------------------------------------------------------------\n";
    
    for (int i = 0; i < listaEstudiantes.size(); i++) {
        listaEstudiantes[i].mostrarInformacion();
    }
    cout << "====================================================================================================\n";

    // Estadísticas finales
    cout << "\n=== ESTADISTICAS DEL GRUPO ===" << endl;
    cout << "Estudiantes Aprobados: " << aprobados << endl;
    cout << "Estudiantes Reprobados: " << reprobados << endl;

    return 0;
}
