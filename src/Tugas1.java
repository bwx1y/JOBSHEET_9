import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai yang akan di input: ");
        int valueLength = sc.nextInt();

        int[] value = new int[valueLength];

        for (int i = 0; i < valueLength; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            value[i] = sc.nextInt();
        }

        double average = Arrays.stream(value).average().orElse(0);
        int maxValue = Arrays.stream(value).max().orElse(0);
        int minValue = Arrays.stream(value).min().orElse(0);

        System.out.println();
        for (int i = 0; i < valueLength; i++) {
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+": "+value[i]);
        }

        System.out.printf("Rata-Rata nilai: %.2f %n", average);
        System.out.printf("Nilai tertinggi: %d %n", maxValue);
        System.out.printf("Nilai terendah: %d %n", minValue);
    }
}
