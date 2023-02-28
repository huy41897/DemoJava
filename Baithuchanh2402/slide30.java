import java.util.Scanner ;
public class slide30
{
  public static void main (String[]args)
  {
    int n, tong;
    try (Scanner sc = new Scanner (System.in)) {
      System.out.printf ("nhap n: ");
      n = sc.nextInt ();
    }
      tong = 0;
    while (n > 0)
      {
      tong = tong + n % 10;
	  n = n / 10;
      }
    System.out.printf ("tong cac chu so vua nhap la: ");
      System.out.print (tong);
  }
}
    

