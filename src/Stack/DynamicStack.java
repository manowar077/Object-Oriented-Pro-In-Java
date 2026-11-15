
package Stack;

public class DynamicStack {

    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    DynamicStack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    // Push operation
    public void push(int data) {

        if (top == capacity - 1) {
            grow();
        }

        arr[++top] = data;
    }

    // Increase capacity
    private void grow() {

        int newCapacity = capacity * 2;
        int[] newArr = new int[newCapacity];

        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        capacity = newCapacity;
    }

    // Pop operation
    public int pop() {

        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return arr[top--];
    }

    // Peek operation
    public int peek() {

        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int capacity() {
        return capacity;
    }

    // Main method
    public static void main(String[] args) {

        DynamicStack st = new DynamicStack(3);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Capacity: " + st.capacity());

        // Stack is full, capacity will double
        st.push(40);

        System.out.println("Capacity: " + st.capacity());
        System.out.println("Top: " + st.peek());
        System.out.println("Size: " + st.size());

        System.out.println("Removed: " + st.pop());
        System.out.println("Top: " + st.peek());
    }
}
