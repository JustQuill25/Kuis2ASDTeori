package DontUseJavaCollection;

public class Buku01 {
    private String isbn;
    private String judul;
    private String pengarang;

    public Buku01(String isbn, String judul, String pengarang) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    @Override
    public String toString() {
        return "Buku01 {" +
                " isbn = '" + isbn + '\'' +
                ", judul = '" + judul + '\'' +
                ", pengarang = '" + pengarang + '\'' +
                '}';
    }
}
