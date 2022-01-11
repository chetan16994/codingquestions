package easy;

import java.util.*;

public class L350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap();
        int k=0;

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i],0) +1 );
        }
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
//                    res.add(nums2[i] );
                nums1[k] = nums2[i];
                k++;
                    map.put(nums2[i],map.get(nums2[i])-1 );
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
//        int[] res1 = new int[res.size()];
//        for (int i = 0 ; i <res.size(); i++){
//            res1[i] = res.get(i);
//        }
//        return res1;
//        return res.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        L350 obj=new L350();
        int[] res= obj.intersect(new int[]{54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41},new int[]{17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20});
//        int[] res= obj.intersect(new int[]{1,2,2,2,4,5}, new int[]{1,4});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
