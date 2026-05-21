# Componente de Desarrollo: Java ☕

Este directorio contiene la solución al problema de registro académico implementada en el lenguaje de programación **Java**. La aplicación aprovecha las características nativas de la plataforma Java (Java SE) para estructurar el software mediante una separación limpia de responsabilidades en clases independientes.

---

## 🛠️ Características de la Implementación

* **Modularidad y Separación de Clases:** A diferencia de C++, en Java se aplica de forma estricta el estándar industrial de diseño, dividiendo el programa en dos archivos fuente:
  * `Estudiante.java`: Funciona como la clase entidad o modelo. Encapsula los atributos y contiene la lógica de negocio del estudiante.
  * `Main.java`: Funciona como la clase de control. Gestiona la captura de datos por consola, las validaciones y el ciclo de vida de la aplicación.
* **Colecciones del Framework de Java (`Collections API`):** Se hace uso de la clase **`java.util.ArrayList`** para almacenar el lote de objetos. Al ser una lista basada en un arreglo dinámico, permite un manejo elástico y seguro de la memoria en comparación con los arreglos primitivos fijos (`[]`).
* **Robustez en la Entrada de Datos:** El flujo de lectura utiliza la clase `Scanner`. El método de validación implementa el chequeo `sc.hasNextDouble()` para limpiar el búfer de entrada en caso de que el usuario introduzca caracteres alfabéticos por error, evitando que el programa colapse (`InputMismatchException`).
* **Formateo de Salida Profesional:** Se utiliza el método `System.out.printf()` con especificadores de formato (como `%-12s` y `%-8.2f`) para garantizar una alineación tabular perfecta y simétrica de las columnas en la consola, independientemente de la longitud de los nombres o apellidos.

---

## 📂 Archivos en esta Carpeta

* `Estudiante.java`: Definición de la clase con sus atributos privados, constructores, métodos `get/set`, cálculo de promedio y asignación cualitativa de estado.
* `Main.java`: Orquestador principal que interactúa con el usuario, valida las notas en el rango de `0` a `10` y genera las estadísticas del grupo.

---

## 🚀 Instrucciones de Compilación y Ejecución

Para compilar y ejecutar este programa desde la terminal, es necesario tener instalado el Kit de Desarrollo de Java (**JDK 17** o superior) y configuradas las variables de entorno (`JAVA_HOME`).

### 1. Compilación
Abre la terminal de tu sistema, navega hasta esta carpeta (`Java/`) y compila ambos archivos simultáneamente con el compilador de Java (`javac`):

```bash
javac Estudiante.java Main.java
