package UseJavaCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList01 {
    private static ArrayList<Buku01> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        // Tambahkan 4 data di awal
        daftarBuku.add(new Buku01("01", "Algoritma Dan Struktur Data", "Bu Triana"));
        daftarBuku.add(new Buku01("02", "Basis Data", "Pak Farid"));
        daftarBuku.add(new Buku01("03", "Sistem Operasi", "Bu Meyti"));
        daftarBuku.add(new Buku01("04", "Analisis Proses Bisnis", "Pak Hendra"));

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Tampilkan Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    tambahBuku(scanner);
                    break;
                case 2:
                    hapusBuku(scanner);
                    break;
                case 3:
                    tampilkanBuku();
                    break;
                case 4:
                    System.out.println("Program Selesai. Semoga Harimu Menyenangkan :)");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
        scanner.close();
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("ISBN : ");
        String isbn = scanner.nextLine();
        System.out.print("Judul : ");
        String judul = scanner.nextLine();
        System.out.print("Pengarang : ");
        String pengarang = scanner.nextLine();
        daftarBuku.add(new Buku01(isbn, judul, pengarang));
    }

    private static void hapusBuku(Scanner scanner) {
        System.out.print("ISBN yang akan dihapus : ");
        String isbn = scanner.nextLine();
        daftarBuku.removeIf(buku -> buku.getIsbn().equals(isbn));
    }

    private static void tampilkanBuku() {
        for (Buku01 buku : daftarBuku) {
            System.out.println(buku);
        }
    }
}
