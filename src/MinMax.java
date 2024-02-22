import java.util.*;

class Calc {

    public static void main(String args[]) {
        int a[] = {11, 18, 3, 5, 1};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : a) {
            if(x < min)
                min = x;
            if(x > max)
                max = x;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Done");
    }
}
