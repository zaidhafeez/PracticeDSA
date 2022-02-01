package revise.linkedList;

public class Main {

    public static void main(String[] args) throws Exception {

        SLL list = new SLL();
        list.insertAtBegin(13);
        list.insertAtBegin(45);
        list.insertAtEnd(11);
        list.insertAtBegin(67);

        list.insertAtEnd(3);
        list.insertAtIndex(15, 0);
        list.insertAtIndex(15, list.size);
        list.insertAfterValue(12,13);

        list.display();

        System.out.println(list.delAtbegin());

        list.display();

        System.out.println(list.delAtEnd());

        list.display();

        System.out.println(list.delAtEnd());

        System.out.println(list.delAtEnd());
        System.out.println(list.delAtbegin());

//        System.out.println(list.delAtIndex(1));
        System.out.println(list.delAtIndex(0));
        list.insertAtBegin(15);

        list.delAtbegin();
//        list.insertAtIndex(23,1);

        list.display();




    }

}
