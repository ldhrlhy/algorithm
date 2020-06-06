package sort;

public class InsertSort {
    public static void main(String[] args){
        int[] values={11,8,3,9,7,1,2,5};
        insertSort(values,values.length);
        for(int i=0;i<values.length;i++){
            //System.out.print(values[i]);

        }
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());

        System.out.println("----------");
        String a = new String("abc");
        // 第一次，创建了两个对象，一个是堆中的string对象，一个是常量池中的"abc"
        String b = new String("abc");
        // 第二次，创建一个对象，堆中的另外一个string对象
        System.out.println(a.intern() == b.intern());// true
        System.out.println(a.intern() == b);// false
        System.out.println(a.intern() == a);// false
        String poolstr = "abc";
        // 直接从字符串常量池中获取
        //System.out.println(a.intern() == poolstr);// true
        //System.out.println(b.intern() == poolstr);// true

        String str = new String("a") + new String("b");
        System.out.println(str.intern() == str);// true
        /*
         * str创建了3个对象，在堆中有一个"ab"，在常量池中有一个"a"和"b" 比较str.intern()和str会得到true
         * 在jdk1.7之后，会在常量池中存一个指向堆中的那个对象的引用。
         * 调用str.intern()会在常量池中存储一个指向堆中"ab"的引用，也就是说它和堆中的对象实际是等价的，因此==时返回true
         */
        String strtwo = "ab";
        System.out.println(strtwo == str);// true


    }
    public static void insertSort(int a[],int n){
        if(n<=1){
            return;
        }
        for(int i=1;i<n;i++){
            int value=a[i];
            int j=i-1;
            for(;j>=0;--j){
                if(a[j]>value){
                    a[j+1]=a[j];
                }else{
                    break;
                }
            }
            a[j+1]=value;
        }
    }
}
