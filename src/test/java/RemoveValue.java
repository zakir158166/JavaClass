import java.util.ArrayList;
import java.util.Arrays;

public class RemoveValue {


    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int [] nums1 = {0,1,2,2,3,0,4,2};
        int val1 = 2;



        RemoveVal(nums, val);
        unique_value(nums,val);
        RemoveVal(nums1, val1);
        unique_value(nums1,val1);
    }


    // Remove <val> variable values from <nums> array value.
    public static void RemoveVal(int[] nums, int val) {
        ArrayList<Integer> new_list = new ArrayList<>();
        for (int n:nums) {
            if (n != val) {
                new_list.add(n);
            }
        }
        System.out.println("Nums: "+new_list);
    }

    // A method to identify unique value from two separate variable.
    public static void unique_value(int[] nums, int val) {
        ArrayList<Integer> k= new ArrayList<>();
        for (int elem: nums){
            if (elem != val){
                if (!k.contains(elem)){
                    k.add(elem);
                }
            }
        }
        System.out.println(k);
    }

}
