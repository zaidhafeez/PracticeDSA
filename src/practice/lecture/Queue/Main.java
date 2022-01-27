package practice.lecture.Queue;

public class Main {

    public static void main(String[] args) throws Exception {

        CustomQueue queue = new CustomQueue();

        queue.enqueue(12);
        queue.enqueue(23);
        queue.enqueue(11);
        queue.enqueue(78);

        queue.display();

        System.out.println(queue.dequeue());

        queue.display();


    }

}
