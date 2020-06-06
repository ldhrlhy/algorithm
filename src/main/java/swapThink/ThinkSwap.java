package swapThink;

import java.lang.reflect.Field;

public class ThinkSwap {
    public static void main(String[] args){
        Integer a = 1;
        Integer b = 2;
        swap(a,b);
        System.out.print(a+","+b);
    }

    private static void swap(Integer a, Integer b) {
        try{
            Field field = Integer.class.getDeclaredField("value");
            field.setAccessible(true);
            int temp=a.intValue();
            field.set(a,b);
            field.set(b,temp);

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
