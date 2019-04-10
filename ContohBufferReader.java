import java.io.*;
//import java.io.IOException;
//import java.io.InputStream;

public class ContohBufferReader{
    public static void main(String[] args) {  //deklarasi variable
        int input = 0;

        BufferedReader data = new BufferedReader (new InputStreamReader(System.in));

        
        
        System.out.print("masukan angka :");
        try {
            input = Integer.parseInt(data.readLine());
        }
            catch(IOException e) {
                System.out.println("Error!"); 
            }
            if(input %2==0) {
                System.out.println("bilangan genap");
            }
            else{
                System.out.print("bilangan ganjil");
            }
                
                

                    
                
            
        

        
        

    }
}