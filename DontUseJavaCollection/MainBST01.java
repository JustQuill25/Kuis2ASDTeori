package DontUseJavaCollection;

import java.util.Scanner;

public class MainBST01 {
    private static BinarySearchTree01 bst = new BinarySearchTree01();

    public static void main(String[] args) {
        // Tambahkan  4 data di awal
        bst.tambahBuku(new Buku01("01", "Algoritma Dan Struktur Data", "Bu Triana"));
        bst.tambahBuku(new Buku01("02", "Basis Data", "Pak Farid"));
        bst.tambahBuku(new Buku01("03", "Sistem Operasi", "Bu Meyti"));
        bst.tambahBuku(new Buku01("04", "Analisis Proses Bisnis", "Pak Hendra"));

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
        bst.tambahBuku(new Buku01(isbn, judul, pengarang));
    }

    private static void hapusBuku(Scanner scanner) {
        System.out.print("ISBN yang akan dihapus : ");
        String isbn = scanner.nextLine();
        bst.hapusBuku(isbn);
    }

    private static void tampilkanBuku() {
        bst.tampilkanBuku();
    }
}
