package structures.trees;

import structures.node.node;

//clase de arbol solo de enteros 
public class IntTree {
    private int peso;
    private node<Integer> root;
    public char[] getPeso;

    //constructor
    public IntTree() {
        this.root = null;
    }

    public node<Integer> getRoot() {
        return root;
    }

    public void setRoot(node<Integer> root) {
        this.root = root;
    }
    

    public void setRoot(int value){
        node<Integer> Node = new node<>(value);
        this.root = Node;
        peso ++;
    }

    public void add(int i) {
        //root es la raiz del arbol, el nodo que se va a insertar es el nodo nuevo
        node<Integer> newNode = new node<>(i);
        root = addRecursivo(root, newNode);
        
    }

    private node<Integer> addRecursivo(node<Integer> actual, node<Integer> nodoInsertar) {
        if (actual == null) {
            return nodoInsertar;
        }

        if (actual.getValue() > nodoInsertar.getValue()){
            //Izquierda
            //setleft es izqiuerda
            actual.setLeft(addRecursivo(actual.getLeft(), nodoInsertar));
        

        }else{
            //derecha
            actual.setRight(addRecursivo(actual.getRight(), nodoInsertar));

        }
        return actual;

        //poner break poinys en cada parte


        
    }
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

        
    }
    // public void imprimirOrdenado(){
    //     inOrden(root);
    // }
    // private void inOrden(node<Integer> actual){
    //     if (actual == null){
    //         return;
    //     }
    //     inOrden(actual.getLeft());
    //     System.out.println(actual.getValue());
    //     inOrden(actual.getRight());
    // }
    

    


