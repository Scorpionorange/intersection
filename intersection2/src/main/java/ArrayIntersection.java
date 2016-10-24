import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ScorpionOrange on 2016/10/23.
 */
public class ArrayIntersection {
    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        Solution s = new Solution();
        int[] out = s.intersection(nums1, nums2);

        for(int i : out){
            System.out.print(i + ", ");
        }
    }
}

class Solution{
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */

    public int[] intersection(int[] nums1, int[] nums2){
        // Write your code here
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i =0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){ // 唯一映射
                map.put(nums1[i],1);
            }
        }
        ArrayList<Integer> A = new ArrayList<Integer>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){ // 相同元素
                A.add(nums2[i]);
                map.remove(nums2[i]); // 去除相同元素
            }
        }
        int[] res = new int[A.size()];
        for(int i=0;i<A.size();i++){ // 保存到数组中
            res[i] = A.get(i);
        }
        return res;
    }
}
