package leecode;

public class QuickSort {
    public static void main(String[] args) {
        int[] num = {9,2,2,3,4,5,6,7,8,9};
        quickSort(num,0,num.length-1);
        System.out.println(1);
    }

    private static void quickSort(int[] num,int p,int q) {
        if(p>=q){
            return;
        }
        int partation = getPartation(num,p,q);
        quickSort(num,p,partation-1);
        quickSort(num,partation+1,q);
    }

    private static int getPartation(int[] a, int p, int r) {
        int privot=a[r];
        int i=p;
        for(int j=p;j<r;j++){
            if(a[j]<privot){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
        int temp=a[i];
        a[i]=a[r];
        a[r]=temp;
        return i;

    }
}
