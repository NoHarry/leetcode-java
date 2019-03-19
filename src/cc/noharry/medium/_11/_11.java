package cc.noharry.medium._11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _11 {

    public static int maxArea(int[] height) {
        int[] result=new int[3];
        Arrays.fill(result,0);
        for(int i=0;i<height.length;i++){
            for(int j=i;j<height.length;j++){
                int h=height[i]>height[j]?height[j]:height[i];
                int t = Math.abs(i - j);
                int s=t*h;
                if(s>result[2]){
                    result[0]=i;
                    result[1]=j;
                    result[2]=s;
                }
            }
        }

        return result[2];

    }


    public static int maxArea2(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int[] array=new int[]{1,8,6,2,5,4,8,3,7};
        maxArea(array);
        maxArea2(array);
    }
}
