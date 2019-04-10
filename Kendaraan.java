public class Kendaraan{
    String merk;        //atribut (otomatis sudah public)
    int jumlahRoda;
    String skillz;
    int health;
    int energy;
    String cLass;

    public void Maju(){
        System.out.println("maju");
    }
    public void nyalakanMesin(){
        System.out.println("mesin dinyalakan");
    }
    
    public static void main(String[] args){ //kita bisa membuat objek disini
        Kendaraan mobil_A= new Kendaraan();
        mobil_A.merk = "lamborghini";
        mobil_A.jumlahRoda= 4;

        mobil_A.nyalakanMesin();
        mobil_A.Maju();

        Kendaraan mobil_B= new Kendaraan();
        mobil_B.merk = "toyota";
        mobil_B.jumlahRoda= 4;

        mobil_B.nyalakanMesin();
        mobil_B.Maju();

        Motor motor_A = new Motor();
        motor_A.merk = "Yamaha N-Max";
        System.out.println(motor_A.merk);

        motor_A.Maju();
        System.out.println(motor_A.jumlahRoda);
        motor_A.boy();
        motor_A.crash();
        System.out.println(motor_A.setCc(120)); //contoh set
        
        
    }
}

class Motor extends Kendaraan{ //child class (inheritance)
    int jumlahRoda=2;
    private int Cc; //private tidak bisa diturunkan

    public int setCc(int Cd){
        return this.Cc=Cd;
    }


    public void Maju(){ //meskipun sama dengan kelas main namun java bersifat menimpa jadi yang ini yang menjadi prioritas
        System.out.println("motor maju");
    }

    public void boy(){ // prosedur=tidak mengembalikan nilai
        System.out.println("stending");
    }

    public void crash(){
        System.out.println("servis");
    }

}    