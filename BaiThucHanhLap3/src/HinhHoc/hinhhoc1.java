package HinhHoc;

import javax.sound.sampled.SourceDataLine;

public class hinhhoc1 {
    private final float PI = 3.14f;

    private String ten;
    private float chuvi;
    private float thetich;
    private float dientich;

    public float getpi(){
        return PI;
    }
    public String getten(){
        return ten;
    }
    public float getchuvi(){
        return thetich;
    }
    public float getthetich(){
        return thetich;
    }
    public float getdientich(){
        return dientich;
    }

    public void xuatten()
    {
        System.out.println("\n\n====="+ ten +"=====");

    }
    public void inchuvi()
    {
         System.out.println("chuvi="+ chuvi);
    }
    public void indientich()
    {
        System.out.println("dientich="+ dientich);
    }
    public void inthetich()
    {
        System.out.println("thetich="+ thetich);
    }
}
