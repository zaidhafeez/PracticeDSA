package revise.stack;

public class StackImplementation {

    int[] data;
    int top = -1;
    static final int DEFAULT_CAPACITY = 10;
    int length;

     public StackImplementation(){
        // this will call if our default capacity variable is static;
        this(DEFAULT_CAPACITY);

    }

    public StackImplementation(int size){

        this.data = new int[size];

    }

    public boolean push(int val) throws Exception {

        if(isFull()) throw new Exception("Stack is full");

        data[++top] = val;
        length++;

        return true;

    }

    public int peek() throws Exception {

        if (isEmpty()) throw new Exception("Stack is Empty");

        return data[top];

    }

    public int pop() throws Exception {

        if (isEmpty()) throw new Exception("Stack is Empty");

        int removed = data[top--];
        length--;

        return removed;

    }

    public void display(){

        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }

    }

    public boolean isEmpty(){

        return top == -1;

    }

    public boolean isFull() {

        return top == data.length - 1;

    }



}
