package temmuz_31;

import java.util.Scanner;

public class soru_1 {
    static String kartNo="123456";
    static String sifre ="1234";
    static Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {
        /*
    ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.


Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.

Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */
        giris();

    }

    public static void giris() {

        System.out.println("KART NUMARASI GIRINIZ:  ");
        String kKartNo=scan.nextLine().replace(" ","");
        System.out.println("SIFRENIZI GIRINIZ:  ");
        String kSifre =scan.next();
        if (kKartNo.equals(kartNo)&& kSifre.equals(sifre)){
            menu();
        }else {
            System.out.println("HATALI GIRIS YAPTINIZ...");
            giris();
        }

    }

    public static void menu() {
        //Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

        System.out.println("*****NUTELLA BANK*****\n"+
                "1. BAKIYE SORGULAMA\n"+
                "2.  PARA YATIRMA\n"+
                "3.  PARA CEKME\n"+
                "4.  PARA GONDERME\n"+
                "5.  SIFRE DEGISTIRME\n"+
                "6.  CIKIS\n" +
                "SECIM:  ");

        int secim = scan.nextInt();
        switch (secim){
            case 1:{
                bakiyeSorgula();
            }
            case 2:{}
            case 3:{}
            case 4:{}
            case 5:{}
            case 6:{}


        }
    }

    public static void bakiyeSorgula() {
    }
}
