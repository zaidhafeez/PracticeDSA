package practice.lecture.LinkedList;

public class Main {

    public static void main(String[] args) {

//        LL linkedList = new LL();

//        linkedList.insertAtBeginning(2);
//        linkedList.insertAtBeginning(15);
//        linkedList.insertAtBeginning(3);
//        linkedList.insertAtBeginning(24);
//        linkedList.insert(34, 4);
//        linkedList.display();
//        System.out.println(linkedList.delAtBegin());
//        linkedList.display();
//        System.out.println(linkedList.delAtEnd());
//        linkedList.insertAtEnd(19);
//        linkedList.insertAtEnd(29);
//
//        linkedList.display();
//
//        System.out.println(linkedList.delAtIndex(3));

//        linkedList.display();
//
//        System.out.println(linkedList.search(2));
//
//        DLL linkedList = new DLL();
//        linkedList.insertAtBegining(2);
//        linkedList.insertAtBegining(3);
//        linkedList.insertAtBegining(4);
//        linkedList.insertAtEnd(15);
//        linkedList.insertAtEnd(12);
//        linkedList.insertAtEnd(22);
//        linkedList.insert(23,1);
//        linkedList.insert(122,6);
//        linkedList.insert(67, 0);
//        linkedList.insertAfterValue(22, 44);
//
//        linkedList.display();
//
//        System.out.println("The size of linked list is: " + linkedList.getSize());

        CLL linkedList = new CLL();
        linkedList.insert(12);
        linkedList.insert(22);
        linkedList.insert(2);
        linkedList.insert(35);
        linkedList.display();
        linkedList.delete(35);
        linkedList.display();

    }

}
