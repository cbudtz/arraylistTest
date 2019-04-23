import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] ints = new int[1000000];
        ints[1] = 1;
        Integer[] integers = new Integer[1000000];
        integers[1] = 1;
        ArrayList<Integer> aIntegers = new ArrayList<>(1000000);
        aIntegers.add(0,1);
        aIntegers.add(1,1);

        long start = System.nanoTime();


        for(int i = 0; i<1000000;i++){
            ints[0] = ints[1];
        }
        System.out.println("elapsed (ints) = " + (System.nanoTime()-start));
        start = System.nanoTime();


        for (int i = 0; i<1000000;i++){
            integers[0] = integers[1];
        }
        System.out.println("elapsed (Integers - autoboxing) = " + (System.nanoTime()-start));
        start = System.nanoTime();

        for(int i = 0;i<1000000;i++){
            aIntegers.set(0,aIntegers.get(1));
        }
        System.out.println("elapsed (Arraylist) = " + (System.nanoTime()-start));


    }
}
