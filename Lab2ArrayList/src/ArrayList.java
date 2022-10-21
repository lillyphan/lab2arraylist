//preity+lilly

public class ArrayList<E> {

    Node<E> elemZero = null;

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

}
