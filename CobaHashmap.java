import java.util.HashMap;

public class CobaHashmap{
    public static void main(String[] args){

        HashMap<Integer,String> Hari = new HashMap<Integer,String> ();

        Hari.put(1,"Ahad");
        Hari.put(2,"Senin");
        Hari.put(3,"Selasa");
        Hari.put(4,"Rabu");
        Hari.put(5,"Kamis");
        Hari.put(6,"Jum'at");
        Hari.put(7,"Sabtu");

        System.out.println("isi objek hari : "+ Hari);
        System.out.println(Hari.get(3));

    }
    
}