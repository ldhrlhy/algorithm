package leetcode;

public class Solution {
	public static int[] twoSum(int[] nums, int target) {
        int index=0;
        int[] result;
        result=new int[2];
        int i;
        int find;
        boolean b=true;
        while(index < nums.length&&b){
            find=target-nums[index];
            for(i=index+1;i<nums.length;i++){
                if(nums[i]==find){
                    result[0]=index;
                    result[1]=i;
                    b = false;
                    break;
                }else{
                    continue;
                }
            }   
            
            index++;
        }
        if(result.length<=0){
        	System.err.println("no");
        }
        return result;
    }
	public static void main(String[] args) {
		int[] nums={-1, -2, -3, -4,-5};
		int target=-8;
		int[] result = twoSum(nums, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}
