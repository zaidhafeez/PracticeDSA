package revise.stack;

public class Main {

    public static void main(String[] args) throws Exception {

        StackImplementation stack = new DynamicStackImplementation(5);
//
//        System.out.println(stack.pop());

        stack.push(15);
        stack.push(24);
        stack.push(10);
        stack.push(12);
        stack.push(16);
        stack.push(19);
        stack.display();
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }

}
