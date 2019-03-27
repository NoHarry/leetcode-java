package cc.noharry.easy._830;

import java.util.ArrayList;
import java.util.List;

public class _830 {

    //时间复杂度 O(n)
    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result=new ArrayList<>();
        if(S==null||S.length()<3){
            return result;
        }
        char[] array=S.toCharArray();
        //用于记录出现的第一个字母的位置
        int first=0;
        for(int i=1;i<array.length;i++){
            if(array[i-1]==array[i]){
                if((i-first)>=2){
                    if(i==array.length-1){
                        List<Integer> l=new ArrayList<>();
                        l.add(first);
                        l.add(i);
                        result.add(l);
                    }else {
                        if(array[i]!=array[i+1]){
                            List<Integer> l=new ArrayList<>();
                            l.add(first);
                            l.add(i);
                            result.add(l);
                        }
                    }
                }
            }else{
                first=i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s="abcdddeeeeaabbbcd";
        System.out.printf("s:"+largeGroupPositions(s));
    }
}
