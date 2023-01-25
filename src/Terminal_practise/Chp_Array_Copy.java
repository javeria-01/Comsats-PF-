package Terminal_practise;

import java.util.Arrays;

public class Chp_Array_Copy {
    public static void main(String[] args) {
        int[] source = {3, 4, 5};
        int[] t = new int[source.length];
        System.arraycopy(source, 0, t, 0, source.length);
        System.out.println(t[source.length]);
    }

}
