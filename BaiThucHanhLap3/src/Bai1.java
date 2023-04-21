import java.util.Scanner;

public class Bai1 {

    public float bankinh;
    public float chuvi;
    public float dientich; 
    public final float pi = 3.14f;

    public void nhapvao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("tinh chu vi");
        bankinh = sc.nextInt();
    }
    public void tinhChuVi(){
        chuvi = pi *(bankinh+bankinh);
    }
    public void tinhDienTich(){
        dientich = pi * bankinh * bankinh;
    }
    public void inthongtin(){
       System.out.printf("chu vi:%f dientich:%f bankinh%f",chuvi,dientich,bankinh);
    }



    }

