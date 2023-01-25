package Assignments;

public class Ex_3_1_Exception_Handling {
    public static void main(String[] args) {
        // (a)
        System.out.println(1 / 0);
        // (b)
        int[] list = new int[5];
        System.out.println(list[5]);
        // (c)
        String s = "abc";
        System.out.println(s.charAt(3));
        // (d)
        Object o = new Object();
        String d = (String)o;
        // (e)
        Object obj = null;
        System.out.println(obj.toString());
        // (f)
        System.out.println(1.0 / 0);
    }
}


