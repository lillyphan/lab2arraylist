//preity+lilly
public class ArrayList<E> {
    Node<E> elemOne;
    Node<E> elemZero = null;

    public ArrayList(){}

    public int size(){
        int counter = 1;
        if (elemZero != null){
            Node<E> current = elemZero;
            while (current.getChild() != null){
                counter++;
                current = current.getChild();
            }
        } else {
            return 0;
        }
        return counter;
    }

}