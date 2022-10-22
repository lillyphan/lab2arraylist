//preity+lilly

public class ArrayList<E> {
    Node<E> elemZero = null;

    public ArrayList() {
    }

    public int size() {
        int counter = 1;
        if (elemZero != null) {
            Node<E> current = elemZero;
            while (current.getChild() != null) {
                counter++;
                current = current.getChild();
            }
        } else {
            return 0;
        }
        return counter;
    }

    public boolean add(E data){
        if (elemZero != null) {
            Node<E> current = elemZero;
            for (int i = 0; i < size() - 1; i++){
                current = current.getChild();
            }
            current.setChild(new Node<>(data));
        } else {
            elemZero = new Node<>(data);
        }
        return true;
    }

}
