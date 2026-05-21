# Componente de Desarrollo: C++ 💻

Este directorio contiene la solución al problema de registro académico implementada en el lenguaje de programación **C++**. El desarrollo aplica de forma estricta los fundamentos del paradigma de Programación Orientada a Objetos (POO) y el uso de la biblioteca estándar para el manejo dinámico de memoria.

---

## 🛠️ Características de la Implementación

* **Clase `Estudiante`:** Definida de forma unificada en el archivo para facilitar la portabilidad. Cuenta con atributos completamente privados, constructores (por defecto y parametrizado), métodos accesores/mutadores (`get`/`set`), y métodos de procesamiento automático de datos.
* **Encapsulamiento Avanzado:** Los métodos `set` de las calificaciones invocan internamente de manera automática a `calcularPromedio()` y `determinarEstado()`. Esto garantiza la consistencia del objeto, impidiendo que existan discrepancias entre las notas y los resultados.
* **Gestión de Memoria Dinámica:** En lugar de usar arreglos estáticos de tamaño fijo, se utiliza la estructura **`std::vector`** de la biblioteca estándar (`<vector>`). Esto permite almacenar la colección de objetos `Estudiante` secuencialmente en la memoria dinámica (Heap).
* **Formateo Tabular de Consola:** Se hace uso de la librería `<iomanip>` mediante los manipuladores `setw`, `left`, `fixed` y `setprecision` para generar un reporte limpio en formato de tabla con dos decimales exactos.

---

## 📂 Archivos en esta Carpeta

* `main.cpp`: Archivo fuente principal que contiene la declaración de la clase, las funciones de validación perimetral y el bucle de ejecución principal.

---

## 🚀 Instrucciones de Compilación y Ejecución

Para compilar y ejecutar este programa localmente, asegúrate de contar con un compilador de C++ (como `g++` de MinGW o GCC) instalado en tu sistema.

### 1. Compilación mediante Terminal
Abre la terminal de tu sistema operativo, navega hasta esta carpeta (`Cpp/`) y ejecuta el siguiente comando:

```bash
g++ -std=c++11 main.cpp -o SistemaEstudiantes
