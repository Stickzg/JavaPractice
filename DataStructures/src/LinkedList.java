public class LinkedList {

    private class Node {
        private Node previousNode;
        private Node nextNode;
        private int value;

        public Node(Node previousNode, Node nextNode, int value) {
            this.previousNode = previousNode;
            this.nextNode = nextNode;
            this.value = value;
        }

    }

    private Node head = null;
    private Node tail = null;
    private Node actualNode = null;

    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.actualNode = null;
        size = 0;
    }

    public boolean isEmtpy() {
        return head == null;
    }

    public boolean isFirst() {
        return actualNode == head;
    }

    public boolean isLast() {
        return actualNode == tail;
    }

    public int getActualValue() {
        if ( isEmtpy() ) {
            return -1;
        }
        return actualNode.value;
    }

    public void setActualValue(int value) {
        if ( !isEmtpy() ) {
            actualNode.value = value;
        } else {
            System.out.println("Empty list.");
        }
    }

    public void stepForward() {
        if ( !isEmtpy() && !isLast() ) {
            actualNode = actualNode.nextNode;
        }
    }

    public void stepBackward() {
        if ( !isEmtpy() && !isFirst() )
            actualNode = actualNode.previousNode;
    }

    public void stepLast() {
        actualNode = tail;
    }

    public void stepFirst() {
        actualNode = head;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(null, head, value);
        if ( isEmtpy() ) {
            head = newNode;
            tail = newNode;
        } else {
            head.previousNode = newNode;
            head = newNode;
        }
        actualNode = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node(tail, null, value);
        this.actualNode = newNode;
        if ( isEmtpy() ) {
            insertFirst(value);
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
    }

    public void insertBefore(int value) {
        if ( isEmtpy() ) {
            insertFirst(value);
        } else {
            Node newNode = new Node(this.actualNode.previousNode, this.actualNode, value);
            this.actualNode.previousNode.nextNode = newNode;
            this.actualNode.previousNode = newNode;
            this.actualNode = newNode;
        }
    }

    public void insertAfter(int value) {
        if ( isEmtpy() ) {
            insertFirst(value);
        } else if (isLast()) {
            insertLast(value);
        } else {
            Node newNode = new Node(this.actualNode.previousNode, this.actualNode, value);
            this.actualNode.nextNode.previousNode = newNode;
            this.actualNode.nextNode = newNode;
            this.actualNode = newNode;
        }
    }

    public void removeFirst() {
        if ( !isEmtpy() ) {
            stepFirst();
            actualNode = null;
            stepForward();
            head = actualNode;
        } else {
            System.out.println("The list is empty.");
        }
    }

    public void removeLast() {
        if ( !isEmtpy() ) {
            stepLast();
            actualNode = null;
            stepBackward();
            tail = actualNode;
        } else {
            System.out.println("The list is empty");
        }
    }

    public void removeBefore() {
        if ( isEmtpy() ) {
            System.out.println("The list is empty");
        } else {
            stepBackward();
            actualNode.nextNode.previousNode = actualNode.previousNode;
            actualNode.previousNode.nextNode = actualNode.nextNode;
            actualNode = null;
            stepForward();
        }
    }

    public void removeAfter() {
        if ( isEmtpy() ) {
            System.out.println("The list is empty");
        } else {
            stepForward();
            removeBefore();
        }

    }

    public boolean contains(int value) {
        if ( value == this.head.value || value == this.tail.value ) {
            return true;
        } else {
            stepFirst();
            while (this.getActualValue() != value | this.actualNode != tail) {
                stepForward();
                if ( this.getActualValue() == value ) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        String values = "[]";
        if ( !isEmtpy() ) {
            values = "[";
            stepFirst();
            while (this.actualNode.nextNode != null) {
                stepForward();
                values += actualNode.value + ", ";
            }
            values += "]";
        }
        return values;
    }

    public static void main(String[] args) {
        LinkedList listam = new LinkedList();
        listam.insertFirst(1);
        listam.insertAfter(2);

        listam.toString();
    }

}
