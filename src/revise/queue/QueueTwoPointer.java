package revise.queue;

public class QueueTwoPointer {

    int front, rear;
    int[] data;
    int length;
    int size;
    private static final int DEFAULT_SIZE = 10;

    QueueTwoPointer(){

        this(DEFAULT_SIZE);

    }

    QueueTwoPointer(int size){

        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.data = new int[size];
        this.length = 0;

    }

    public boolean enqueue(int val) throws Exception {

        if (isEmpty()) front = 0;

        if(front > 0 && rear == size - 1){

            shiftQ(data);

        }


        if(isFull()){
            throw new Exception("Queue is Full");
        }


        data[++rear] = val;
        length++;

        return true;

    }

    private void shiftQ(int[] data) {

        int j = 0;
        for (int i = front; i <= rear; i++) {
            data[j] = data[i];
            j++;
        }
        front = 0;
        rear = j - 1;

    }

    public int dequeue() throws Exception {


        if (isEmpty()) throw new Exception("Queue is Empty");
        int removed = data[front];
        if(front == rear) front = rear = -1;
        else front++;
        length--;

        return removed;

    }

    public int getFronts() throws Exception {

        if(isEmpty()) throw new Exception("Queue is Empty");

        return data[front];

    }

    private boolean isEmpty() {

        return front == -1;

    }


    private boolean isFull() {

        return rear == size - 1;

    }

    public void display(){

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {

            System.out.print(data[i] + "<--");

        }
        System.out.println("END");

    }


}
