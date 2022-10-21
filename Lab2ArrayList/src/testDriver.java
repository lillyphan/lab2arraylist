public class testDriver {
    public static void main(String[] args) {
        //testing size method
//        Node<Integer> parent = null;
        Node<Integer> parent = new Node<>();
        Node<Integer> child = new Node<>(5);
        Node<Integer> middle = new Node<>(10, child, parent);

        parent.setChild(middle);

        //testing size method
        int counter = 1;
        if (parent != null){
            Node<Integer> current = parent;
            while (current.getChild() != null){
                counter++;
                current = current.getChild();
            }
        } else {
            System.out.println('0');
        }
        System.out.println(counter);


    }
}
