package practice.lecture.stack;

public class Main {

    public static void main(String[] args) throws Exception {
        CustomStack stack = new DynamicStack(5);
        stack.push(15);
        stack.push(17);
        stack.push(6);
        stack.push(10);
        stack.push(87);
        stack.push(89);

//        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }

}
