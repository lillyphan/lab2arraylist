public class testDriver {
    public static void main(String[] args) {
        //testing size method
//        Node<Integer> parent = null;
//        Node<Integer> parent = new Node<>();
//        Node<Integer> child = new Node<>(5);
//        Node<Integer> middle = new Node<>(10, child, parent);

//        parent.setChild(middle);
//
//        //testing size method
//        int counter = 1;
//        if (parent != null){
//            Node<Integer> current = parent;
//            while (current.getChild() != null){
//                counter++;
//                current = current.getChild();
//            }
//        } else {
//            System.out.println('0');
//        }
//        System.out.println(counter);

        //testing boolean add() method

//        ArrayList<Node<Integer>> arr = new ArrayList<>();
//
//        arr.add(parent);
//
//        System.out.println(arr.size());
//
//        arr.add(middle);
//        arr.add(child);
//
//        System.out.println(arr.size());


        //testing void add() method and toString()
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);


        arr.add(2, 10);

        arr.add(6, 10);

        System.out.println(arr);

        arr.add(0, 10);
        System.out.println();
        System.out.println("new array: " + arr);

        //testing get method
//        int i = 2;
//        System.out.println(arr.get(i)); //prints "1"
//
//        i = 6;
//        System.out.println(arr.get(i)); //returns number at index 6 --> 4
//
//        i = -2;
//        System.out.println(arr.get(i));

        //testing remove method
//        int k = 2;
//        System.out.println("removing at index two: " + arr.remove(k));
//        System.out.println("new array: " + arr);
//
//        k=6;
//        System.out.println("removing the last: " + arr.remove(k));
//        System.out.println("new array: " + arr);

        //testing set method
        System.out.println("im replacing " + arr.set(0, 6));
        System.out.println("new array: " + arr);

        System.out.println("im replacing " + arr.set(7, 0));
        System.out.println(arr);


        //testing void add() method and toString()

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);


        arr.add(2, 10);

        arr.add(6, 10);

        System.out.println(arr);

        arr.add(0, 10);
        System.out.println();
        System.out.println("new array: " + arr);

        //testing get method
//        int i = 2;
//        System.out.println(arr.get(i)); //prints "1"
//
//        i = 6;
//        System.out.println(arr.get(i)); //returns number at index 6 --> 4
//
//        i = -2;
//        System.out.println(arr.get(i));

        //testing remove method
//        int k = 2;
//        System.out.println("removing at index two: " + arr.remove(k));
//        System.out.println("new array: " + arr);
//
//        k=6;
//        System.out.println("removing the last: " + arr.remove(k));
//        System.out.println("new array: " + arr);

        //testing set method
        System.out.println("im replacing " + arr.set(0, 6));
        System.out.println("new array: " + arr);

        System.out.println("im replacing " + arr.set(7, 0));
        System.out.println(arr);

    }
}
