package practice.lecture.Queue;

public class Main {

    public static void main(String[] args) throws Exception {

        CircularQueue queue = new DynamicQueue(5);

        queue.enqueue(12);
        queue.enqueue(23);
        queue.enqueue(11);
        queue.enqueue(78);
        queue.enqueue(45);
        queue.enqueue(96);
        queue.display();

        System.out.println(queue.dequeue());
        queue.enqueue(99);
//
        queue.display();
//
//        System.out.println(queue.dequeue());
////        queue.enqueue(92);
//
//        queue.display();


    }

}
