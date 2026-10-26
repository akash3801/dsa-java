public class LC217 {
    public static void main(String[] args){
        int [] nums = {1,2,3,1};
        boolean b = containsDuplicate(nums);

        System.out.println(b);
    }

    public static boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        for(int i=0 ; i<size; i++){
            int count = 0;
            for(int j=0; j<size;j++){
                if(nums[i]==nums[j]){
                    count= count+1;
                    if(count >1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
