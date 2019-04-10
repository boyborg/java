import java.awt.*;
class Second extends Frame{
    Second(){
       Button b = new Button("Masuk") ;
       //Membuat label
       Label Ibuser = new Label("Nama Pengguna");
       Label Ibpass = new Label("Kata Sandi");
       TextField tuser = new TextField();
       TextField tpass = new TextField();
       b.setBounds(30,180,80,30); //Setting button position
       add(b); // adding button ke frame
       Ibuser.setBounds(30, 100, 120, 30);
       add(Ibuser);
       tuser.setBounds(150, 100, 120,30);
       add(tuser);

       


        Ibpass.setBounds(30, 140, 80,30);
        add(Ibpass);
        tpass.setBounds(150, 140,120,30);
        add(tpass);
        setSize(400,300); // ukuran frame lebar 300 tinggi 300
        setLayout(null); //no layout manager
        setVisible(true); //sekarang frame dapat terlihat , dari asalnya tidak terlihat

        


    
        
    }
    public static void main (String[] args){
        Second s=new Second();
    }
}