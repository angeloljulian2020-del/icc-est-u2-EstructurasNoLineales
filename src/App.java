

import java.util.List;

import models.Persona;
import structures.node.node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
        runEjercicio1();
        runEjercicio2();
        runEjercicio3();
        runEjercicio4();
        
    }
    private static void runEjercicio4() {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        int[] numeros = new int[]{5,3,7,2,4,6,8};
        BinaryTree<Integer> arbolEjercicio4 = new BinaryTree<>();
        for (int numero : numeros) {
            arbolEjercicio4.add(numero);
        }
        
        node<Integer> root = arbolEjercicio4.getRoot();
        System.out.println("Ejercicio Cuatro");
        ejercicio4.arbolNormal(root);
        int profudidad = ejercicio4.maxDepth(root);
        System.out.println("Profundidad del árbol: " + profudidad);


        /// Pruebas
        /// 
        prueba(new int[]{});
        prueba(new int[]{1});
        prueba(new int[]{1, 2, 3});
        prueba(new int[]{3, 2, 8, 9, 10});
        

        
    }
    private static void runEjercicio3() {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        int[] numeros = new int[]{5,3,7,2,4,6,8};
        BinaryTree<Integer> arbolEjercicio3 = new BinaryTree<>();
        for (int numero : numeros) {
            arbolEjercicio3.add(numero);
        }
        
        node<Integer> root = arbolEjercicio3.getRoot();
        ejercicio3.printLevels(root);
    }
    private static void runEjercicio2() {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros = new int[]{5,3,7,2,4,6,8};
        BinaryTree<Integer> arbolEjercicio3 = new BinaryTree<>();
        for (int numero : numeros) {
            arbolEjercicio3.add(numero);
        }
        
        node<Integer> root = arbolEjercicio3.getRoot();
        ejercicio2.invertTree(root);
        
    }


    private static void runEjercicio1() {
        System.out.println("Ejercicio Uno");
        System.out.println();
        Ejercicio1 ejercicio1 = new Ejercicio1();
            int[] numeros = new int[]{5,3,7,2,4,6,8};
            ejercicio1.insert(numeros);
            System.out.println("");
             
        Ejercicio2 ejercicio2 = new Ejercicio2();
        BinaryTree<Integer> arbolEjercicio2 = new BinaryTree<>();
        for (int numero : numeros) {
            arbolEjercicio2.add(numero);
        }
        node<Integer> root = arbolEjercicio2.getRoot();
        ejercicio2.invertTree(root);
        
        
        
    }   


    private static void runBinaryTree() {
        //BinaryTree<String> arbolString = new BinaryTree<>();
        BinaryTree<Persona> arbolPersona = new BinaryTree<>();

        arbolPersona.add(new Persona("Alice", 30));
        arbolPersona.add(new Persona("Bob", 25));
        arbolPersona.add(new Persona("Charlie", 35));
        arbolPersona.add(new Persona("David", 28));
        arbolPersona.add(new Persona("Eve", 32));

        System.out.println();
        System.out.println("Recorrido InOrden:");
        arbolPersona.inOrden();

        System.out.println();
        System.out.println("Recorrido PreOrden:");
        arbolPersona.preOrden();

        System.out.println();
        System.out.println("Recorrido PosOrden:");
        arbolPersona.posOrden();

        System.out.println();
        System.out.println("Altura del árbol:");
        System.out.println(arbolPersona.getHeight());

        System.out.println();
        System.out.println("Peso de el árbol:");
        System.out.println(arbolPersona.getSize());
    }


    private static void runIntTree() {
        //IntTree arbolNumerosIntTree = new IntTree();
        //node<Integer> nodo1 = new node<>(50);
        //node<Integer> nodo2 = new node<>(10);
        //node<Integer> nodo3 = new node<>(30);

        //la raiz del arbol es el nodo1

        //arbolNumerosIntTree.setRoot(nodo1);
        //nodo1.setRight(nodo2);
        //nodo2.setLeft(nodo3);

        //System.out.println(arbolNumerosIntTree.getRoot()); //imprime el nodo raiz
        //System.out.println(arbolNumerosIntTree.getRoot().getLeft().getRight()); //imprime el nodo derecho del nodo raiz
        
        //nodo3.setLeft(nodo1);

        IntTree arbolNumeros = new IntTree();
        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);
        // System.out.println(arbolNumeros.getRoot()); //imprime el nodo raiz
        // System.out.println(arbolNumeros.getRoot().getLeft().getRight()); //imprime el nodo derecho del nodo raiz    
        System.out.println("Preorden:");
        arbolNumeros.preOrden();
        System.out.println("Postorden:");
        arbolNumeros.posOrden();
        System.out.println("Inorden:");
        arbolNumeros.inOrden();
        System.out.println("Altura del arbol: " + arbolNumeros.getHeight());
        System.out.println("Peso del arbol: " + arbolNumeros.getSize());
        //System.out.println(arbolNumeros.getPeso);

        
    }
    // implementacion de los casos de prueba
    public static void prueba(int[] numeros) {
        System.out.println("");

        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Ejercicio4 ejercicio4 = new Ejercicio4();

        System.out.println();
        System.out.println("Ejercicio Uno");
        ejercicio1.insert(numeros);

        System.out.println();
        
        ejercicio2.invertTree(arbol(numeros).getRoot());

        System.out.println();
        
        ejercicio3.printLevels(arbol(numeros).getRoot());

        System.out.println();
        System.out.println("Ejercicio Cuatro");
        node<Integer> root = arbol(numeros).getRoot();
        System.out.println("Profundidad del arbol: " + ejercicio4.maxDepth(root));
    }
    public static BinaryTree<Integer> arbol(int[] numeros) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros) {
            tree.add(numero);
        }
        return tree;
    }
}
