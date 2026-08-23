 
public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        if (isFull()) {
            System.out.println("Stack is Full");
            return false;
        }

        ptr++;
        data[ptr] = item;

        return true;
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return data[ptr--];
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) {

        CustomStack stack = new CustomStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Top: " + stack.peek());

        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
    }
}
