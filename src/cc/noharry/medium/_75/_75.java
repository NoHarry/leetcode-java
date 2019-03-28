package cc.noharry.medium._75;

import java.util.Arrays;

public class _75 {
    //粗暴的方法,两步完成
    public static void sortColors(int[] nums) {
        int i0=0;
        int i1=0;
        int i2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                i0++;
            }else if(nums[i]==1){
                i1++;
            }else if(nums[i]==2){
                i2++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i0>0){
                nums[i]=0;
                i0--;
            }else{
                if(i1>0){
                    nums[i]=1;
                    i1--;
                }else{
                    if(i2>0){
                        nums[i]=2;
                        i2--;
                    }
                }
            }
        }
    }

    //一步完成
    public static void sortColors1(int[] nums) {
        int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,0,2,1,1,0};
//        sortColors(nums);
        sortColors1(nums);
        System.out.printf("sort:"+ Arrays.toString(nums));
    }
}
