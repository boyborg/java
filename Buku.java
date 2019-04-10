package perpustakaan;


public class Buku{
    String isbn;
    String judul;
    String penerbit;
    int jmlHal;

    public String getJudul(){
        return this.judul;
    }
    public void pinjamBuku(){
        System.out.println("Buku ini berhasil dipinjam");

    }
    public void kembalikaBuku(){
        System.out.println("Buku ini berhasil dikembalikan");
    }
}