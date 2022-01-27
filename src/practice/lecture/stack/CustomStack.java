package practice.lecture.stack;

public class CustomStack {

    protected int[] data;
    private int top = -1;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(){

        this(DEFAULT_SIZE);


    }

    CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){

        if(isFull()){
            System.out.println("Array is Full");
            return false;
        }
        data[++top] = item;
        return true;
    }

    public int pop() throws Exception {

        if(isEmpty()){

            throw new Exception("Cannot Pop From Empty Stack");

        }
        int removed = data[top--];
        return removed;

    }

    public int peek() throws Exception {

        if(isEmpty()){

            throw new Exception("Cannot Pop From Empty Stack");

        }

        return data[top];

    }

    public boolean isFull() {

        if(top == data.length - 1) return true;
        return false;

    }
    private boolean isEmpty() {

        if(top == -1) return true;
        return false;

    }

}
