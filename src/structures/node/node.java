package structures.node;

public class node<T> {
    private T value;
    private node<T> left;
    private node<T> right;

    //Creo un nodo
    //instancie el node -> Constructor
    //tiene que crearse el valor
    public node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public node<T> getLeft() {
        return left;
    }

    public void setLeft(node<T> left) {
        this.left = left;
    }

    public node<T> getRight() {
        return right;
    }

    public void setRight(node<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "node [" + value + "]";
    }

    
    
}
