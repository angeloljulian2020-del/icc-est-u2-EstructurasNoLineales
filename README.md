# Estructuras no Lineales
## Nombre: Angelo Altamirano
## Fecha: 17/06/2026

Este proyecto consiste en la implementación y manipulación de Estructuras de Datos No Lineales. Se abordan conceptos fundamentales como la inserción de nodos ordenados, recorridos en profundidad (PreOrden, InOrden, PosOrden), cálculo de propiedades del árbol (altura y peso/tamaño).

## Clase node:
La clase node representa un nodo del árbol. Cada nodo guarda un valor y tiene dos referencias: una al hijo izquierdo y otra al hijo derecho y al momento de crear un nodo, se recibe un valor y sus ramas empiezan como null, esta clase es importante porque es la base para formar el árbol.
## Clase intTree:
 La clase IntTree representa un árbol binario que trabaja solo con números enteros y me permite insertar valores de tipo entero (int), cuando el número es menor que el nodo actual, se coloca a la izquierda y si es mayor o igual, se coloca a la derecha. También tiene métodos para recorrer el árbol en:
InOrden
PreOrden
PosOrden
Y tambien podemos calcular la altura del árbol y obtener su tamaño.
## Fecha:
## Clase BinaryTree:
La clase BinaryTree es una versión genérica del árbol binario y a diferencia de IntTree, esta clase puede trabajar con diferentes tipos de datos, siempre que puedan compararsey por eso utilizamos Comparable, y el método add inserta elementos comparando sus valores, los menores van hacia la izquierda y los mayores o iguales hacia la derecha, y esta también incluye recorridos en InOrden, PreOrden y PosOrden, además de métodos para obtener la altura y el tamaño del árbol.

## Clase Persona:
La clase Persona que representa un objeto con nombre y edad, esta clase implementa Comparable, por eso sus objetos pueden ser comparados dentro del árbol binario, la comparación se hace primero por edad y si dos personas tienen la misma edad, se comparan por nombre, y esto nos permite insertar personas dentro de un BinaryTree.
