package HinhHoc;
import java.util.Scanner;

public class hinhchunhat extends hinhhoc1 {
      public float dai,rong;
      public hinhchunhat(String ten){
        ten = " hinh chu nhat ";

      }
      public void nhapchieudai(){
        System.out.println("chieudai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();

      }
      public void nhapchieurong(){
        System.out.println("chieurong = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
      }
      public void tinhchuvi(float chuvi){
        chuvi = 2 * ( dai + rong );

      }
      public void tinhdientich(float dientich){
        dientich = dai * rong;
        
      }
}
