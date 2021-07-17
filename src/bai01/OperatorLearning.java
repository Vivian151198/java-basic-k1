package bai01;

public class OperatorLearning {

    public static void main(String[] args) {

        int x = 5; // x = 8
        int y = 12; // y = 5
        int z = x++ + ++y; // z = 12

        int t = 7/4; // Chia lấy phần nguyên t = 1
        int w = 7%4;// Chia lấy phần dư w = 3

        //Sau khi chay chuong trinh thi x, y , z
        // 1. Prefix: Dau trước mới tới biến
        // 2. Thực hiện phép tính
        // Postfix: 8

        System.out.println("X:" + x);
        System.out.println("Y:" + y);
        System.out.println("Z:" + z);
    }
}
