package cc.noharry.easy._1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1 {

    //先排序,再通过遍历1次取到排好序的数组里的索引,再去原数组找到索引
    //由于使用了Arrays.sort所以时间复杂度变成了O(nlogn),多次提交都在2,3ms
    public static int[] twoSum(int[] nums, int target) {
        int[] origin=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int[] result=new int[2];
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                break;
            }else if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }
        }

        int i1=-1;
        int i2=-1;
        for(int i=0;i<origin.length;i++){
            if((origin[i]==nums[left])&&(i!=i2)){
                i1=i;
                break;
            }


        }

        for(int i=0;i<origin.length;i++){
            if((origin[i]==nums[right])&&(i!=i1)){
                i2=i;
                break;
            }
        }

        result[0]=i1;
        result[1]=i2;
        return result;

    }

    //标准答案看起来舒服多了,时间复杂度O(n),3ms
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }



    public static void main(String[] args) {
//        int[] nums = new int[]{2, 7, 11, 15};
        int[] nums = new int[]{3,3,1};
//        int target = 9;
        int target = 4;
        System.out.printf(Arrays.toString(twoSum(nums,target)));
//        System.out.printf(Arrays.toString(twoSum2(nums,target)));
    }
}
