package binary;

public class BinaryLastEqual {
    public static void main(String[] args){
        int[] values={8,11,19,23,23,27,33,45,55,55,55,67,98};
        int index = binarySearch(values,values.length,55);
        System.out.println(index);

    }

    private static int  binarySearch(int a[],int n,int value){
        int low=0;
        int high=n-1;

        while (low<=high){
            int mid=low+((high-low)>>1);
            if(a[mid]<value){
                low=mid+1;
            }else if(a[mid]>value){
                high=mid-1;
            }else{
                if(mid==n||a[mid+1]!=value){
                    return mid;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}
