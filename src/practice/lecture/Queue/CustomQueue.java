package practice.lecture.Queue;

public class CustomQueue {

    protected int[] data;
    private int end = 0;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue(){

        this(DEFAULT_SIZE);


    }

    CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean enqueue(int item) throws Exception {

        if(isFull()){
            throw new Exception("Queue is Full");
        }

        data[end++] = item;
        return true;

    }

    public int dequeue() throws Exception {

        if(isEmpty()) throw new Exception("Queue is empty");

        int removed = data[0];

        //Shift the array
        for (int i = 1; i < end; i++) {

            data[i - 1] = data[i];

        }

        end--;
        return removed;

    }

    public int front() throws Exception {

        if(isEmpty()) throw new Exception("Queue is empty");
        return data[0];

    }

    public void display(){


        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <-- ");
        }
        System.out.println("END");


    }



    public boolean isFull() {

        if(end == data.length) return true;
        return false;

    }
    private boolean isEmpty() {

        if(end == 0) return true;
        return false;

    }

}
