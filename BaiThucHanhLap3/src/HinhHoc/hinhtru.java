package HinhHoc;
import java.util.Scanner;


public class hinhtru extends hinhtron {
   
    public hinhtru(String ten) {
       ten ="hinhtru" ;
    }
    public float chieucao;
    public void hinhtrutron (String ten){
        ten="hinhtrutron";

    }
    public void nhapchieucao(){
        nhapbankinh();
        System.out.println("chieucaobang");
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();

    }
    public void tinhthetich(float dientich, float thetich){
        tinhdientich();
        thetich = dientich * chieucao;

    }
    

    
}
