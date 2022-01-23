package linkedlist;

public class Main {
    public static void main(String[] args) {
        List lst = new List();
        Object front = lst.front();
        System.out.println(front);
        lst.appendObj(1);
        lst.appendObj(2);
        lst.appendObj(3);
        lst.enlistObj(4, 2);
        lst.enlistObj(5, 1);
        lst.enlistObj(6, 3);
        int i = lst.listLength();
        System.out.println(i);
        lst.display();
        lst.deleteObj(5);
        lst.deleteObj(6);
        lst.appendObj(9);
        lst.appendObj(120);
        lst.appendObj(new Integer(230));
        lst.enlistObj(270, 1);
        List lst1 = new List(lst);
        System.out.println("\n\nList after some deletion and insertion:");
        lst1.display();
        System.out.println("\n\n");
    }
}
