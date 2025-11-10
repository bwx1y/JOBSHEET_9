import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int orderQuantity = sc.nextInt();

        String[] order = new String[orderQuantity];
        double[] price = new double[orderQuantity];
        double priceResult = 0;

        for (int i = 0; i < orderQuantity; i++) {
            sc.nextLine();
            System.out.print("Masukan Nama Pesanan: ");
            order[i] = sc.nextLine();
            System.out.print("Masukkan harga: ");
            price[i] = sc.nextDouble();

            priceResult += price[i];
        }

        System.out.println();
        System.out.println("== Pesanan ==");
        for (int i = 0; i < orderQuantity; i++) {
            System.out.printf("%d. %s Rp. %,.2f %n", i + 1, order[i], price[i]);
        }
        System.out.printf("Total Harga: Rp. %,.2f", priceResult);
    }
}
