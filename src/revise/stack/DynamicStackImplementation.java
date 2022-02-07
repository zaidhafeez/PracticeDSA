package revise.stack;

public class DynamicStackImplementation extends StackImplementation{

    DynamicStackImplementation(int size){
        super(size);
    }


    @Override
    public boolean push(int val) throws Exception {
        if (isFull()){

            int[] temp = new int[2 * this.data.length];
            for (int i = 0; i < length; i++) {

                temp[i] = this.data[i];

            }

            data = temp;

        }
        return super.push(val);
    }
}
