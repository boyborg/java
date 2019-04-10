import java.awt.SystemColor;

public class Men{

    public static void main(String[] args){

        String [] x ={"boy","jay"};

    try{
        System.out.println(x [2]);
        }
            
       catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("data tersebut tidak ada");
        }

        
    }

    public static void larS() {
        Matematika tambah = new Matematika();
        System.out.println(tambah.tambah(10,5));
        Matematika tambah1 = new Matematika();
        System.out.println(tambah1.tambah(10.5,20.5));
        System.out.println(tambah1.tambah(10.5,5.5));

        System.out.println(tambah1.divKO(0, 2));
       
        

    }


    
}
class Matematika {
    //overload
    public int tambah(int a,int b){ //fungsi = mengembalikan sebuah nilai
        return a + b;
    }

    public double tambah(double a, double b){
        return a + b;
    }

    public int divKO(int a,int b){

    return a/b;
    }

   
}