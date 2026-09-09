

public class implementationUsingLinkedList  {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Enqueue
    void enqueue(int data) {

        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Dequeue
    int dequeue() {

        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = head.data;

        head = head.next;

        if (head == null) {
            tail = null;
        }

        return data;
    }

    // head / Peek
    int front() {

        if (head == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        return head.data;
    }

    // Display
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }


    public static void main(String[] args) {

        implementationUsingLinkedList q = new implementationUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue:");
        q.display();

        System.out.println("Front: " + q.front());

        System.out.println("Removed: " + q.dequeue());

        System.out.println("Queue after dequeue:");
        q.display();

        System.out.println("Front: " + q.front());
    }
}


