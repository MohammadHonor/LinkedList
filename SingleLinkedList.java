public class SingleLinkedList {

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

        }

    }

    Node head = null;

    // add node at first
    public void addFirst(String d) {
        Node newNode = new Node(d);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add node at last

    public void addLast(String d) {
        Node newNode = new Node(d);

        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;

        }
        current.next = newNode;
    }

    // display linked list

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
       
        while (current !=null) {
            System.out.print(current.data+"->");
            current=current.next;
            
        }
    }

    public static void main(String[] args) {

        SingleLinkedList sl= new SingleLinkedList();

        sl.addFirst("is");
        sl.addFirst("name");
        sl.addFirst("my");

        sl.addLast("khan");
        sl.addLast("with");
        sl.addLast("mercy");

        sl.display();
    }

}