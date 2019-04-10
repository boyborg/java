package templerun;


public class Mainclass{
    String nama;   //atribut
    int healthBar;
    int point;
    int speed;

    public void running(){
        System.out.println(this.name +"is running");
        System.ount.println("speed :"+this.speed);
    }
    public void jump(){
        System.out.println(this.nama +"is running");
    }
    public boolean isDead(){
        if(healthBar<=0){
            return true;
        }
    }
    

}