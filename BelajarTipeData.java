public class BelajarTipeData{
    public static void main(String[] args){
        byte a = 127;
        short b = 32767;
        int c = 21470000;
        long d = 2147000000;
        float e = 87.5f;
        double f = 9.9999;
        char g = 'a';
        char h = '\111';
        boolean i = true;
        String j = "hey,my name is isaac"; //string harus kutip dua ("_")
        int panjang = j.length();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(panjang);

    boolean hujan = false; //operator ternary
    String result =(hujan==true)?"hujan":"tidak";
    System.out.println(result);
    double hasil = luasSegitiga(5.0,6.0);
    System.out.println(hasil);

    int nilai=85;
    String nama="boy";
    char grade = 'A';
    tampilkan(nama,nilai,grade);
    }
    

    static void tampilkan(String nama,int nilai,char grade){
        System.out.println("hello "+ nama+","+nilai+","+grade);
    }



static double luasSegitiga(Double alas,Double tinggi){
    return 0.5 *alas * tinggi;
    
}


}