public class Segitiga{
    // Fungsi untuk mencetak segitiga sama kaki
    static void cetakSegitiga(int tinggi) {
        for (int i = 1; i <= tinggi; i++) {
            // Cetak spasi sebanyak (tinggi - i)
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print("  ");
            }
            // Cetak bintang sebanyak (2 * i - 1)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            // Pindah ke baris baru setelah setiap baris selesai dicetak
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int tinggiSegitiga = 5; // Tinggi segitiga (bisa diubah sesuai kebutuhan)
        cetakSegitiga(tinggiSegitiga); // Panggil fungsi cetakSegitiga dengan parameter tinggiSegitiga
    }
}
