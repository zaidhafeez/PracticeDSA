package revise.queue;

public class DynamicQueue1 extends QueueTwoPointer{

    DynamicQueue1(int size){
        super(size);
    }

    @Override
    public boolean enqueue(int val) throws Exception {

        if(this.isFull()){

            int[] temp = new int[2 * data.length];
            for (int i = 0; i <= rear ; i++) {

                temp[i] = data[i];

            }
            data = temp;

        }


        return super.enqueue(val);
    }
}
