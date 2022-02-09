package revise.queue;

public class QueueMain {

    public static void main(String[] args) throws Exception {

        QueueTwoPointer queue = new DynamicQueue1(3);
//        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
//        queue.enqueue(4);
        queue.display();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());

        queue.display();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
//        queue.dequeue();
        queue.enqueue(8);
        queue.display();


//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.getFronts());
//        System.out.println(queue.dequeue());

    }

}
