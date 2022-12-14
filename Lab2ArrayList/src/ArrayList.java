/**
 * ArrayList
 * Author: Preity Singh, Lilly Phan
 * Date: 10/27/22
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: PS, LP
 **/

/*lilly focused on:
    size()
    boolean add()
    void ()
    toString()
 */
/* preity focused on:
    get()
    remove()
    set()
 */
//10/24/22
public class ArrayList<E> {
    //elemZero is our very special node that we use in all methods
    //examples: check is arrayList is empty, starting object for loop
    //it has an important job!
    Node<E> elemZero = null;

    public ArrayList() {
        //empty constructor
    }

    //Returns the size of the ArrayList
    public int size() {

        int counter = 1;
        if (elemZero != null) { //if there is at least one object
            Node<E> current = elemZero;
            while (current.getChild() != null) { //loops until the last Node in the list is found (Node w/o child)
                counter++; //updates number of nodes in list
                current = current.getChild();
            }
        } else {
            return 0; //no objects in the arraylist
        }
        return counter;
    }

    //adds a new Node containing E at the end of the list and returns true if element was successfully added
    public boolean add(E data){

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

    //adds a new Node containing E at index i
    public void add(int i, E data){

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
            current.setChild(elemNew); //sets the new data as a child of node current
        } else { //if the index is 0, only rearrange links of the first node
            elemZero.setParent(elemNew);
            elemNew.setChild(elemZero);
            elemZero = elemNew;
        }
    }

    //get Method returns int at said index
    public E get(int i){
        Node<E> a = elemZero; //loops through arraylist to get to certain index
        if (i < 0 || i > this.size()){ //if it's out of bounds, return ull
            return null;
        } else {
            for (int j = 0; j < i; j++) { //loops through to get to index i
                a = a.getChild();
            }
            return a.getData(); //returns data at index i
        }
    }

    //remove int at certain index (i)
    public E remove(int i) {
        Node<E> current = elemZero; //loops through arraylist to get to certain index
        if(i != 0){
            for(int j = 0; j < i -1; j++){ //loops to the one index before i
                current = current.getChild();
            }
        } else { //if the index is 0; sets next node as main parent that has no parent
            elemZero = elemZero.getChild();
            elemZero.setParent(null);
        }
        //links to the Nodes before and after new element, cutting off the middle
        Node<E> deletion = current.getChild();
        current.setChild(deletion.getChild());

        if(deletion.getChild() != null){ //if you want to remove
            current.getChild().setParent(current);
        }
        return deletion.getData(); //returns data that was deleted
    }

    //method to set or replace a number at certain index
    public E set(int i, E data) {
        E kickedOut = null; //generic type that stores value that is getting replaced
        Node<E> current = elemZero; //loops through arraylist to get to certain index
        if(i!=0) {
            for (int j = 0; j < i; j++) { //loops to index i
               current = current.getChild();
            }
            kickedOut = current.getData(); //gets original data from node at index i before replacing
            current.setData(data); //sets node with new data/value
        } else { //replace with data if index i = 0
            kickedOut = elemZero.getData();
            elemZero.setData(data);
        }
       return kickedOut; //returns the original value before it was replaced by E data
    }

    //toString method returns string representation of our arraylist object
    @Override
    public String toString() {
        if (elemZero != null) { //if it's not an empty array list
            String str = "[";
            Node<E> current = elemZero;
            for (int i = 0; i < size() - 1; i++) { //loops through ArrayList and adds data of each Node
                str = str.concat(current.getData() + ", "); //adds element
                current = current.getChild();
            }
            str = str.concat(current.getData() + "]"); //ends arrayList
            return str;
        } else { //if there is nothing in the ArrayList, return null
            return null;
        }
    }
}
