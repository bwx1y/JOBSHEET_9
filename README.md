# Jobsheet 9

## percobaan 1: Pertanyaan

1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?

tidak bisa di karenakan type pada array adalah int lalu yang di suruh memasukkan adalah double/float jika ingin tetap bisa maka harus merubah type menjadi double atau float


2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.

saya merubahnya menajdi ``int[] bil = {5, 13, -7, 17};``

3. Ubah statement pada langkah No 4 menjadi seperti berikut, Apa keluaran dari program? Jelaskan maksud dari statement tersebut.

keluaran nya masih sama dengan yang sebelumnya ``5 13 -7 17``, Potongan kode ini menampilkan isi array bil dari indeks 0 sampai 3.

4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?

akan terjadi erorr, karena di array hanya ada index 1-3 saja tidak ada index ke 4

## Percobaan 2: Pertanyaan

1. Jalankan program. Apakah terjadi perubahan? Mengapa demikian?

tidak kerjadi apa apa masih sama, kerena ``nilaiAkhir.length`` juga akan berisi 10 ini akan berisu sejumlah isi yang ada di deklarasikan

2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?

Kondisi i < nilaiAkhir.length berarti perulangan akan berjalan sebanyak jumlah elemen dalam array nilaiAkhir, dari indeks pertama (0) sampai indeks terakhir (length - 1).

3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):

code itu hanya kan menampilkan mahasiswa yang lulus saja

4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:

aku menambahkan: ``else System.out.println("Mahasiswa ke-"+i+" Tidak Lulus!");``

## Percobaan 3: Pertanyaan

1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70).

aku merubahnya menjadi: 
```java
public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int mahasiswaLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                mahasiswaLulus++;
            }
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Jumlah mahasiswa lulus ="+mahasiswaLulus);
    }
}
```

2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini:

aku melakukan penambahan dan melakukan perubahan : 
```
System.out.print("Masukkan jumlah mahasiswa: ");
int jumlahMahasiswa = sc.nextInt();

int[] nilaiMhs = new int[jumlahMahasiswa];
```

## Percobaan 4: Pertanyaan

1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.

``break`` digunakan untuk menghentikan perulangan (loop) secara langsung, sebelum kondisi loop selesai.

