import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Parkir{
    
    public static void main(String[] args) throws Exception{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in); 
        BufferedReader input = new BufferedReader(inputStreamReader);
        program();
       print("apakah akan menghitung lagi ? [Y/N :");
       String status= input.readLine();
       boolean s = true;
       while(s == true){
           program();
           if(status !="Y"|| status != "y"){
               s = false;
           }
       }
       
    }
    public static void program() throws Exception{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in); 
        BufferedReader input = new BufferedReader(inputStreamReader);

        String plat,jk,masuk,keluar;
        

}