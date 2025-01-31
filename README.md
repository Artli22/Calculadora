Arturo Lima - 24683
Ronald Catún - 19789 
Luis Pedro Hernandez - 24337

Algoritmos y Estructura de Datos
Sección 10
Catedrático Ingeniero Douglas Barrios

Hoja de Trabajo 2



Stack
En el ámbito de la programación, un Stack, o pila, es una estructura de datos lineal que funciona bajo el principio Last-In, First-Out, también conocido como LIFO. Esto significa que el último elemento 
añadido a la pila es el primero en ser eliminado. Como una torre de platos en dónde el último plato que se ponga encima será el primero que se tenga que quitar. Las operaciones principales en un Stack 
son push, que añade un elemento encima, y pop, que elimina el elemento de encima también. Los Stacks se usan mucho en la programación para varias tareas, como la gestión de llamadas a funciones, la gestión
de memoria y la creación de algoritmos de búsqueda. En la gestión de llamadas a funciones, por ejemplo cada vez que se llama a una función, se coloca su información así como las variables locales o el punto
de retorno en el stack. Cuando la función termina, se elimina la información del stack, permitiendo que la función anterior continúe su ejecución.
Los Stacks son estructuras de datos esenciales que facilitan la gestión de la información en un orden específico. Su simplicidad y eficiencia los hacen herramientas fundamentales en la programación,
permitiendo una gestión eficaz de la memoria y la ejecución de algoritmos complejos.

Stack Vector
Un Stack Vector, también conocido como vector de pila, es una estructura de datos que combina las características de un Stack con las de un Vector. Esencialmente, es un vector que se utiliza como una pila.
Esto significa que, a diferencia de los Stacks tradicionales que utilizan una lista enlazada, un Stack Vector utiliza un array para almacenar sus elementos.
Al igual que un Stack normal, el Stack Vector sigue el principio LIFO, donde el último elemento agregado es el primero en ser eliminado.
Sin embargo, al estar implementado con un array, el Stack Vector ofrece algunas ventajas adicionales. En primer lugar, su acceso a los elementos es generalmente
más rápido que el de un Stack basado en una lista enlazada, especialmente cuando se trata de obtener el elemento de la cima o acceder a elementos específicos del vector.
Enfocándose más en ser eficiente y flexible para gestionar datos con un comportamiento LIFO. Su implementación se basa en arrays lo que lo convierte en una opción ideal
para programas donde se requiere un acceso rápido a los elementos y un control preciso sobre el espacio de memoria utilizado.

Implementación actual
Es necesario realizar una calculadora utilizando la función de Vector e implementando para operaciones postfix.  Leyendo de un archivo de texto la expresión en formato
Postfix y producir el resultado de la misma.

UML
![UML Centro de Eventos](https://github.com/user-attachments/assets/a10f6c48-3bfc-47f0-857c-7b35b310c4c2)



