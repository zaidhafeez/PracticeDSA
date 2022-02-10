package revise.queue;

public class CircularQ {

    protected int front = 0;
    protected int rear = 0;
    protected int size = 0;
    private static int DEFAULT_SIZE = 10;
    protected int[] data;

    public CircularQ() {

        this(DEFAULT_SIZE);

    }

    public CircularQ(int size) {

        this.data = new int[size];

    }

    public boolean enqueue(int value) throws Exception {

        if(isFull()){

            throw new Exception("Queue is Full");

        }

        data[rear++] = value;
        rear %= data.length;
        size++;
        return true;

    }

    public int dequeue() throws Exception {

        if(isEmpty()){

            throw new Exception("Queue is Empty");

        }

        int removed = data[front++];
        front %= data.length;
        size--;

        return removed;

    }

    public int getFront() throws Exception {

        if(isEmpty()) throw new Exception("Queue is empty");

        return data[front];
    }

    public void display() throws Exception {

        if(isEmpty()) throw new Exception("Queue is empty");

        int i = front;

        do{

            System.out.print(data[i++] + " <-- ");
            i %= data.length;

        }while(i != rear);
        System.out.println("END");

    }

    private boolean isEmpty() {

        return size == 0;

    }

    public boolean isFull() {

        return size == data.length;

    }

}
