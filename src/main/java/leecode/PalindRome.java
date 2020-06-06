package leecode;

public class PalindRome {
    public static boolean isPalindRome(String s){
        char[] chars = s.toCharArray();
        int l=chars.length/2;

        int start=0,end=chars.length-1;
        while (start<l&&end>=l){
            if(chars[start]==chars[end]){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindRome("1001"));
    }
}
