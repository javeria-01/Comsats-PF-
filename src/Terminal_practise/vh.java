package Terminal_practise;

public class vh {
    public static void main(String[] args) {
        double[] r = new double[40];
        for (int i = 0; i < r.length; i++) {
            r[i] = Math.random() * 100;
            System.out.println(r[i]);
        }
    }
}