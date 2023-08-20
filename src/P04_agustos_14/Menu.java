package P04_agustos_14;

import java.util.Scanner;

public class Menu {
    Scanner scan =new Scanner(System.in);
    void  menu(){

        boolean cikis=true;
        do {
            System.out.println("1. Kayit Islememi\n"+
                   "2. Kisi Listele\n"+
                    "3. Sansli Kisiler\n"+
                    "4. Cikis\n"+
                    "SECIMINIZ");
            int secim =scan.nextInt();
            switch (secim){
                case 1:
                   kullanicilar = Registration.register
                case 2:
                case 3:
                case 4:
                default:
            }
        }while (cikis);
    }
}
