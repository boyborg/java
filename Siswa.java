public class Siswa{  //kerangka
    // ini adalah atribut
    String nama;
    int umur;
    double tinggi;
    double beratBadan;
    String jenisKelamin;

    public Siswa(String nama,int umur,String jk){ //constructor
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jk;
    }

    public void berjalan(){
        System.out.println("saya sedang berjalan bersama "+this.nama);
    }
    public String getnama(){ //prosedur function
        return this.nama;
    }
    public int getumur(){
        return 17;
    }
    public String getjk(){
        return this.jenisKelamin;
    }
    public void perkenalan(){
        System.out.println("halo nama saya "+this.nama);//prosedur method
    }
    public static void main(String[] args){
        Siswa mas = new Siswa("Mas Sterk",18,"laki-laki");

        mas.perkenalan();
        mas.berjalan();
        System.out.println(mas.getnama()); //non static
        System.out.println(mas.getumur()); //static
        System.out.println(mas.getjk());
        
    }
}