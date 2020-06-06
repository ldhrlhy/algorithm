package leecode;

public class ArraySum {
    public static void main(String[] args) {
        int[] num = {1,2,2,3,4,5,6,7,8,9};
        int sum = 7;
        findSum(num,sum);
    }

    private static void findSum(int[] num,int sum){
        int start = 0;
        int end = 0;
        for(int i=0;i<num.length;i++){
            int total=0;
            start=i;
            end=i;
            while (total<sum){
                total +=num[end++];
            }
            if(total==sum){
                for(int j=start;j<end;j++){
                    System.out.println(num[j]+" ");
                }
                System.out.println( );
            }
        }
    }
}
