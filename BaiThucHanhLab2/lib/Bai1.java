import java.util.Scanner;
public class Bai1 {

    public static void main(String[] args) throws Exception  
    {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = sc.nextFloat();
        System.out.print("Nhap so b: ");
        b = sc.nextFloat();
   
        System.out.printf("Tong 2 so vua nhap la: %f\n", (a + b));
 
        System.out.printf("Hieu 2 so vua nhap la: %f\n", (a - b));
  
        System.out.printf("Tich 2 so vua nhap la: %f\n", (a * b));
   
        System.out.printf("Thuong 2 so vua nhap la: %f\n", (a / b));

        System.out.printf("Phan du 2 so vua nhap la: %f\n", (a % b));


        System.out.println("a lon hon b la: ");
        System.out.println( a > b);
        System.out.println("a nho hon b la: ");
        System.out.println( a < b);
        System.out.println("a bang  b la: ");
        System.out.println( a == b);



    }
}