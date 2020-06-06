package leecode;

public class LongStr {
    public static int solution(String s){
        int[] flag = new int[256];
        char[] chars = s.toCharArray();
        int i=0;
        int r=-1;
        int res=0;
        while (i<chars.length){
            if(r<s.length()-1&&flag[chars[r+1]]==0){
                r++;
                flag[chars[r]]++;
            }else{
                flag[chars[i]]--;
                i++;
            }
            res = res>r-i+1?res:r-i+1;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcdfff"));
    }
}
