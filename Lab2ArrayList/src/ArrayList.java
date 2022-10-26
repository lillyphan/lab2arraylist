public class ArrayList<E> {

    Node<E> elemZero = null;

    public ArrayList() {
        //empty constructor
    }

    public int size() {
        //Returns the size of the ArrayList
        int counter = 1;
        if (elemZero != null) {
            Node<E> current = elemZero;
            while (current.getChild() != null) { //loops until the last Node in the list is found (Node w/o child)
                counter++; //updates number of nodes in list
                current = current.getChild();
            }
        } else {
            return 0;
        }
        return counter;
    }

    public boolean add(E data){
        //adds a new Node containing E at the end of the list and returns true if element wasa successfully added
        Node<E> elemNew = new Node<>(data);
        if (elemZero != null) {
            Node<E> current = elemZero;
            for (int i = 0; i < size() - 1; i++){ //loops until end of list
                current = current.getChild();
            }
            current.setChild(elemNew); //adds new element as a child of the last element in the list
            elemNew.setParent(current);
        } else {
            elemZero = elemNew; //if there is nothing in the list, new element is now element at index 0
        }
        return true;
    }

    public void add(int i, E data){
        //adds a new Node containing E at index i
        Node<E> current = elemZero;
        Node<E> elemNew = new Node<>(data);
        if (i != 0){
            for (int j = 0; j < i - 1; j++){ //loops to the one index before i
                current = current.getChild();
            }
            if (current.getChild() != null) {
                //edits parent/child links to the Nodes before and after new element
                elemNew.setChild(current.getChild());
                current.getChild().setParent(elemNew);
            }
            current.setChild(elemNew);
        } else { //if the index is 0, only rearrange links of the first node
            elemZero.setParent(elemNew);
            elemNew.setChild(elemZero);
            elemZero = elemNew;
        }
    }

    @Override
    public String toString() {
        if (elemZero != null) {
            String str = "[";
            Node<E> current = elemZero;
            for (int i = 0; i < size() - 1; i++) { //loops through ArrayList and adds data of each Node
                str = str.concat(current.getData() + ", ");
                current = current.getChild();
            }
            str = str.concat(current.getData() + "]");
            return str;
        } else { //if there is nothing in the ArrayList, return null
            return null;
        }
    }
}
