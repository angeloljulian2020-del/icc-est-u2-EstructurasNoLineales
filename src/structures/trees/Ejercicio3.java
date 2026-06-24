package structures.trees;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

import structures.node.node;

public class Ejercicio3 {
    public List<List<node>> listLevels(node root){
        List<List<node>> levels = new ArrayList<>();
        llenarNiveles(root, 0, levels);
        return levels;
    }

    private void llenarNiveles(node root, int level, List<List<node>> levels) {
        if (root == null) {
            return;
        }
        if (levels.size() == level) {
            levels.add(new ArrayList<>());
        }
        levels.get(level).add(root);
        llenarNiveles(root.getLeft(), level + 1, levels);
        llenarNiveles(root.getRight(), level + 1, levels);

    }
    public void printLevels(node root){
        System.out.println();
        System.out.println("Ejercicio Tres");
        System.out.println();

        System.out.println();
        System.out.println("Arbol Normal:");
        printTree(root, 0);
        System.out.println();

        System.out.println();
        System.out.println("Niveles en listas enlazadas:");
        System.out.println();

        List<List<node>> niveles = listLevels(root);

        for (List<node> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
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
}
