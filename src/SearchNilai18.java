import java.util.Scanner;

public class SearchNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai yang akan di input: ");
        int jumlahNilai = sc.nextInt();

        int[] arrNilai = new int[jumlahNilai];
        int key;
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yangingin di cari");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil != -1) System.out.println("Nilai " + key + " ketemu, merupakan mahasiswa ke-" + hasil);
        else System.out.print("Nilai yang di cari tidak di temukan");
        System.out.println();
    }
}