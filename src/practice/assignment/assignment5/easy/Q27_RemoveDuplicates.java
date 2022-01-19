package practice.assignment.assignment5.easy;

class Q27_RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1,1,2};

        int ans = removeDuplicates(nums);
        System.out.println(ans);

    }


    static int removeDuplicates(int[] nums) {

        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }

        int j = 0;
        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i] != nums[i+1]){
                nums[j++] = nums[i];
            }
        }

        nums[j++] = nums[nums.length - 1];

        return j;
    }


//    static int removeDuplicates(int[] nums) {
//
//        boolean startFromZero;
//        int  k = 0;
//
//        if(nums[0] == 0){
//
//            startFromZero = true;
//            duplicatesRemoves(nums,startFromZero);
//            for(int i = 0; i < nums.length; i++){
//
//
//            if(nums[i] == i) k++;
//
//            }
//
//        }
//        else{
//
//            startFromZero = false;
//            duplicatesRemoves(nums,startFromZero);
//            for(int i = 0; i < nums.length; i++){
//
//
//            if(nums[i] == i + 1) k++;
//
//            }
//
//        }
//
//
//
//        return k;
//
//
//    }

//    static void duplicatesRemoves(int[]nums,boolean startFromZero){
//
//        if(startFromZero){
//
//            int i = 0;
//            while(i < nums.length){
//
//                int correctIndex = nums[i];
//
//                if(nums[i] != nums[correctIndex]){
//
//                    swap(nums,i,correctIndex);
//
//                }
//
//                else i++;
//
//
//            }
//
//        }
//        else{
//
//            int i = 0;
//            while(i < nums.length){
//
//                int correctIndex = nums[i] - 1;
//
//                if(nums[i] != nums[correctIndex]){
//
//                    swap(nums,i,correctIndex);
//
//                }
//
//                else i++;
//
//
//            }
//
//
//        }
//
//    }

//    static void swap(int[] nums, int first, int second){
//
//        int temp = nums[first];
//        nums[first] = nums[second];
//        nums[second] = temp;
//
//
//
//    }
    
    
}