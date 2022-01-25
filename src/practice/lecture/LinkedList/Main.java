package practice.lecture.LinkedList;

public class Main {

    public static void main(String[] args) {

        LL linkedList = new LL();

        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(15);
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(24);
        linkedList.insert(34, 4);
        linkedList.display();
        System.out.println(linkedList.delAtBegin());
        linkedList.display();
        System.out.println(linkedList.delAtEnd());
        linkedList.insertAtEnd(19);
        linkedList.insertAtEnd(29);

        linkedList.display();

        System.out.println(linkedList.delAtIndex(3));

        linkedList.display();

        System.out.println(linkedList.search(2));


    }

}
