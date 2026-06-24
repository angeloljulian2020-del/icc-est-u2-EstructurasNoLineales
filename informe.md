# Ejercicios con Estructuras no Lineales
## Estudiante: Angelo ALtamirano
## Fecha: 24/06/2026

## Descripción:

Para esta practica aplicamos arboles binarios en cada ejercicio realizado, desarrollamos insercion de nodos, inversion de ramas, recorrido por niveles y calculamos la profundidad de cada arbol.
Mediante el desarrollo de la practica utilizamos estructuras genéricas, nodos enlazados y recorridos recursivos y támbien realizamos distintos casos de prueba para verificar el funcionamiento de cada código, incluyendo árboles vacíos, árboles de un solo nodo, árboles con varios niveles y árboles con nodos a la izquierda.

## Ejercicio 1:

```java
public void insert(int [ ] numeros){
        //crear arbol de enteros
        BinaryTree<Integer> tree = new BinaryTree<>();
        
        //insertar cada numero
        for (int numero : numeros) {
            tree.add(numero);
        }
        //imprimir el arbol en orden
        System.out.println("InOrden");
        tree.inOrden();
        printTree(tree.getRoot());


    }
    public void printTree(node<Integer> root){
    System.out.println("Imprimiendo el arbol");
    printTreeRecursivo(root, 0);
    }
    private void printTreeRecursivo(node<Integer> node, int level) {
        if (node == null) {
            return;
        }
        printTreeRecursivo(node.getRight(), level + 1);
        for(int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.getValue());
        printTreeRecursivo(node.getLeft(), level + 1);
    }
```
Esta clase construye un árbol binario a partir de una lista de números recibida como parámetro, insertando cada valor de forma secuencial.Para visualizar la estructura, se utiliza un método recursivo que recorre el árbol en orden inverso (Derecha -> Raíz -> Izquierda) e imprime los nodos de forma horizontal. El método calcula automáticamente la profundidad de cada nodo y añade una tabulación proporcional a su nivel, permitiendo apreciar la jerarquía visual del árbol de un solo vistazo. Este mismo sistema de impresión se reutiliza en el resto de los ejercicios del proyecto.


