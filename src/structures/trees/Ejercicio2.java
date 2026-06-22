package structures.trees;


import structures.node.node;

public class Ejercicio2 {

    public void invertTree(node<Integer> root) {

        System.out.println();
        System.out.println("Ejercicio Dos");

        System.out.println();
        System.out.println("Árbol normal:");
        printTree(root, 0);

        invertirRamas(root);

        System.out.println();
        System.out.println("Árbol invertido:");
        printTree(root, 0);
    }

    private void printTree(node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }
        printTree(actual.getRight(), nivel + 1);
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println(actual.getValue());
        printTree(actual.getLeft(), nivel + 1);
    }
    private void invertirRamas(node<Integer> actual) {
        if (actual == null) {
            return;
        }
        node<Integer> aux = actual.getLeft();
        actual.setLeft(actual.getRight());
        actual.setRight(aux);
        invertirRamas(actual.getLeft());
        invertirRamas(actual.getRight());
    }    
        
}
