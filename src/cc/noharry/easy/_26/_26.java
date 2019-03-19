package cc.noharry.easy._26;

import java.util.Arrays;

public class _26 {


    public static int removeDuplicates(int[] nums) {
        int f=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[f]){
                f++;
                nums[f]=nums[i];
            }
        }
        return f+1;
    }

    public static void main(String[] args) {
        int[] array=new int[]{1,1,1,2,2,2,4,4,5,5,7,7,8};
        int len = removeDuplicates(array);
        System.out.printf(Arrays.toString(Arrays.copyOf(array,len)));
    }
}
