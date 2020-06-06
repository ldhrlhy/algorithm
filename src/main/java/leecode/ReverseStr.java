package leecode;

public class ReverseStr {
    public static String reverse(String s){
        char[] chars = s.toCharArray();
        int l=chars.length/2;

        int start=0,end=chars.length-1;
        while (start<l&&end>=l){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverse("casdasgd"));
    }
}
