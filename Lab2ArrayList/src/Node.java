public class Node<E> {
    private Node<E> parent;
    private Node<E> child;
    private E data;

    public Node(){
        //empty constructor
    }

    public Node(E data){
        //constructor with one data parameter
        this.data = data;
    }

    public Node(E data, Node<E> child, Node<E> parent){
        //constructor with three parameters for data, parent Node, and child Node
        this.data = data;
        this.parent = parent;
        this.child = child;
    }

    //accessors
    public E getData() {
        //returns data
        return data;
    }

    public Node<E> getChild() {
        //returns child Node
        return child;
    }

    public Node<E> getParent() {
        //returns parent Node
        return parent;
    }

    //mutators
    public void setChild(Node<E> child) {
        //changes instance Node child to specified Node
        this.child = child;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setParent(Node<E> parent) {
        //changes instance Node parent to specified Node
        this.parent = parent;
    }

    //other

    @Override
    public String toString() {
        //overrides Objects' toString and returns a string specifying data of the Node
        return "Node: " + data;
    }

    public boolean equals(Node<E> node) {
        //overrides Objects' equals and returns a string specifying whether the data of each Node is equal using .equals
        return data.equals(node.data);
    }

}
//test 2