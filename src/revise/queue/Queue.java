package revise.queue;

 // USING ONLY ONE POINTER //
public class Queue {

    int[] data;
    int front;
    int length;
    private static final int DEFAULT_SIZE = 10;

    Queue(){

        this(DEFAULT_SIZE);

    }

    Queue(int size){
        this.front = -1;
        this.data = new int[size];
        this.length = 0;
    }

    public boolean enqueue(int value) throws Exception {

        if(isFull()){
            throw new Exception("Queue is Full");
        }

        data[++front] = value;
        length++;
        return true;

    }

    public int dequeue() throws Exception {

        if(isEmpty()) throw new Exception("Queue is Empty");

        int removed = data[0];
        front--;
        length--;

        // shift the element to the left //
        for (int i = 1; i <= length; i++) {

            data[i - 1] = data[i];

        }

        return removed;

    }

    public int getFronts() throws Exception {

        if(isEmpty()) throw new Exception("Queue is Empty");

        return data[0];

    }

    private boolean isEmpty() {

        return front == -1;

    }

    private boolean isFull() {

        return front == data.length;

    }

    public void display(){

        for (int i = 0; i < length; i++) {

            System.out.print(data[i] + "<--");

        }
        System.out.println("END");

    }


}
