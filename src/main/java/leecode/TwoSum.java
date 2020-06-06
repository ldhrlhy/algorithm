package leecode;

/**
 * Created by Administrator on 2019/7/1.
 */
// leecode 1
public class TwoSum {
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] temp = twoSum(a,10);
        System.out.println(temp);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i=0,j=1;
        while(i<nums.length-1){
            if(nums[i] + nums[j]==target){
                result[0]=i;
                result[1]=j;
                return result;
            }else{
                if(j==nums.length-1){
                    i++;
                    j=i+1;
                }else{
                    j++;
                }

            }
        }
        return result;
    }
}
