package sort;

public class MergeOrder {
    public static void main(String[] args){
        int[] values={11,8,3,9,7,1,2,5};
        mergeSort(values,values.length);
        for(int i=0;i<values.length;i++){
            System.out.print(values[i]);

        }

    }
    private static void mergeSort(int[] a,int size){

        mergeSortInternally(a,0,size-1);
    }
    private static void mergeSortInternally(int []a,int p,int r){
        if(p>=r){
            return;
        }
        int q=(p+r)/2;
        mergeSortInternally(a,p,q);
        mergeSortInternally(a,q+1,r);
        merge(a,p,q,r);
    }
    private static void merge(int[] a, int p, int q, int r){
        int i=p;
        int j=q+1;
        int k=0;
        int[] tmp = new int[r-p+1];
        while (i<=q && j<=r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++]; // i++等于i:=i+1
            } else {
                tmp[k++] = a[j++];
            }
        }
        // 判断哪个子数组中有剩余的数据
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组tmp
        while (start <= end) {
            tmp[k++] = a[start++];
        }

        // 将tmp中的数组拷贝回a[p...r]
        for (i = 0; i <= r-p; ++i) {
            a[p+i] = tmp[i];
        }
    }
}

