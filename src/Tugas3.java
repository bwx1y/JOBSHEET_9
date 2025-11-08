import java.util.Arrays;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("=== Daftar Menu Kafe ===");
        for (String item : menu) {
            System.out.println("- " + item);
        }

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String search = sc.nextLine();

        String find = Arrays.stream(menu)
                .filter(f -> f.equalsIgnoreCase(search))
                .findFirst()
                .orElse(null);

        if (find == null) {
            System.out.println("❌ Maaf, " + search + " tidak ada di menu.");
        } else System.out.println("✅ " + find + " tersedia di menu.");
    }
}
