package HinhHoc;
import java.util.Scanner;

public class hinhtron extends hinhhoc1 {
    public float bankinh;

    public hinhtron(String ten){
        ten = "Hinh Tron";
    }
    public void nhapbankinh(){
        System.out.println("ban kinh = ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }
    public void tinhchuvi(float PI, float chuvi){
        chuvi = 2 * PI * bankinh;
    }
    public void tinhdientich(float dientich, float PI){
        dientich = PI * bankinh *bankinh;
    }
}
