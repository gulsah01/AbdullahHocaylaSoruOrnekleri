package agustos19_02;

import java.util.Scanner;

public class Menu {
    Scanner scan=new Scanner(System.in);
    void giris(){
        System.out.println("YENI KULLANICI OLUSTURMAK ICIN '1' \n"+
                "SISTEME GIRIS ICINB '2'YE BASINIZ.. ");
        int secim=scan.nextInt();
    }
}
