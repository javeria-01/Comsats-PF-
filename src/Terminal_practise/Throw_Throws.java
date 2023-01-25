package Terminal_practise;

import java.util.Scanner;

public class Throw_Throws extends Exception {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int area = s.nextInt();
        if (area < 0) {
            throw new Exception();
        } else {
            System.out.println(area);
        }
    }
}