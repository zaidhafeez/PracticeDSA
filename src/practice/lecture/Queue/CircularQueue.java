package practice.lecture.Queue;

public class CircularQueue {

    protected int[] data;
    protected int front = 0;
    protected int end  = 0;
    private int size = 0;

    private static final int DEFAULT_SIZE = 10;

    public CircularQueue(){

        this(DEFAULT_SIZE);

    }
    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull() {

        if(size == data.length) return true;
        return false;

    }
    private boolean isEmpty() {

        if(size == 0) return true;
        return false;

    }

    public boolean enqueue(int item){

        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        }

        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }

    public int dequeue() throws Exception {

        if(isEmpty()) throw new Exception("Value will not delete");
        int remove = data[front++];
        front %= data.length;
        size--;
        return remove;

    }

    public int front() throws Exception {
        if(isEmpty()) throw new Exception("Value will not delete");
        return data[front];
    }

    public void display() throws Exception {

        if(isEmpty()) throw new Exception("Value will not delete");
        int i = front;
        do{
            System.out.print(data[i++] + " --> ");
            i %= data.length;
        }while (i != end);

        System.out.println("END");

    }

}
