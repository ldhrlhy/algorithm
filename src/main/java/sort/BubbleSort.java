package sort;

public class BubbleSort {
    public static void main(String[] args){
        int[] values={11,8,3,9,7,1,2,5};
        bubbleSort(values,values.length);
        for(int i=0;i<values.length;i++){
            System.out.print(values[i]);

        }
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);
        String str2 = new StringBuilder("a").append("bc").toString();
        System.out.println(str2.intern()==str2);

    }
    public static void bubbleSort(int a[],int n){
        if(n<=1){
            return;
        }
        for(int i=0;i<n;++i){
            boolean flag = false;
            for(int j=0;j<n-i-1;++j){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
