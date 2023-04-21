package baithuchanh2104;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class run {
    static List<danhba> list = new ArrayList<DanhBa>();
    static void init()
    {
        list.add(new danhba("name 1", "0123456789"));
        list.add(new danhba("name 2", "0123456789"));
    }
    static void print()
    {
        System.out.println("\n Danh sach  so dien thoai: ");
        System.out.println(String.format("%30s %15s","Ten", "So dien thoai"));
        for(danhba soDT : list)
        {
            System.out.println(soDT);
        }
    }

    static void timSoDT(String PhoneNumber)
    {
        System.out.println(String.format("%30s %15s", "Ten", "So dien Thoai "));
        for(danhba soDT : list)
        {
            if(soDT.getPhoneNumber().equals(PhoneNumber))
            {
                System.out.println(soDT);
            }
        }
    }

    static void timTen(String Address)
    {
        System.out.println("\n Danh sach  so dien thoai: ");
        System.out.println(String.format("%30s %15s","Ten", "So dien thoai"));
        for(danhba soDT : list)
        {
            System.out.println(soDT);
        }
    }
   public static void main(String[] args) 
   {
        init();
        print();
        timSoDT("0862879616");
        timTen("Duc Quy");
    }
}
