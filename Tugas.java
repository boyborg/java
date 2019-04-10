public class Kendaraan{
    String merk;        //atribut
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
        
    }
}

class Motor extends Kendaraan{ //child class
    int jumlahRoda;

}    