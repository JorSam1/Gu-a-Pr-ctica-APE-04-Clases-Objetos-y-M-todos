# APE04: Clases, Objetos y Métodos 🎓

Este repositorio contiene el desarrollo práctico correspondiente a la **Actividad Práctica Experimental 04 (APE04)** de la asignatura *Algoritmos y Lógica de Programación*. El objetivo fundamental es implementar un sistema de registro académico aplicando el paradigma de **Programación Orientada a Objetos (POO)** de forma paralela en los lenguajes **C++** y **Java**, además de su correspondiente análisis lógico en **PSeInt**.

---

## 🚀 Descripción del Problema

El sistema automatiza el control de calificaciones de los estudiantes en la asignatura de *Algoritmos y Lógica de Programación*. A través del uso de clases, métodos y encapsulamiento, el software permite:
1. Validar rigurosamente que las notas ingresadas se ubiquen en el rango de `0.00` a `10.00`.
2. Calcular de forma automática el promedio aritmético de 3 notas parciales.
3. Determinar el estado final cualitativo del estudiante bajo la condición fija: **Aprobado** si el promedio es $\ge 7.00$, de lo contrario, **Reprobado**.
4. Generar listados tabulares y métricas estadísticas colectivas del grupo evaluado (conteo de aprobados/reprobados).

---

## 📁 Estructura del Repositorio

Siguiendo las directrices institucionales, el proyecto se encuentra organizado bajo la siguiente arquitectura de archivos:

```text
APE04-Clases-Objetos-Metodos/
│
├── Cpp/
│   ├── main.cpp            # Código fuente con la clase Estudiante y flujo principal en C++
│   └── README.md           # Instrucciones de compilación en C++
│
├── Java/
│   ├── Main.java           # Clase de control y ejecución del programa
│   ├── Estudiante.java     # Clase entidad con lógica de encapsulamiento
│   └── README.md           # Instrucciones de ejecución en Java
│
├── capturas/
│   ├── ejecucion_cpp.png   # Evidencia de ejecución sin errores en C++
│   ├── ejecucion_java.png  # Evidencia de ejecución sin errores en Java
│   └── commits_github.png  # Evidencia del historial de control de versiones
│
└── README.md               # Documentación general del proyecto (Este archivo)
