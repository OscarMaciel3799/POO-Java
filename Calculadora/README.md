<h1>Calculadora en Java - Programación Orientada a Objetos</h1>
Este proyecto consiste en una calculadora interactiva desarrollada en Java. La calculadora permite al usuario realizar diferentes operaciones matemáticas como suma, resta, multiplicación, división, potencia y raíz cuadrada. Cada operación se maneja mediante clases que implementan una interfaz común, lo que permite que las operaciones se realicen de manera flexible y extensible.

<h3>🚀 Funcionalidades</h3>
<h4>La calculadora ofrece las siguientes operaciones:</h4>

<ul>
<li>Suma: Suma dos números.</li>
<li>Resta: Resta el segundo número del primero.</li>
<li>Multiplicación: Multiplica dos números.</li>
<li>División: Divide el primer número por el segundo.</li>
<li>Potencia: Calcula la potencia de un número elevado a otro.</li>
<li>Raíz cuadrada: Calcula la raíz cuadrada de un número positivo.</li>
</ul>

<h3>🧩 Diseño del Proyecto</h3>
El proyecto sigue los principios de la Programación Orientada a Objetos (POO) mediante el uso de clases e interfaces:

<ul>
<li>Interfaz Operacion: Define el método calcular() que será implementado por todas las operaciones.</li>
<li>Clases de operaciones: Cada operación (como Suma, Resta, Multiplicacion, etc.) implementa la interfaz Operacion y define su propio comportamiento del método calcular().</li>
<li>Clase Main: Gestiona la interacción con el usuario, proporcionando un menú de opciones y ejecutando la operación seleccionada por el usuario.</li>
</ul>

<h3>📝 Ejemplo de uso:</h3>

Al ejecutar la calculadora, el programa mostrará un menú con las siguientes opciones:
```bash
1. Suma
2. Resta
3. Multiplicación
4. División
5. Potencia
6. Raíz cuadrada
```

El usuario debe ingresar el número de la operación que desea realizar y luego proporcionar los números necesarios para esa operación. El resultado será mostrado en la consola.
