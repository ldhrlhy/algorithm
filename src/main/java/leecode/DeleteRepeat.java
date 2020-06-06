package leecode;

public class DeleteRepeat {
    public static int getLength(int[] a){
        int quick=0;
        int slow=0;
        while (quick<a.length){
            if(a[quick]==a[slow]){
                quick++;
            }else{
                slow++;
                a[slow]=a[quick];
                quick++;
            }
        }
        return slow+1;
    }

    public static void main(String[] args){
        int[] a ={1,1,3,4,5};
        System.out.println(getLength(a));
    }
}
