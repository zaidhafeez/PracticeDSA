package revise.queue;

public class QueueMain {

    public static void main(String[] args) throws Exception {

        QueueTwoPointer queue = new QueueTwoPointer(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        queue.enqueue(5);

        queue.display();

//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.getFronts());
//        System.out.println(queue.dequeue());

    }

}
