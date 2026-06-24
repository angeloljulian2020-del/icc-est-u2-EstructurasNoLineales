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

## Implementacion 

```java
/// preOrden
    public void preOrden(){
        preOrdenRecurivo(root);
    }
    private void preOrdenRecurivo(node<Integer> actual){
        if (actual == null){
            return;
        }
        System.out.println(actual);
        preOrdenRecurivo(actual.getLeft());
        preOrdenRecurivo(actual.getRight());
    }

    //posOrden
    public void posOrden(){
        posOrdenRecurivo(root);
    }
    private void posOrdenRecurivo(node<Integer> actual){
        if (actual == null){
            return;
        }
        
        posOrdenRecurivo(actual.getLeft());
        posOrdenRecurivo(actual.getRight());
        System.out.println(actual);
    }

    //inOrden
    public void inOrden(){
        inOrdenRecurivo(root);
    }
    private void inOrdenRecurivo(node<Integer> actual){
        if (actual == null){
            return;
        }
        inOrdenRecurivo(actual.getLeft());
        System.out.println(actual);
        inOrdenRecurivo(actual.getRight());
    }

        //metodo para medir la altura del arbol

        public int getHeight(){
            return getHeightRecursivo(root);
        }
        private int getHeightRecursivo(node<Integer> actual){
            if (actual == null){
                return 0;
            }
            int leftHeight = getHeightRecursivo(actual.getLeft());
            int rightHeight = getHeightRecursivo(actual.getRight());
            int masAlto = Math.max(leftHeight, rightHeight);
            return masAlto + 1;
        }


        // medir peso con recursividad con complejidad O(n)
        public int getSize(){
            return getSizetRecursivo(root);
        }
        private int getSizetRecursivo(node<Integer> actual){
            if (actual == null){
                return 0;
            }
            int sizeLeft = getHeightRecursivo(actual.getLeft());
            int sizeRight = getHeightRecursivo(actual.getRight());
            
            return sizeLeft + sizeRight + 2;
        }
        /// medir peso sinrecursividad con complejidad O(1)
        private int getpeso(){
            return peso;
        }
```

## Salida en consola

![alt text](src/assets/image.png)

## Fecha:19/06/2026
## Clase BinaryTree:
La clase BinaryTree es una versión genérica del árbol binario y a diferencia de IntTree, esta clase puede trabajar con diferentes tipos de datos, siempre que puedan compararsey por eso utilizamos Comparable, y el método add inserta elementos comparando sus valores, los menores van hacia la izquierda y los mayores o iguales hacia la derecha, y esta también incluye recorridos en InOrden, PreOrden y PosOrden, además de métodos para obtener la altura y el tamaño del árbol.

## Clase Persona:
La clase Persona que representa un objeto con nombre y edad, esta clase implementa Comparable, por eso sus objetos pueden ser comparados dentro del árbol binario, la comparación se hace primero por edad y si dos personas tienen la misma edad, se comparan por nombre, y esto nos permite insertar personas dentro de un BinaryTree.

## Implementacion 
```java
public class BinaryTree<T extends Comparable<T>> {
    private node<T> addRecursivo(node<T> actual, node<T> nodeInsertar){
        if (actual == null) {
            return nodeInsertar;
        }
        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0){
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        }else{
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }
        
        return actual;
    }
} 
```
## Salida en consola
![alt text](src/assets/image-1.png)
