package structures.trees;

import structures.node.node;

public class Ejercicio4 {
    public int maxDepth(node root){
        
        return maxDepthRecursivo(root);
        
        
    }
    private int maxDepthRecursivo(node root){
        if(root == null){
            return 0;
        }
        int leftDepth = maxDepthRecursivo(root.getLeft());
        int rightDepth = maxDepthRecursivo(root.getRight());
        return Math.max(leftDepth, rightDepth) +1;

    }
    public void arbolNormal(node root){

        System.out.println("Arbol normal:");
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
