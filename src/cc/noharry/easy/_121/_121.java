package cc.noharry.easy._121;

import java.util.ArrayList;
import java.util.List;

public class _121 {
    //直接获取 时间复杂度O(n^2)
    public static int maxProfit1(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length;i++){
            int buy=prices[i];
            for(int j=prices.length-1;j>i;j--){
                int sell=prices[j];
                int r=sell-buy;
                if(r>0){
                    max=Math.max(max,r);
                }
            }
        }
        return max;
    }

    //只遍历一次 时间复杂度O(n)
    public static int maxProfit2(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }







    public static void main(String[] args) {
        int[] array=new int[]{7,1,5,3,6,4};
        System.out.println("profit1:"+maxProfit1(array));
        System.out.println("profit2:"+maxProfit2(array));
    }
}
