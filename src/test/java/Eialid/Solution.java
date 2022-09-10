package Eialid;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int [] nums1 = {0,1,2,2,3,0,4,2};
        int val1 = 2;

        removeElement(nums, val);
        removeElement(nums1, val1);
//        unique_value(nums,val);
//        unique_value(nums1,val1);
    }

    // Remove <val> variable values from <nums> array value.
    public static void removeElement(int[] nums, int val) {
        ArrayList<Integer> k = new ArrayList<>();
        for (int i=0;i< nums.length;i++) {
            if (nums[i] != val) {
                k.add(nums[i]);
            }
        }
        System.out.println(k.toArray().length);
        System.out.println("Nums: "+k);

    }

    // A method to identify unique value from two separate variable.
//    public static void unique_value(int[] nums, int val) {
//        ArrayList<Integer> k= new ArrayList<>();
//        for (int elem: nums){
//            if (elem != val){
//                if (!k.contains(elem)){
//                    k.add(elem);
//                }
//
//            }
//        }
//        System.out.println(k);
//    }

}
