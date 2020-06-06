package sort;

public class SelectSort {
    public static void main(String[] args){
        int[] values={11,8,3,9,7,1,2,5};
        selectSort(values,values.length);
        for(int i=0;i<values.length;i++){
            System.out.print(values[i]);

        }

    }
    public static void selectSort(int a[],int n){
        if(n<=1){
            return;
        }
        for(int i=0;i<n-1;++i){
            int minIndex=i;
            for(int j=i+1;j<n;++j){
                if(a[j]<a[minIndex]){
                    minIndex=j;
                }
            }
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
    }
}
