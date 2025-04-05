package DSA_2Pointers_Problems;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,3,0,12};
        moveZeroEnd(arr);
    }

    public  static  void moveZeroEnd(int[] nums)
    {
        int nonZeroIndex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
            int temp = nums[nonZeroIndex];
                nums[nonZeroIndex]=nums[i];
                nums[i]=temp;
                nonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
