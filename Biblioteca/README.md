<h1>📚 Biblioteca Virtual - Programación Orientada a Objetos</h1>
¡Bienvenido a Biblioteca Virtual, una aplicación simple para gestionar libros, donde los usuarios pueden explorar géneros literarios, alquilar y devolver libros de forma interactiva!

<h3>🚀 Funcionalidades</h3>
<ul>
<li>Permite al usuario ver los géneros de libros disponibles en la biblioteca.</li>
<li>Muestra todos los libros disponibles dentro de un género literario específico.</li>
<li>Permite al usuario seleccionar un libro por su título y marcarlo como alquilado si está disponible.</li>
<li>Permite al usuario devolver un libro previamente alquilado, poniéndolo nuevamente a disposición.</li>
<li>Lista todos los libros disponibles en la biblioteca, junto con su estado (disponible o alquilado).</li>
</ul>

<h3>🛠️ Estructura del Código</h3>
<ul>
<li>Clase Libro: Representa un libro con los siguientes atributos y métodos.</li>
<li>Clase Biblioteca: Gestiona una colección de libros y proporciona funcionalidades clave.</li>
<li>Clase Main: Controla la interacción con el usuario mediante un menú de opciones.</li>
</ul>

<h3>📝 Ejemplo de Uso</h3>
Al iniciar, se muestra el menú principal:

```bash
¡Bienvenido a la Biblioteca!
1. Mostrar géneros literarios
2. Mostrar libros por género
3. Alquilar un libro
4. Devolver un libro
5. Mostrar todos los libros
6. Salir
```
Selecciona una opción, por ejemplo, 1 para mostrar los géneros disponibles:

```bash
Géneros disponibles:
- Novela
- Fantasía
- Clásico
- Distopía
```
Para alquilar un libro, selecciona la opción 3, escribe el título del libro y confirma:

```bash
Ingrese el título del libro que desea alquilar:
El hobbit
El libro "El hobbit" ha sido alquilado.
```
Al devolver el libro, selecciona 4, ingresa el título y confirma:
```bash
Ingrese el título del libro que desea devolver:
El hobbit
El libro "El hobbit" ha sido devuelto.
```
Finaliza el programa seleccionando 6.
