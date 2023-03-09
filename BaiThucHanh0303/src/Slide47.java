import java.util.Scanner;

public class Slide47 {
   
    public static void main(String args[]){
        int a, tong=0;
        try (Scanner sc = new Scanner(System.in)){
        do
         {
            System.out.println("nhap vao so nguyen: ");
            a = sc.nextInt();
            tong += a;

          }
          while(tong < 100);
          System.out.println("tong cac so nguyen vua nhap : " + tong);
        }
    }
}
