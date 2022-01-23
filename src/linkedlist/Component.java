package linkedlist;

public class Component {
    Object data;
    Component next;

    // Creates an empty component.
    Component() {
        data = null;
        next = null;
    }

    // Creates a node storing the specified component.
    Component(Object dataItem) {
        data = dataItem;
        next = null;
    }

    Component nextComponent() {
        return next;
    }

    // Returns the data stored in this component.
    Object data() {
        return data;
    }
}