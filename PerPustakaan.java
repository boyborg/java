package perpustakaan;  //kumpulan atau kategori dari class
import perpustakaan.Buku;

public class PerPustakaan{
    public static void main(String[] args){
        System.out.println("Selamat datang diperpustakaan BSD");
        Buku lotr = new Buku();
        lotr.judul = "lord of The Rings";
        System.out.println(lotr.getJudul());
        

    }
}

// langkah langkah package
//1.javac -d . Buku.java
//2.javac -d. PerPustakaan.java
//3.javac perpustakaan.PerPustakaan

//optional:harus dipanggil package nya terlebih dahulu