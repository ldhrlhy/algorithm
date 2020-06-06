package leecode;

public class MergeSort {
    public static void main(String[] args) {
        int[] num = {19,1,2,3,4,5,6,7,8,10};
        mergeSort(num,0,num.length-1);
        System.out.println(1);
    }

    private static void mergeSort(int[] a, int p, int r) {
        if(p>=r){
            return;
        }
        int q= (p+r)/2;
        mergeSort(a,p,q);
        mergeSort(a,q+1,r);
        merge(a,p,q,r);
    }

    private static void merge(int[] a, int p, int q, int r) {
        int i=p;
        int j=q+1;
        int[] temp = new int[r-p+1];
        int k=0;
        while (i<=q && j<=r){
            if(a[i]<=a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        int start=i;
        int end = q;
        if(j<=r){
            start=j;
            end=r;
        }
        while (start<=end){
            temp[k++] = a[start++];
        }
        for(i=0;i<=r-p;++i){
            a[p+i] = temp[i];
        }
    }
}
