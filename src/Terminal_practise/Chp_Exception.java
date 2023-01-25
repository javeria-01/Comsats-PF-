package Terminal_practise;

public class Chp_Exception {
    public static void main(String[] args) {
       int[]arr = new int[5];
       try {
           for (int i = 0; i <= arr.length; i++) {
           }
       }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Display this statement normally");
    }
}