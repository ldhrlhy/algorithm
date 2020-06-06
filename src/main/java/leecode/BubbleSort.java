package leecode;

public class BubbleSort {public static void main(String[] args) {
    int[] num = {19,1,2,3,4,5,6,7,8,10};
    bubbleSort(num,num.length);
    System.out.println(1);
}

    private static void bubbleSort(int[] a,int n) {
        for(int i=0;i<n;i++){
            for(int j=i;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
