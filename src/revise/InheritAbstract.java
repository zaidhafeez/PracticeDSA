package revise;

public class InheritAbstract extends Abstraction implements Interface{



    @Override
    void normal() {
        System.out.println("Hello");
    }
    @Override
    public void printB() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        Abstraction obj = new InheritAbstract();
        int b = obj.a;
        obj.printB();



        System.out.println(b);

    }

}
