package linkedlist;

public interface ListJava {
    boolean empty();


    void appendObj(Object obj);

    void removeFront();

    Object front();

    int listLength();

    int locateObj(Object obj);

    void deleteObj(Object obj);

    void deleteObjAt(int position);

    boolean enlistObj(Object obj, int position);

    void display();
}