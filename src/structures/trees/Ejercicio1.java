package structures.trees;

import structures.node.node;

public class Ejercicio1 {
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
    
    
}
