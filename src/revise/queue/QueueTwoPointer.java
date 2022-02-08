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

        if (isEmpty()) front = rear = 0;

        if(front > 0 && rear == size){

            shiftQ(data);

        }


        if(isFull()){
            throw new Exception("Queue is Full");
        }


        data[rear++] = val;
        length++;

        return true;

    }

    private void shiftQ(int[] data) {

        int j = 0;
        for (int i = front; i < rear; i++) {
            data[j] = data[i];
            j++;
        }
        front = 0;
        rear = j;

    }

    public int dequeue() throws Exception {
        if(front == rear) front = rear = -1;

        if (isEmpty()) throw new Exception("Queue is Empty");

        int removed = data[front];

        front++;
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

        return rear == size;

    }

    public void display(){

        for (int i = front; i < rear; i++) {

            System.out.print(data[i] + "<--");

        }
        System.out.println("END");

    }


}
