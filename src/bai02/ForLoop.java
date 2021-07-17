package bai02;

public class ForLoop {

    public static void main(String[] args) {

        // n! = 1*2*....*(n-1)*n
//        int initValue = 1;
        int giaithua = 2;

        for (int initValue = 1; initValue < 6; initValue++) {
            giaithua = giaithua * initValue;
//            System.out.println("Giai thua: " + giaithua);
        }
        System.out.println("Giai thua: " + giaithua);
    }
}