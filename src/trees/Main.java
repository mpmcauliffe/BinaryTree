package trees;

public class Main {

    public static void main(String[] args) {

        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        System.out.print("\n\n");
        System.out.println("Traversing tree IN order");
        System.out.print("DATA = ");
        intTree.traverseInOrder();
        System.out.print("\n\n");

        System.out.println("Traversing tree PRE order");
        System.out.print("DATA = ");
        intTree.traversePreorder();
        System.out.print("\n\n");

        System.out.println("Searching tree");
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(17));
        System.out.println(intTree.get(8888));
        System.out.print("\n\n");

        System.out.println("Min and max values");
        System.out.println(intTree.min());
        System.out.println(intTree.max());
        System.out.print("\n\n");

        intTree.delete(15);
        System.out.println("Traversing tree post delete");
        System.out.print("DATA = ");
        intTree.traverseInOrder();
        System.out.print("\n\n");

        intTree.delete(27);
        System.out.println("Traversing tree post delete");
        System.out.print("DATA = ");
        intTree.traverseInOrder();
        System.out.print("\n\n");

        intTree.delete(25);
        System.out.println("Traversing tree post delete");
        System.out.print("DATA = ");
        intTree.traverseInOrder();
        System.out.print("\n\n");

        intTree.delete(8888);
        System.out.println("Traversing tree false delete");
        System.out.print("DATA = ");
        intTree.traverseInOrder();
        System.out.print("\n\n");

        System.out.print("\n\n");
    }
}
